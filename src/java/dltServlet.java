import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class dltServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String email = request.getParameter("email");

        try (PrintWriter out = response.getWriter()) {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentregistration", "root", "");

            // Prepare the SQL DELETE statement
            PreparedStatement ps = con.prepareStatement("DELETE FROM registration WHERE email = ?");
            ps.setString(1, email);

            // Execute the update
            int result = ps.executeUpdate();

            // Output the confirmation HTML
            if (result > 0) {
                // Redirect to confirmation page
                response.sendRedirect("delete.html");
            } else {
                out.println("<h2>Error: Account not found!</h2>");
            }

            // Close the connection and statement
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet for deleting an account";
    }
}
