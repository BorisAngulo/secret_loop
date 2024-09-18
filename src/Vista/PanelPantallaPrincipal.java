
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
import javax.swing.SwingConstants;

/**
 *
 * @author boris
 */
public class PanelPantallaPrincipal extends JPanel{
    
    public JButton btnSalir;
    public JButton btnIntereses;
    public JButton btnAyuda;
    public JButton btnGrupoUsuarios;
    public JButton btnBuscar;
    public JButton btnReportar;
    public JButton btnComentar;
    public JButton btnLike;
    public JButton btnDislike;
    public JButton btnAnterior;
    public JButton btnSiguiente;
    public JButton btnSubirPublicacion;
    public JButton btnChat;
    public JButton btnPerfil;
    
    private JLabel jlIcono;
    public JLabel jlLike;
    public JLabel jlDislike;
    public JLabel nombre;
    public JLabel publicacion;
    public JTextArea txtPublicacion;
    
    
    private UsuarioR user;
    private ImagenPub ip;
    
    public PanelPantallaPrincipal(UsuarioR user, ImagenPub ip){
        setSize(700, 600);
        setLayout(null);
        setBackground(new java.awt.Color(32, 18, 77));
        
        this.user = user;
        this.ip = ip;
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        iniciarBotones();
        iniciarLabel();
    }
    
    private void iniciarBotones(){
        btnSalir = new JButton();
        btnIntereses = new JButton();
        btnAyuda = new JButton();
        btnGrupoUsuarios = new JButton();
        btnBuscar = new JButton();
        btnReportar = new JButton();
        btnComentar = new JButton();
        btnLike = new JButton();
        btnDislike = new JButton();
        btnAnterior = new JButton();
        btnSiguiente = new JButton();
        btnSubirPublicacion = new JButton();
        btnChat = new JButton();
        btnPerfil = new JButton();
        
        btnGrupoUsuarios.setText("Grupos de Usuarios");
        btnGrupoUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
        btnGrupoUsuarios.setFont(new Font("",Font.BOLD,12));
        btnGrupoUsuarios.setBackground(new java.awt.Color(159, 197, 248));
        btnGrupoUsuarios.setBounds(200, 20, 150, 30);        
        add(btnGrupoUsuarios); 
        
        btnIntereses.setText("Intereses");
        btnIntereses.setHorizontalAlignment(SwingConstants.CENTER);
        btnIntereses.setFont(new Font("",Font.BOLD,12));
        btnIntereses.setBackground(Color.WHITE);
        btnIntereses.setBounds(350, 20, 90, 30);        
        add(btnIntereses); 
        
        btnAyuda.setText("Ayuda");
        btnAyuda.setHorizontalAlignment(SwingConstants.CENTER);
        btnAyuda.setFont(new Font("",Font.BOLD,12));
        btnAyuda.setBackground(Color.WHITE);
        btnAyuda.setBounds(440, 20, 70, 30);        
        add(btnAyuda); 
        
        btnSalir.setText("Salir");
        btnSalir.setHorizontalAlignment(SwingConstants.CENTER);
        btnSalir.setFont(new Font("",Font.BOLD,12));
        btnSalir.setBackground(Color.WHITE);
        btnSalir.setBounds(510, 20, 70, 30);        
        add(btnSalir);
        
        ImageIcon busc = new ImageIcon("src/Imagenes/buscar.png");
        btnBuscar.setBackground(new java.awt.Color(32, 18, 77));
        btnBuscar.setBounds(615, 20, 50, 50);
        btnBuscar.setIcon(busc);
        btnBuscar.setBorderPainted(false);
        add(btnBuscar);
        
        ImageIcon rep = new ImageIcon("src/Imagenes/Bandera.png");       
        btnReportar.setBackground(new java.awt.Color(32, 18, 77));
        btnReportar.setBounds(500, 400, 50, 50);
        btnReportar.setIcon(rep);
        btnReportar.setText("");
        btnReportar.setForeground(Color.white);
        btnReportar.setFont(new Font("", 0, 15));
        btnReportar.setBorderPainted(false);
        add(btnReportar);
        
        ImageIcon com = new ImageIcon("src/Imagenes/Comentar.png");       
        btnComentar.setBackground(new java.awt.Color(32, 18, 77));
        btnComentar.setBounds(390, 400, 50, 50);
        btnComentar.setIcon(com);
        btnComentar.setText("");
        btnComentar.setForeground(Color.white);
        btnComentar.setFont(new Font("", 0, 15));
        btnComentar.setBorderPainted(false);
        add(btnComentar);
        
        ImageIcon like = new ImageIcon("src/Imagenes/Like .png");
        btnLike.setBackground(new java.awt.Color(32, 18, 77));
        btnLike.setBounds(150, 400, 50, 50);
        btnLike.setIcon(like);
        btnLike.setBorderPainted(false);
        add(btnLike);
        
        ImageIcon dislike = new ImageIcon("src/Imagenes/Dislike.png");
        btnDislike.setBackground(new java.awt.Color(32, 18, 77));
        btnDislike.setBounds(275, 400, 50, 50);
        btnDislike.setIcon(dislike);
        btnDislike.setBorderPainted(false);
        add(btnDislike);
        
        btnAnterior.setText("Ant");
        btnAnterior.setHorizontalAlignment(SwingConstants.CENTER);
        btnAnterior.setFont(new Font("",Font.BOLD,15));
        btnAnterior.setBackground(Color.WHITE);
        btnAnterior.setBounds(20, 530, 120, 50);        
        add(btnAnterior);
        
        btnSiguiente.setText("Sig");
        btnSiguiente.setHorizontalAlignment(SwingConstants.CENTER);
        btnSiguiente.setFont(new Font("",Font.BOLD,15));
        btnSiguiente.setBackground(Color.WHITE);
        btnSiguiente.setBounds(560, 530, 120, 50);        
        add(btnSiguiente); 
        
        ImageIcon chat = new ImageIcon("src/Imagenes/Mensaje.png");
        btnChat.setBackground(new java.awt.Color(32, 18, 77));
        btnChat.setBounds(220, 530, 50, 50);
        btnChat.setIcon(chat);
        btnChat.setBorderPainted(false);
        add(btnChat);
        
        ImageIcon pub = new ImageIcon("src/Imagenes/Más .png");
        btnSubirPublicacion.setBackground(new java.awt.Color(32, 18, 77));
        btnSubirPublicacion.setBounds(320, 530, 50, 50);
        btnSubirPublicacion.setIcon(pub);
        btnSubirPublicacion.setBorderPainted(false);
        add(btnSubirPublicacion);
        
        ImageIcon perfil = new ImageIcon("src/Imagenes/User.png");
        btnPerfil.setBackground(new java.awt.Color(32, 18, 77));
        btnPerfil.setBounds(420, 530, 50, 50);
        btnPerfil.setIcon(perfil);
        btnPerfil.setBorderPainted(false);
        add(btnPerfil);       
        
        if(user.getTipoUsuario() == 0){
            btnGrupoUsuarios.setEnabled(false);
            btnPerfil.setEnabled(false);
            btnReportar.setEnabled(false);
        }
    }
    
    private void iniciarLabel(){
        
        jlLike = new JLabel();
        jlDislike = new JLabel();
        nombre = new JLabel();
        publicacion = new JLabel();
        txtPublicacion = new JTextArea(ip.getTextoPublicacion());
        
        ImageIcon logo = new ImageIcon("src/Imagenes/logo.png");
        jlIcono = new JLabel();
        jlIcono.setBounds(15, 10, 90, 50);
        jlIcono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(90, 50, Image.SCALE_SMOOTH)));
        this.add(jlIcono);
        
        jlLike.setText("");
        jlLike.setBounds(220, 400, 50, 50);
        jlLike.setFont(new Font("", 1, 30));
        jlLike.setForeground(Color.WHITE);
        jlLike.setBackground(new java.awt.Color(32, 18, 77));
        this.add(jlLike);
        
        jlDislike.setText("");
        jlDislike.setBounds(340, 400, 50, 50);
        jlDislike.setFont(new Font("", 1, 30));
        jlDislike.setForeground(Color.WHITE);
        jlDislike.setBackground(new java.awt.Color(32, 18, 77));
        this.add(jlDislike);
        
        nombre.setBounds(125, 85, 200, 30);
        nombre.setForeground(Color.WHITE);
        nombre.setBackground(new java.awt.Color(32, 18, 77));
        nombre.setFont(new Font("", 1, 15));
        this.add(nombre);
        
        txtPublicacion.setFont(new Font("arial", 0, 25));
        txtPublicacion.setEditable(false);
        txtPublicacion.setLineWrap(true);
        txtPublicacion.setWrapStyleWord(true);
        txtPublicacion.setOpaque(true);
        txtPublicacion.setForeground(Color.white);
        txtPublicacion.setBackground(new Color(0, 0, 0, 1));
        txtPublicacion.setBorder(null);
        JScrollPane scrollDos = new JScrollPane(txtPublicacion);
        scrollDos.setBounds(200, 200, 300, 200);
        scrollDos.setBackground(new Color(0, 0, 0, 1));
        scrollDos.setBorder(null);
        this.add(scrollDos); 
        
        publicacion.setBounds(125, 125, 450, 350);//450
        publicacion.setVisible(true);
        this.add(publicacion);
    }
}
