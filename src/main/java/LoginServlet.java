import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user")!=null){
            response.sendRedirect("/login");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String message = "";
        String signInReminder = "";
        String signedInMessage = "";
        boolean validAttempt = username.equals("admin") && password.equals("password");

        if (validAttempt) {
            signedInMessage = "Welcome. Viewing your profile.";
            request.getSession().setAttribute("user",username);
            request.getSession().setAttribute("signedInMessage",signedInMessage);
            response.sendRedirect("/profile");
        } else {
            message = "Username or Password incorrect. Please try again.";
            signInReminder = "Please sign in to view your profile";
            request.setAttribute("message",message);
            request.setAttribute("signInReminder",signInReminder);
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        }
    }
}
