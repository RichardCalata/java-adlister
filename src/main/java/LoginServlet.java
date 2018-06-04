import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet (name = "LoginServlet", urlPatterns = "/ads")
public class LoginServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("ads/index.jsp");
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getMethod().equalsIgnoreCase("post")) {
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            if (username.equals("admin") && password.equals("password")) {
                resp.sendRedirect("ads/index.jsp");
            }
        }
    }
}
