import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;


@WebServlet( name="NameServlet", urlPatterns = "/name")
public class NameServlet  extends HttpServlet {

//    handles GET requests Java
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/greeting.jsp").forward(request,response);

        }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//    handles POST requests Java
        String name = request.getParameter("name");
        name = StringUtils.capitalize(name);

        if(name.isEmpty()){
            name="noName";
        }
        request.setAttribute("name",name);
        request.getRequestDispatcher("/userProfile.jsp").forward(request,response);

    }
}
