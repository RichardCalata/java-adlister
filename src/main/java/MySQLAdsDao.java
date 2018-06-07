//import com.mysql.cj.api.mysqla.result.Resultset;
//import com.mysql.cj.api.mysqla.result.ResultsetRow;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {

        config = new Config();
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String username = config.getUsername();
        String url = config.getUrl();
        String password = config.getPassword();
        connection = DriverManager.getConnection(url, username, password);

//        this.connection = connection;  I think I don't need this
    }
Hello?

    @Override
    public List<Ad> all() {
        Statement stmt;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException( e);
        }
    }


    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException( e);
        }
    }

    public void delete(Ad ad){
        try{
            Statement stmt = connection.createStatement();
            stmt.execute(createDeleteQuery(ad));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String createInsertQuery(Ad ad) {
        return "INSERT INTO ads(user_id, title, description) VALUES "
                + "(" + ad.getUserId() + ", "
                + "'" + ad.getTitle() +"', "
                + "'" + ad.getDescription() + "')";
    }


    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;


    }

    private String createDeleteQuery(Ad ad) {
        return "DELETE FROM ads WHERE id='"+ ad.getId()+ "'";
    }






    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description")
        );
    }

}