package Modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author boris
 */
public class ConsultaUsuarioR extends Conexion {
    
    public boolean registrar(UsuarioR u, String user, PalabrasProhibidas pp) {
        
        if (pp.filtro(user) == true) {
            if (verificarUsuarioDoble(user) == false) {
                
                PreparedStatement ps = null;
                Connection con = getConexion();
                
                String sql = "INSERT INTO usuarios (nickUsuario, tipoUsuario, nombreRegistrado, contraseña, rango_de_edad,"
                        + " descripcionUsuario) "
                        + "VALUES(?, ?, ?, ?, ?, ?)";
                
                try {
                    ps = con.prepareStatement(sql);
                    ps.setString(1, u.getUsuario_u());
                    ps.setString(3, u.getNombre_u());
                    ps.setString(4, u.getContrasenia_u());
                    ps.setString(6, u.getDescripción_u());
                    ps.setString(5, u.getEdad_u());
                    ps.setInt(2, 1);
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
            } else {
                JOptionPane.showMessageDialog(null, "Ese usuario ya existe pruebe otro");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "su usuario contiene una palabra prohibida");
            return false;
        }
    }
    
    public boolean login(UsuarioR u) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT idUsuario, nickUsuario, tipoUsuario, nombreRegistrado, contraseña, rango_de_edad, descripcionUsuario "
                + "FROM usuarios WHERE nickUsuario = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario_u());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (u.getContrasenia_u().equals(rs.getString(5))) {
                    
                    u.setIdUsuario(rs.getInt(1));
                    u.setTipoUsuario(rs.getInt(3));
                    u.setNombre_u(rs.getString(4));
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
    
    public boolean loginUserAnonimo(UsuarioR u) {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO usuarios (nickUsuario, tipoUsuario, nombreRegistrado, contraseña, rango_de_edad, descripcionUsuario, "
                + "fechaUsuario)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        u.setUsuario_u("userAn00" + num() + "00#");
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario_u());
            ps.setInt(2, 0);
            ps.setString(3, null);
            ps.setString(4, null);
            ps.setString(5, null);
            ps.setString(6, null);
            ps.setTime(7, null);
            ps.execute();
            
            if(loginAnonimo(u)){
                JOptionPane.showMessageDialog(null, "eres el usuario:" + u.getUsuario_u());
            }else{
                JOptionPane.showMessageDialog(null, "error al ingresar usuario anónimo");
            }           
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

    public String obtenerNombre(int id) {
        
        String nombre = "";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT * FROM usuarios WHERE idUsuario = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if (rs.next()) {                
                nombre = rs.getString(2);               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuarioR.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error con el codigo de verificar usuario");
            return null;
        }
        return nombre;
    }
    
    private boolean verificarUsuarioDoble(String user) {
        int aux = 0;
        
        ArrayList<String> lista = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM usuarios";
        
        try {
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                lista.add(rs.getString(2));
                if (user.contains(lista.get(aux))) {
                    return true;
                }
                aux++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuarioR.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error con el codigo de verificar usuario");
        }
        return false;
    }
    
    private int num() {
        int num;
        Random ran = new Random();
        
        num = ran.nextInt(100);
        
        return num;
    }
    
    private boolean loginAnonimo(UsuarioR u) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT idUsuario, nickUsuario, tipoUsuario, nombreRegistrado, contraseña, rango_de_edad, descripcionUsuario "
                + "FROM usuarios WHERE nickUsuario = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario_u());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                    u.setIdUsuario(rs.getInt(1));
                    u.setTipoUsuario(rs.getInt(3));
                    u.setNombre_u(rs.getString(4));
                    u.setEdad_u(rs.getString(6));
                    u.setDescripción_u(rs.getString(7));
                    return true;
            }
            return false;
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaUsuarioR.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error con el codigo de verificar usuario");
            return false;
        }
    }
}
