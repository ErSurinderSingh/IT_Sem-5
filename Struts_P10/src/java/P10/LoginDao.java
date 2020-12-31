package P10;

import java.sql.*;

public class LoginDao {

    static String URI = "com.mysql.cj.jdbc.Driver",
            URL = "jdbc:mysql://localhost:3306/student",
            uname = "root",
            password = "javaee",
            query = "SELECT * FROM login WHERE UserName=?", dbname, dbpass;

    public static boolean validate(String username, String userpass) {
        boolean status = false;
        try {         
            Class.forName(URI);
            Connection con = DriverManager.getConnection(URL, uname, password);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            //status = rs.next();
            while(rs.next())
                dbpass = rs.getString(3);
            status = dbpass.equals(userpass);
            
        } catch (ClassNotFoundException | SQLException e) {
            
        }
        return status;
    }
}
