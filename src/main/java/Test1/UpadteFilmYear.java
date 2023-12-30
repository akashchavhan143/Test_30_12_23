package Test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpadteFilmYear {
    public static void main(String[] args) {
        String updateQuery="update film_info set film_year=2040 where film_id=1";
        String url="jdbc:mysql://localhost:3306/test_30_12_23";
        String userName="root";
        String password="tiger";
        Connection conn=null;
        try {
            conn= DriverManager.getConnection(url,userName,password);
            Statement stmt= conn.createStatement();
            stmt.executeUpdate(updateQuery);
            System.out.println("Updated Successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
