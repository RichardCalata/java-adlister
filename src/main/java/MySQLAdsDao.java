
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {

        try {
            config = new Config();
            String url = config.getUrl();
            String username = config.getUsername();
            String password = config.getPassword();
            DriverManager.registerDriver(new Driver());
            DriverManager.getConnection(url, username, password);

            this.connection = connection;
        }catch  (SQLException e)
            {throw new RuntimeException("exception",e);

        }
    @Override
    public List<Ad> all() {
        try {
            Statement stmt = this.connection.createStatement();
            ResultSet rs =stmt.executeQuery("SELECT * FROM ads");
          List<Ad> adsFromdbResults = createAdsFromResults(rs);
            return adsFromdbResults;
           }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {

        List<Ad> results = new ArrayList<>();
        while(rs.next()){
            Ad ad = new Ad(
                    rs.getLong("id"),
                    rs.getLong("user_id"),
                    rs.getString("title"),
                    rs.getString("description")
            );
        }
        return results;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }

    @Override
    public void delete(Ad ad) {

    }
}