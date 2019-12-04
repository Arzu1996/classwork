package classwork.web2811.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbOps {
  public static void insert_user(String name, String email) throws SQLException {
    Connection conn = DbConn.get();
    String SQLI = "insert into users (name, email) values (?, ?)";
    PreparedStatement stmt = conn.prepareStatement(SQLI);
    stmt.setString(1, name);
    stmt.setString(2, email);
    stmt.execute();
  }

  public static List<User> get_all_users() throws SQLException {
    Connection conn = DbConn.get();
    String SQLS = "select * from users";
    PreparedStatement stmt = conn.prepareStatement(SQLS);
    ResultSet outcome = stmt.executeQuery();
    ArrayList<User> data = new ArrayList<>();
    while (outcome.next()) {
      int id = outcome.getInt("id");
      String name = outcome.getString("name");
      String email = outcome.getString("email");
      User user = new User(id, name, email);
      data.add(user);
    }
    return data;
  }
}
