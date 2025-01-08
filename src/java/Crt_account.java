import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class Crt_account extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Retrieve form parameters
 String fn = request.getParameter("name");
        String id = request.getParameter("email");
        String pwd = request.getParameter("password");
        String gen = request.getParameter("gender");
        String date = request.getParameter("dob");
        String tel = request.getParameter("telephone");

        try (PrintWriter out = response.getWriter()) {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Database connection
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentregistration", "root", "")) {
                
                // Prepare SQL query to insert data into the 'patient' table
                String query = "INSERT INTO registration1 VALUES (?, ?, ?, ?,?,?)";
                try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, fn);
            ps.setString(2, id);
            ps.setString(3, pwd);
            ps.setString(4, gen);
            ps.setString(5, date);
            ps.setString(6, tel);

                    // Execute the query
                    int rowsAffected = ps.executeUpdate();
                    if (rowsAffected > 0) {
                        out.println("Registration successful!");
                    } else {
                        out.println("Registration failed.");
                    }
                }
            } catch (SQLException e) {
                out.println("Database error: " + e.getMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
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
        return "Servlet to handle user registration";
    }
}