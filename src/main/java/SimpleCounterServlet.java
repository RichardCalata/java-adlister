
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SimpleCounterServlet", urlPatterns = "/counter")

public class SimpleCounterServlet extends HttpServlet {

    //Instance variable used for counting hits on this servlet
    private int iHitCounter;

    /**
     * init method just initializes the hitCounter to zero
     */

    public void init() throws ServletException {
        iHitCounter = 0;
    }

    /**
     * Work horse of this servlet
     * Displays a welcome msg along with hitCounter
     * Increments the hitCounter
     */

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out =  response.getWriter();
        out.println("<h2>Welcome to SimpleCounterServlet.java</h2>");
        out.println("Hits on this servlet so far: "+ (++iHitCounter));
    }

    /**
     * Passes the call to doGet method.
     * Thus, works similar to doGet
     */

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}