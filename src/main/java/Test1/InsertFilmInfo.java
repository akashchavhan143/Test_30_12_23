//package Test1;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class InsertFilmInfo {
//    public static void main(String[] args) {
//        String insertQuery="insert into film_info (film_name,film_year,film_lang,film_rating) values(?,?,?,?);";
//        String url="jdbc:mysql://localhost:3306/test_30_12_23";
//        String userName="root";
//        String password="tiger";
//        Connection conn=null;
//        try {
//            conn= DriverManager.getConnection(url,userName,password);
//            PreparedStatement pstmt=conn.prepareStatement();
//            pstmt.executeUpdate(insertQuery);
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//
//    }
//}
