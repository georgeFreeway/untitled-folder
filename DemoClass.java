import java.sql.*;

public class DemoClass {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql:localhost:3306/project-finale", "root", "Rocketman1");

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select username from users where id=1");

        rs.next();
        String userName = rs.getString(1);
        System.out.println(userName);
    }
}
