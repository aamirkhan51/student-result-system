 package DBCode;
import javax.swing.JOptionPane;
import java.sql.*;
public class DB {
        public static Connection c;
        public static Statement st; 
        public static PreparedStatement ps1,ps2,ps3,ps4,ps5,ps6,ps7;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srs","srs");
            st=c.createStatement();
            ps1=c.prepareStatement("select * from result where roll=?");
            ps2=c.prepareStatement("select * from admin_info where a_id=? and pass=?");
            ps3=c.prepareStatement("insert into result values(?,?,?,?,?,?,?,?)");
            ps4=c.prepareStatement("delete from result where roll=?");
            ps5=c.prepareStatement("update result set roll=?,name=?,fname=?,math=?,eng=?,comp=?,sci=?,sst=? where roll=?");
            ps6=c.prepareStatement("update admin_info set pass=? where a_id=?");
            ps7=c.prepareStatement("select * from result");
            //PreparedStatement ps4=c.prepareStatement("delete from result where id=?");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
}    

