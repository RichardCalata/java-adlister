import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.List;

public class MySQLAdsDao implements Ads {

    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        Config config = new Config();
        String username = config.getUsername();
        String url = config.getUrl();
        String password = config.getPassword();

        Connection connection = DriverManager.getConnection(url, username, password);


        Statement statement = connection.createStatement();

        String query = "SELECT * FROM ads";

        ResultSet resultSet = statement.executeQuery(query);

        while(resultSet.next()){
            System.out.println(resultSet.getString("username"));
        }


    }

    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}