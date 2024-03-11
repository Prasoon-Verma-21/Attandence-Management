import java.sql.*;

public class Check {
    public static void main(String args[]){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String Url="jdbc:mysql://localhost:3306/attendance";
        String user = "root";
        String pass = "Prasoon21v@";

        Connection connection = DriverManager.getConnection(Url,user,pass);
        if(connection.isClosed()){
            System.out.println("Error");
        }else{
            System.out.println("Connected...");
        }
    }catch (Exception e){
        e.printStackTrace();
    }
}
}
