import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet (name = "loginServlet", urlPatterns = "/login")
public class loginServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getMethod().equals("POST")) {
            String username = req.getParameter("name");
//            String password = req.getParameter("password");
            if (username.equalsIgnoreCase("admin")) {
                resp.sendRedirect("/profile");
            }
        }


    }
}
