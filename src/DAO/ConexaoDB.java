package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDB {
    
    public Connection ConectaDB(){
        
        Connection conn = null;
        
        try{
        String URL = "jdbc:mysql://127.0.0.1:3306/esteticaauto?user=root&password=";
        conn = DriverManager.getConnection(URL);
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ConexaoDB" + e.getMessage());
        }
        return conn;
    }
        
}
