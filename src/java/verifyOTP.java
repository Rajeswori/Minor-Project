import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class verifyOTP extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String email = request.getParameter("email");
        String otp = request.getParameter("otp");

        try (PrintWriter out = response.getWriter()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root", "")) {
                String sql = "SELECT * FROM otp WHERE email=? AND otp=?";
                try (PreparedStatement ps = con.prepareStatement(sql)) {
                    ps.setString(1, email);
                    ps.setString(2, otp);
                    ResultSet rs = ps.executeQuery();
                    
                    if (rs.next()) {
                        out.println("OTP verified successfully.");
                        // You can redirect to the login or registration confirmation page
                        // response.sendRedirect("success.html");
                    } else {
                        out.println("Invalid OTP.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                out.println("Database error: " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new ServletException("JDBC Driver not found.", e);
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
        return "Servlet for verifying OTP";
    }
}
