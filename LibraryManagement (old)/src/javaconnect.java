
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    public static Connection ConnecrDb(){
        try{
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	String dbURL = "jdbc:sqlserver://LAPTOP-CH7MSSOI\\SQLEXPRESS:1433;database=Library;user=sa;password= 2121997khai";
        	Connection conn = DriverManager.getConnection(dbURL);
            return conn;
        }
        catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
        }
    }
}
