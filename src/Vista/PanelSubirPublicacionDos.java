
package Vista;

import Modelo.ImagenPub;
import Modelo.UsuarioR;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author boris
 */
public class PanelSubirPublicacionDos extends JPanel{
    
    public JButton btnAtras;
    public JButton btnPublicar;
    public JButton btnEtiqueta;
    public JButton btnImagen;
    public JButton btnGaleria;
    public JLabel publicacion;
    private JLabel jlIcono;
    public JTextArea txtPublicacion;
    
    public JButton btnAgregarImagenAleatoria;
    public JButton btnSubirAleatoria;
    
    private UsuarioR user;
    private ImagenPub ip;
    
    public PanelSubirPublicacionDos(UsuarioR user, ImagenPub ip){
        setSize(700, 600);
        setBackground(new java.awt.Color(32, 18, 77));
        setLayout(null);
        
        this.user = user;
        this.ip = ip;
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        btnAtras = new JButton("Atras");
        btnPublicar = new JButton("Publicar");
        btnEtiqueta = new JButton("Añadir Etiqueta");
        btnImagen = new JButton("cambiar imagen");
        btnGaleria = new JButton("Galeria");
        publicacion = new JLabel();
        jlIcono = new JLabel();
        txtPublicacion = new JTextArea(ip.getTextoPublicacion());
        btnAgregarImagenAleatoria = new JButton("+");
        btnSubirAleatoria = new JButton("->");
        
        
        btnAtras.setEnabled(true);
        btnAtras.setFont(new Font("arial", 0, 20));
        btnAtras.setBounds(30, 75, 130, 40);
        this.add(btnAtras);
        
        btnPublicar.setEnabled(true);
        btnPublicar.setFont(new Font("arial", 0, 20));
        btnPublicar.setBounds(550, 75, 130, 40);
        this.add(btnPublicar);
     
        btnEtiqueta.setEnabled(true);
        btnEtiqueta.setFont(new Font("arial", 0, 15));
        btnEtiqueta.setBounds(535, 525, 140, 40);
        this.add(btnEtiqueta);
        
        btnImagen.setEnabled(true);
        btnImagen.setFont(new Font("arial", 0, 12));
        btnImagen.setBounds(280, 525, 140, 40);
        this.add(btnImagen);
        
        btnGaleria.setEnabled(true);
        btnGaleria.setFont(new Font("arial", 0, 20));
        btnGaleria.setBounds(30, 525, 140, 40);
        this.add(btnGaleria);
        
        btnAgregarImagenAleatoria.setEnabled(false);
        btnAgregarImagenAleatoria.setBounds(20, 290, 45, 45);
        btnAgregarImagenAleatoria.setBackground(Color.red);
        this.add(btnAgregarImagenAleatoria);
        btnAgregarImagenAleatoria.setVisible(false);
        
        btnSubirAleatoria.setEnabled(false);
        btnSubirAleatoria.setBounds(645, 290, 45, 45);
        btnSubirAleatoria.setBackground(Color.red);
        this.add(btnSubirAleatoria);
        btnSubirAleatoria.setVisible(false);
        
        if(user.getTipoUsuario()== 2){
            btnAgregarImagenAleatoria.setVisible(true);
            btnAgregarImagenAleatoria.setEnabled(true);
            
            btnSubirAleatoria.setVisible(true);
            btnSubirAleatoria.setEnabled(true);
        }
        

        ImageIcon logo = new ImageIcon("src/Imagenes/logo.png");
        jlIcono = new JLabel();
        jlIcono.setBounds(15, 10, 90, 50);
        jlIcono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(90, 50, Image.SCALE_SMOOTH)));
        this.add(jlIcono);
              
        txtPublicacion.setFont(new Font("arial", 0, 25));
        txtPublicacion.setEditable(false);
        txtPublicacion.setLineWrap(true);
        txtPublicacion.setWrapStyleWord(true);
        txtPublicacion.setOpaque(true);
        txtPublicacion.setForeground(Color.white);
        txtPublicacion.setBackground(new Color(0, 0, 0, 1));
        txtPublicacion.setBorder(null);
        JScrollPane scrollDos = new JScrollPane(txtPublicacion);
        scrollDos.setBounds(200, 200, 400, 200);
        scrollDos.setBackground(new Color(0, 0, 0, 1));
        scrollDos.setBorder(null);
        add(scrollDos); 
        
        publicacion.setBounds(125, 125, 450, 350);//450
        this.add(publicacion);
        
        if(user.getTipoUsuario() != 1 && user.getTipoUsuario() != 2){
            btnGaleria.setEnabled(false);
            
        }     
        
    }
}
