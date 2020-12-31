package P12;

import java.sql.*;

public class RegisterDao {
    
    static String query = "INSERT INTO REGISTER VALUES(?, ?, ?, ?)";
    public static int save(RegisterAction r) {
        int status = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Oracle", "system", "javaee");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, r.getRoll());
            ps.setString(2, r.getContact());
            ps.setString(3, r.getName());
            ps.setString(4, r.getDob());

            status = ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.toString());
        }
        return status;
    }
}
