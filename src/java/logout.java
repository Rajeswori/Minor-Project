import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONObject;

public class logout extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        
        if (session != null) {
            session.invalidate(); // Invalidates the session to log the user out
        
        }
            response.sendRedirect("index.html");
        
        // Send a JSON response indicating logout success
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("status", "success");
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(jsonResponse.toString());
    }
}
