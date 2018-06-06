import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet(name = "DeleteAdsServlet", urlPatterns = "/ads/delete")
public class DeleteAdsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/ads.jsp")
                .forward(req, resp);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ad ad = new Ad(1,
                request.getParameter()
                )
        try {
            DaoFactory.getAdsDao().delete(Ad.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("/ads");

    }
}
