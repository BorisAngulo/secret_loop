
package Vista;

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
public class PanelPerfil extends JPanel{
    
    public JButton btnAtras;
    public JButton btnEditEdad;
    public JButton btnEditDesc;
    public JButton btnPubl;
    public JButton btnChats;
    public JButton btnGrupos;
    
    UsuarioR user;
    public PanelPerfil(UsuarioR user){
        this.user = user;
        setSize(700, 600);
        setLayout(null);
        setBackground(new java.awt.Color(32, 18, 77));        
        iniciarComponentes(); 
    }   
    
    private void iniciarComponentes() {
        iniciarEtiquetas();
        iniciarBotones(); 
        iniciarTexto();
    }

    private void iniciarEtiquetas() {
        JLabel logo = new JLabel();
        ImageIcon imagen = new ImageIcon("src/Imagenes/logo.png");
        logo.setIcon(imagen);
        logo.setBounds(30,30,90, 55);
        logo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH)));
        add(logo);
        
        JLabel titulo = new JLabel();
        titulo.setBounds(300, 15, 100, 50);
        titulo.setText("Perfil");
        titulo.setFont(new Font("",Font.BOLD,40));
        titulo.setForeground(Color.WHITE);
        add(titulo);
        
        JLabel ima = new JLabel();
        ima.setBounds(30, 100, 200, 200);
        ImageIcon imagenDos = new ImageIcon("src/Imagenes/anonimo.png");
        ima.setIcon(imagenDos);
        add(ima);
        
        JLabel primero = new JLabel();
        primero.setBounds(240, 70, 120, 30);
        primero.setText("Intereses");
        primero.setFont(new Font("",Font.BOLD,24));
        primero.setForeground(Color.WHITE);
        primero.setOpaque(true);
        primero.setBackground(new Color(32, 18, 77));
        add(primero);
        
        JLabel segundo = new JLabel();
        segundo.setBounds(480, 70, 180, 40);
        segundo.setText("Rango de Edad");
        segundo.setFont(new Font("",Font.BOLD,24));
        segundo.setForeground(Color.WHITE);
        segundo.setOpaque(true);
        segundo.setBackground(new Color(32, 18, 77));
        add(segundo);
        
        JLabel tercero = new JLabel();
        tercero.setBounds(240, 200, 150, 40);
        tercero.setText("Descripcion");
        tercero.setFont(new Font("",Font.BOLD,24));
        tercero.setForeground(Color.WHITE);
        tercero.setOpaque(true);
        tercero.setBackground(new Color(32, 18, 77));
        add(tercero);
        
        JLabel edad = new JLabel();
        edad.setBounds(460, 120, 220, 50);
        edad.setText(user.getEdad_u());
        edad.setHorizontalAlignment(SwingConstants.CENTER);
        edad.setForeground(Color.WHITE);
        edad.setFont(new Font("arial",Font.BOLD,25));
        edad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        add(edad);
        
        JLabel usuario = new JLabel();
        usuario.setBounds(70, 300, 120, 30);
        usuario.setText(user.getUsuario_u());
        usuario.setFont(new Font("arial",Font.BOLD,20));
        usuario.setOpaque(true);
        usuario.setBackground(new Color(32, 18, 77));
        usuario.setForeground(Color.WHITE);
        add(usuario); 
    }

    private void iniciarTexto() {
        JTextArea primero = new JTextArea();
        primero.setText("Deportes Tecnología Naturaleza Música Animales");
        primero.setFont(new Font("",Font.BOLD,18));
        primero.setEditable(false);
        primero.setLineWrap(true);
        primero.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(primero);
        scroll.setBounds(240, 100, 135, 100);
        add(scroll);
        
        JTextArea segundo = new JTextArea();
        segundo.setText(user.getDescripción_u());
        segundo.setFont(new Font("",Font.BOLD,22));
        segundo.setEditable(false);
        segundo.setLineWrap(true);
        segundo.setWrapStyleWord(true);
        JScrollPane scrollDos = new JScrollPane(segundo);
        scrollDos.setBounds(240, 240, 420, 100);
        add(scrollDos);
        
        JLabel tercero = new JLabel();
        tercero.setBounds(350, 490, 150, 40);
        tercero.setText("CHATS");
        tercero.setFont(new Font("",Font.BOLD,24));
        tercero.setForeground(Color.WHITE);
        tercero.setOpaque(true);
        tercero.setBackground(new Color(32, 18, 77));
        add(tercero);
        
        JLabel cuatro = new JLabel();
        cuatro.setBounds(40, 490, 200, 40);
        cuatro.setText("PUBLICACIONES");
        cuatro.setFont(new Font("",Font.BOLD,24));
        cuatro.setForeground(Color.WHITE);
        cuatro.setOpaque(true);
        cuatro.setBackground(new Color(32, 18, 77));
        add(cuatro);
        
        JLabel quinto = new JLabel();
        quinto.setBounds(540, 490, 150, 40);
        quinto.setText("GRUPOS");
        quinto.setFont(new Font("",Font.BOLD,24));
        quinto.setForeground(Color.WHITE);
        quinto.setOpaque(true);
        quinto.setBackground(new Color(32, 18, 77));
        add(quinto);
    }

    private void iniciarBotones() {
        
        btnAtras = new JButton();
        btnChats = new JButton();
        btnEditDesc = new JButton();
        btnEditEdad = new JButton();
        btnGrupos = new JButton();
        btnPubl = new JButton();
        
        btnAtras.setBounds(300, 540, 100, 30);
        btnAtras.setText("Atras");
        btnAtras.setFont(new Font("",Font.BOLD,20));
        btnAtras.setBackground(Color.WHITE);
        add(btnAtras);
        
        btnEditEdad.setBounds(600, 180,70 , 20);        
        btnEditEdad.setText("Editar");
        btnEditEdad.setHorizontalAlignment(SwingConstants.LEFT);
        btnEditEdad.setOpaque(true);
        btnEditEdad.setBackground(Color.WHITE);
        add(btnEditEdad);
        
        btnEditDesc.setBounds(560, 350,70 , 20);        
        btnEditDesc.setText("Editar");
        btnEditDesc.setHorizontalAlignment(SwingConstants.CENTER);
        btnEditDesc.setOpaque(true);
        btnEditDesc.setBackground(Color.WHITE);
        add(btnEditDesc);

        btnPubl.setBounds(100, 400,80 , 80);        
        btnPubl.setText("prog?");
        btnPubl.setFont(new Font("",Font.BOLD,40));
        btnPubl.setHorizontalAlignment(SwingConstants.CENTER);
        btnPubl.setOpaque(true);
        btnPubl.setBackground(Color.WHITE);
        add(btnPubl);
        
        btnChats.setBounds(350, 400,80 , 80);        
        btnChats.setText("prog?");
        btnChats.setFont(new Font("",Font.BOLD,40));
        btnChats.setHorizontalAlignment(SwingConstants.CENTER);
        btnChats.setOpaque(true);
        btnChats.setBackground(Color.WHITE);
        add(btnChats);

        btnGrupos.setBounds(550, 400,80 , 80);        
        btnGrupos.setText("prog?");
        btnGrupos.setFont(new Font("",Font.BOLD,40));
        btnGrupos.setHorizontalAlignment(SwingConstants.CENTER);
        btnGrupos.setOpaque(true);
        btnGrupos.setBackground(Color.WHITE);
        add(btnGrupos);        
    }
}
