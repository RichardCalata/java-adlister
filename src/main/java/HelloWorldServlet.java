import javax.print.Doc;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//public class HelloWorldServlet extends HttpServlet {
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<h1>Hello, World!</h1>");
//
//    }
//
//}


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException { response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<style>\n" +
                "body {\n" +
                "    background-color: linen;\n" +
                "}\n" +
                "\n" +
                "h1 {\n" +
                "    color: blue;\n" +
                "    font-family: helvetica, arial, sans-serif;\n "  +
                "    margin-left: 40px;\n" +
                "} \n" +
                "</style><h1 ><strong>Hello, World!</strong></h1>");
            out.println("<h1>What's your name?");
            Scanner input  = new Scanner(System.in);
            String userResponse = input.next();
            out.println("<h1>Hello"+ userResponse);


        }




}