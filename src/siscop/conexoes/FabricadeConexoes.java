package siscop.conexoes;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RSF
 */
public class FabricadeConexoes {
    
    public static Connection getConexao(){
        Connection conexao = null;
        try {
            conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/siscop", "root", "rsf90");
        } catch (SQLException ex) {
            Logger.getLogger(FabricadeConexoes.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return conexao;
        
    }
    
    public static void fecharConexao(Connection con, Statement stm){
         try {
            con.close();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(FabricadeConexoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
