
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class ConexionBD {
    
   // static String url = "jdbc:mysql://localhost:3306/clinica?verifyServerCertificate=false&useSSL=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    //static String user = "root";
    //static String pass = ""; //compu auxiliar mysql
       private static String bd = "clinica"; // Nombre de BD.
    public static final String user="root";
    public static final String password="";
    private static String driver = "com.mysql.jdbc.Driver";
     private static String server = "jdbc:mysql://localhost/" + bd;
    public Connection getConnection() throws SQLException{
        
        Connection con = null;
        
        try {
            
            Class.forName(driver);
            con = DriverManager.getConnection(server, user, password);
            System.out.print("exito");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
        
    }
}
