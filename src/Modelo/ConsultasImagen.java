
package Modelo;

import Vista.PanelPantallaPrincipal;
import com.mysql.jdbc.Connection;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author boris
 */
public class ConsultasImagen extends Conexion{

    public boolean publicarA(ImagenPub imag, UsuarioR user) throws FileNotFoundException {

        PreparedStatement ps;
        Conexion objCon = new Conexion();

        Connection con = objCon.getConexion();
        try {
            ps = con.prepareStatement("INSERT INTO publicaciones (textoPublicacion, idUsuario, imagenPublicacion, "
                    + "idImagenes_guardadas, ocultar, idCategoria) VALUES(?, ?, ?, ?, ?, ?)");
            ps.setString(1, imag.getTextoPublicacion());
            ps.setInt(2, user.getIdUsuario());
            imag.setIdUsuario(user.getIdUsuario());
            ps.setBytes(3, imag.getImagen());
            ps.setInt(4, imag.getIdImagenes_guardadas());
            ps.setInt(5, 0);
            ps.setInt(6, imag.getIdCategoria());
            ps.execute();

            ListaCDE<ImagenPub> listaAux;
            listaAux = CargarImagenes();
            int aux = (listaAux.longitud()) - 1;
            int i = listaAux.acceder(aux).getIdImagen();
            imag.setIdImagen(i);

            ps = con.prepareStatement("INSERT INTO datospublicacion (idUsuario, idPublicacion, likes, dislikes, reportes)"
                    + " VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, user.getIdUsuario());
            ps.setInt(2, imag.getIdImagen());
            ps.setInt(3, imag.getLike());
            ps.setInt(4, imag.getDislike());
            ps.setInt(5, imag.getReportes());
            ps.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ConsultasImagen.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error");
            return false;
        }
        return true;
    }

    public boolean publicarAleatorio(ImagenPub imag) throws FileNotFoundException {

        PreparedStatement ps;
        Conexion objCon = new Conexion();

        Connection con = objCon.getConexion();
        try {
            ps = con.prepareStatement("INSERT INTO imagenes_guardadas (imagen_guardada, idCategoria) VALUES(?, ?)");
            ps.setBytes(1, imag.getImagen());
            ps.setInt(2, imag.getIdCategoria());
            ps.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ConsultasImagen.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error");
            return false;
        }
        return true;
    }
    
    public ListaCDE<byte[]> cargarAleatorio(int idCategoria, ImagenPub imagenAGuardar){
        ListaCDE<byte[]> imagenes = new ListaCDE<>();

        PreparedStatement ps;
        ResultSet rs;
        Conexion objCon = new Conexion();
        

        Connection con = objCon.getConexion();
        try {
            ps = con.prepareStatement("SELECT * FROM imagenes_guardadas WHERE idCategoria = ?");
            ps.setInt(1, idCategoria);
            rs = ps.executeQuery();

            while (rs.next()) {
                byte[] mImagen;
                mImagen = rs.getBytes("imagen_guardada");
                imagenAGuardar.setIdImagenes_guardadas(rs.getInt("idImagenes_guardadas"));
                imagenes.insertar(mImagen);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al cargar imagen aleatoria");
            return null;
        }
        return imagenes;
    }
    
    public byte[] mostrarImagenesAleatorias(ListaCDE<byte[]> lista, JLabel jl, int aux){
        
        if (lista != null) {
            try {
                byte[] imagen = lista.acceder(aux);
                BufferedImage bufferedImage = null;
                InputStream inputStream = new ByteArrayInputStream(imagen);
                bufferedImage = ImageIO.read(inputStream);
                ImageIcon mIcono = new ImageIcon(bufferedImage.getScaledInstance(450, 350, 0));
                jl.setIcon(mIcono);
                
                return imagen;
            } catch (Exception e) {
                System.out.println("no imagen");
                return null;
            }
        }
        return null;
    }
    

    public void mostrarImagenes(ListaCDE<ImagenPub> lista, JLabel jl, int aux, ImagenPub imag) {

        if (lista != null) {
            imag = (ImagenPub) lista.acceder(aux);
            imag.getIdImagen();
            imag.getTextoPublicacion();
            try {
                byte[] imagen = imag.getImagen();
                BufferedImage bufferedImage = null;
                InputStream inputStream = new ByteArrayInputStream(imagen);
                bufferedImage = ImageIO.read(inputStream);
                ImageIcon mIcono = new ImageIcon(bufferedImage.getScaledInstance(450, 350, 0));
                jl.setIcon(mIcono);
            } catch (Exception e) {
                System.out.println("no imagen");
            }
        }
    }

    public ListaCDE<ImagenPub> CargarImagenes() {

        ListaCDE<ImagenPub> imagenes = new ListaCDE<>();

        PreparedStatement ps;
        ResultSet rs;
        Conexion objCon = new Conexion();

        Connection con = objCon.getConexion();
        try {
            ps = con.prepareStatement("SELECT * FROM publicaciones");
            rs = ps.executeQuery();

            while (rs.next()) {
                ImagenPub mImagen = new ImagenPub();
                mImagen.setIdImagen(rs.getInt("idPublicacion"));
                mImagen.setTextoPublicacion(rs.getString("textoPublicacion"));
                mImagen.setImagen(rs.getBytes("imagenPublicacion"));
                mImagen.setIdUsuario(rs.getInt("idUsuario"));
                mImagen.setIdImagenes_guardadas(rs.getInt("idImagenes_guardadas"));
                mImagen.setIdCategoria(rs.getInt("idCategoria"));

                imagenes.insertar(mImagen);

            }
        } catch (Exception e) {
            return null;
        }
        return imagenes;
    }

    public byte[] getImagen(String Ruta) {
        File imagen = new File(Ruta);
        try {
            byte[] icono = new byte[(int) imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
            return icono;
        } catch (Exception ex) {
            return null;
        }
    }

    public int cargarDatos(int aux, ListaCDE<ImagenPub> lista, PanelPantallaPrincipal pp, ImagenPub img, String nombre ) {
        img = lista.acceder(aux);
        
        
        pp.txtPublicacion.setText(img.getTextoPublicacion());
        String l = "" + img.getLike();
        pp.jlLike.setText(l);
        l = "" + img.getDislike();
        pp.jlDislike.setText(l);
        pp.nombre.setText(nombre);
        return img.getIdImagen();
    }
    
    public String obtenerNombre(int id) {
        
        String nombre = "";
        PreparedStatement ps = null;
        ResultSet rs = null;
        java.sql.Connection con = getConexion();
        
        String sql = "SELECT * FROM usuarios WHERE idUsuario = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if (rs.next()) {                
                nombre = rs.getString("nickUsuario");               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuarioR.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error con el codigo de verificar usuario");
            return null;
        }
        return nombre;
    }
    
//    private boolean activoLoD = false;

//    public boolean dioLike(ImagenPub img, boolean activo, boolean otro, int aux, ListaCDE<ImagenPub> lista, PanelPantallaPrincipal pp) {
//        
//        otro = activoLoD;
//        
//        if (otro != true) {
//            if (activo == false) {
//                lista.acceder(aux).setLike(img.getLike() + 1); 
//                cargarDatos(aux, lista, pp, ip);
//                activoLoD = true;
//                return true;
//            } else {
//                lista.acceder(aux).setLike(img.getLike() - 1);
//                cargarDatos(aux, lista, pp);
//                activoLoD = true;
//                return false;
//            }           
//        } else {
//            activoLoD = false;
//            dioDislike(img, activo, activoLoD, aux, lista, pp);
//            
//            return false;
//        }        
//    }
//
//    public boolean dioDislike(ImagenPub img, boolean activo, boolean otro, int aux, ListaCDE<ImagenPub> lista, PanelPantallaPrincipal pp) {
//        
//        otro = activoLoD;
//        
//        if (otro != false) {
//
//            if (activo == false) {
//                lista.acceder(aux).setDislike(img.getDislike() + 1);
//                cargarDatos(aux, lista, pp);
//                return true;
//            } else {
//                lista.acceder(aux).setDislike(img.getDislike() - 1);
//                cargarDatos(aux, lista, pp);
//                return false;
//            }
//        } else {
//            activoLoD = true;
//            dioLike(img, activo, activoLoD, aux, lista, pp);
//            return false;
//        }       
//    }
}
