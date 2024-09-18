
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
 * @author Gabriel
 */
public class ConsultasPerfil {
    public boolean login(UsuarioR u) {
        Conexion con2 = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = con2.getConexion();

        String sql = "SELECT idUsuario, nickUsuario, tipoUsuario, nombreRegistrado, contraseña, rango_de_edad, descripcionUsuario "
                + "FROM usuarios WHERE nickUsuario = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario_u());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (u.getContrasenia_u().equals(rs.getString(5))) {

                    u.setIdUsuario(rs.getInt(1));
                    u.setTipoUsuario(3);
                    u.setNombre_u(rs.getString(3));
                    u.setEdad_u(rs.getString(6));
                    u.setDescripción_u(rs.getString(7));
                    return true;
                } else {
                    return false;
                }
            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuarioR.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error con el codigo de verificar usuario");
            return false;
        }
    }

}