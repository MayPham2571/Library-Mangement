import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnectNgoc {
    Connection conn;
    public static Connection ConnecrDb(){
        try{
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	String url = "jdbc:sqlserver:DESKTOP-U4LQ529\\SQLEXPRESS (SQL Server 10.50.4000 - sa);databaseName=NewBook;user=sa;password= 1234678";
        	Connection conn = DriverManager.getConnection(url);
            return conn;
        }
        catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
        }
    }
}
