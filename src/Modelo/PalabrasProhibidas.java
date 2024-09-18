
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author boris
 */
public class PalabrasProhibidas extends Conexion{
    private ListaSE<String> lista = new ListaSE<>();
    
    public PalabrasProhibidas(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT * FROM palabras_malas";
        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                lista.insertar(rs.getString(2));                            
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuarioR.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error con la base de datos palabras_malas");
        }
    }
    
    public boolean filtro(String texto){
        boolean answer = true;
        String aux = texto;
        
        palabra(aux);
        
        for(int i = 0; i < lista.longitud(); i++){
            if(aux.contains(lista.acceder(i))){
                answer = false;
            }        
        }
        
        return answer;
    }
    
    private String palabra(String cadena) {        
        return cadena.toLowerCase().replace(" ","");
    } 
}
