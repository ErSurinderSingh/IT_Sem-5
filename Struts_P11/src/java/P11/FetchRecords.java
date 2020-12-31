package P11;

import java.sql.*;
import java.util.ArrayList;

public class FetchRecords {

    ArrayList<User> list = new ArrayList<>();

    public ArrayList<User> getList() {
        return list;
    }

    public void setList(ArrayList<User> list) {
        this.list = list;
    }
    String URI = "com.mysql.cj.jdbc.Driver",
            URL = "jdbc:mysql://localhost:3306/student",
            uname = "root",
            password = "javaee",
            query = "SELECT * FROM users";

    public String execute() {
        try {
            Class.forName(URI);
            Connection con = DriverManager.getConnection(URL, uname, password);
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setRoll(rs.getString(1));
                user.setName(rs.getString(3));
                user.setDob(rs.getString(4));
                user.setContact(rs.getString(2));
                list.add(user);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "success";
    }
}
