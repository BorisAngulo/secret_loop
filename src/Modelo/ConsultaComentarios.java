package Modelo;

import Vista.PanelComentarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author boris
 */
public class ConsultaComentarios extends Conexion {

    public ListaCDE<Comentarios> cargarComentarios(ListaCDE<Comentarios> lista,int aux) {
     
        PreparedStatement ps;
        ResultSet rs;
        Conexion objCon = new Conexion();

        com.mysql.jdbc.Connection con = objCon.getConexion();
        try {
            ps = con.prepareStatement("SELECT * FROM comentarios WHERE idPublicacion = ?");
            ps.setInt(1, aux);
            rs = ps.executeQuery();
            while (rs.next()) {
                Comentarios comentario = new Comentarios();
                comentario.setComentario(rs.getString("comentario"));
                comentario.setIdComentario(rs.getInt("idComentario"));
                comentario.setIdPublicacion(rs.getInt("idPublicacion"));
                comentario.setIdUsuario(rs.getInt("idUsuario"));
                lista.insertar(comentario);             
            }            
            return lista;
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error");
            return null;
        }
    }
//    lista.longitud()
    public PanelComentarios mostrarComentarios(ListaCDE<Comentarios> lista, PanelComentarios pc, ConsultasImagen img){
        String com = "";
        String actual;
        String nombre;
        for(int i = 0; i < lista.longitud(); i++){
            nombre  = img.obtenerNombre(lista.acceder(i).getIdUsuario());
            actual = nombre + ": " +lista.acceder(i).getComentario();
            com += ("\n" + actual);
            pc.txtChat.setText(com);
        }
        return pc;
    }

    public boolean comentar(Comentarios comentario) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO comentarios (comentario, idPublicacion, idUsuario) "
                + "VALUES(?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, comentario.getComentario());
            ps.setInt(2, comentario.getIdPublicacion());
            ps.setInt(3, comentario.getIdUsuario());
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
}
