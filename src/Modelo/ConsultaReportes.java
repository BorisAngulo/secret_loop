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
public class ConsultaReportes extends Conexion {

    public boolean mandarReporte(ImagenPub ima, int reportes) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        reportes += 1;

        String sql = "UPDATE datosPublicacion SET reportes=" + reportes + " WHERE idDatosPublicacion = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ima.getIdImagen());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public int obtenerReportes(ImagenPub ima) {
        int i = 0;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT reportes "
                + "FROM datosPublicacion WHERE idDatosPublicacion =?";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, ima.getIdImagen());
            rs = ps.executeQuery();

            if (rs.next()) {

                
                ima.setReportes(rs.getInt(1));
                i = ima.getReportes();
                return i;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuarioR.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error con el codigo de verificar conSultas Reportes");
            return 0;
        }
        return i;
    }
}
