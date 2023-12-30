package Test1;

import java.sql.*;

public class DislplayInfo {
    public static void main(String[] args) {
        String displayQuery="select * from film_info where film_rating>(select avg(film_rating) from film_info) ;";
        String url="jdbc:mysql://localhost:3306/test_30_12_23";
        String userName="root";
        String password="tiger";
        Connection conn=null;
        try {
            conn= DriverManager.getConnection(url,userName,password);
            Statement stmt= conn.createStatement();
            ResultSet rs=stmt.executeQuery(displayQuery);
            while (rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getDouble(5));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
