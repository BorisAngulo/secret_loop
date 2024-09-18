
package Vista;

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
public class PanelPerfilGrupo extends JPanel{
    
    public JButton btnAtras;
    public JButton btnIniciarChat;
    public JButton btnSolicitud;
    
    public JTextArea txtIntegrantes;
    public JTextArea txtDescripcion;
    
    private JLabel titulo;
    private JLabel marca;
    private JLabel ima;
    private JLabel primero;
    private JLabel segundo;
    private JLabel tercero;
    private JLabel cuarto;
    private JLabel quinto;
    private JLabel sexto;
    
    public PanelPerfilGrupo(){
        setSize(700, 600);
        setLayout(null);
        setBackground(new java.awt.Color(32, 18, 77));        
        iniciarComponentes(); 
    }  
           
    private void iniciarComponentes() {
        iniciarEtiquetas();
        iniciarBotonoes();
        iniciarTexto();
    }

    private void iniciarEtiquetas() {  
        
        titulo = new JLabel();
        marca = new JLabel();
        ima = new JLabel();
        primero = new JLabel();
        segundo = new JLabel();
        tercero = new JLabel();
        cuarto = new JLabel();
        quinto = new JLabel();
        sexto = new JLabel();
        
        
        titulo.setText("DE PIES A CABEZA");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("",Font.BOLD,25));
        titulo.setBounds(180, 30, 280, 50); 
        titulo.setOpaque(true);
        this.add(titulo);
        
        
        ImageIcon imagen = new ImageIcon("src/Imagenes/logo.png");        
        marca.setIcon(imagen);
        marca.setBounds(30,30,90, 55);
        marca.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(90, 55, Image.SCALE_SMOOTH)));
        this.add(marca);
        
        
        ima.setBounds(50, 100, 180, 180);
        ImageIcon imagenDos = new ImageIcon("src/Imagenes/imagenes_categorias/deporte_1.jpg");
        ima.setIcon(new ImageIcon(imagenDos.getImage().getScaledInstance(ima.getWidth(), ima.getHeight(), Image.SCALE_SMOOTH)));
        this.add(ima);
        
        primero.setText("ADMINISTRADOR");
        primero.setHorizontalAlignment(SwingConstants.CENTER);
        primero.setFont(new Font("",Font.BOLD,20));
        primero.setBounds(250,100, 180, 25); 
        primero.setOpaque(true);
        primero.setBackground(new Color(32, 18, 77));
        primero.setForeground(Color.white);
        this.add(primero);
        

        segundo.setText("INTEGRANTES");
        segundo.setHorizontalAlignment(SwingConstants.CENTER);
        segundo.setFont(new Font("",Font.BOLD,20));
        segundo.setBounds(480,100, 150, 25); 
        segundo.setOpaque(true);
        segundo.setBackground(new Color(32, 18, 77));
        segundo.setForeground(Color.white);
        this.add(segundo);
        

        tercero.setText("Mario4568");
        tercero.setHorizontalAlignment(SwingConstants.CENTER);
        tercero.setFont(new Font("",Font.BOLD,17));
        tercero.setBounds(250, 180, 180, 50); 
        tercero.setOpaque(true);
        this.add(tercero);     
        

        cuarto.setText("Etiqueta");
        cuarto.setHorizontalAlignment(SwingConstants.CENTER);
        cuarto.setFont(new Font("",Font.BOLD,20));
        cuarto.setBounds(50, 300, 100, 20); 
        cuarto.setOpaque(true);
        cuarto.setBackground(new Color(32, 18, 77));
        cuarto.setForeground(Color.white);
        this.add(cuarto); 
        

        quinto.setText("Tecnologia");
        quinto.setHorizontalAlignment(SwingConstants.CENTER);
        quinto.setFont(new Font("",Font.BOLD,17));
        quinto.setBounds(150, 300, 130, 20); 
        quinto.setOpaque(true);
        this.add(quinto); 
        

        sexto.setText("Descripcion");
        sexto.setHorizontalAlignment(SwingConstants.CENTER);
        sexto.setFont(new Font("",Font.BOLD,20));
        sexto.setBounds(50, 330, 130, 20); 
        sexto.setOpaque(true);
        sexto.setBackground(new Color(32, 18, 77));
        sexto.setForeground(Color.white);
        this.add(sexto); 
    }

    private void iniciarBotonoes() {
        
        btnAtras = new JButton();
        btnIniciarChat = new JButton();
        btnSolicitud = new JButton();
        
        btnAtras.setText("Atras");
        btnAtras.setHorizontalAlignment(SwingConstants.CENTER);
        btnAtras.setFont(new Font("",Font.BOLD,20));
        btnAtras.setBounds(70, 540, 100, 25);         
        this.add(btnAtras); 
        
        btnIniciarChat.setText("Iniciar Chats");
        btnIniciarChat.setHorizontalAlignment(SwingConstants.CENTER);
        btnIniciarChat.setFont(new Font("",Font.BOLD,18));
        btnIniciarChat.setBounds(70, 500, 160, 25);         
        this.add(btnIniciarChat); 
        
        btnSolicitud.setText("Mandar Solicitud");
        btnSolicitud.setHorizontalAlignment(SwingConstants.CENTER);
        btnSolicitud.setFont(new Font("",Font.BOLD,20));
        btnSolicitud.setBounds(480, 510, 195, 25);         
        this.add(btnSolicitud);         
    }

    private void iniciarTexto() {
        
        txtIntegrantes = new JTextArea();
        txtDescripcion = new JTextArea();
        
        txtIntegrantes.setText("Mario4568 \njulianTRES \nJuean111 \nJianCarlos \nmario sans \npedro aldunate \nrexxarrr");
        txtIntegrantes.setEditable(false);
        txtIntegrantes.setLineWrap(true);
        txtIntegrantes.setWrapStyleWord(true);
        txtIntegrantes.setFont(new Font("",Font.BOLD,17));
        JScrollPane scroll = new JScrollPane(txtIntegrantes);
        scroll.setBounds(480, 130, 180, 130);
        add(scroll);
        
        txtDescripcion.setText("LAS COSAS SON DE LA VIDA");
        txtDescripcion.setEditable(false);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setFont(new Font("",Font.BOLD,17));
        JScrollPane scrollDos = new JScrollPane(txtDescripcion);
        scrollDos.setBounds(50, 360, 605, 125);
        add(scrollDos);
    }
}
