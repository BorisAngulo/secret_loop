
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
/**
 *
 * @author boris
 */
public class PanelContactanos extends JPanel{
    
    public JButton btnAtras;
    
    private JTextArea contactanos;
    private JTextArea ultimo;
    private JLabel logo;
    private JLabel titulo;
    private JLabel primero;
    
    public PanelContactanos(){
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
        logo = new JLabel();
        titulo = new JLabel();
        primero = new JLabel();
        
        ImageIcon imagen = new ImageIcon("src/Imagenes/logo.png");
        logo.setIcon(imagen);
        logo.setBounds(20,20,90, 55);
        logo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH)));
        add(logo);
        
        
        titulo.setText("CONTACTANOS");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("",Font.BOLD,30));
        titulo.setBounds(200, 20, 280, 50); 
        titulo.setBackground(new java.awt.Color(32, 18, 77));
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(true);
        add(titulo);
        
        
        primero.setText("ScreetLoop:");
        primero.setHorizontalAlignment(SwingConstants.CENTER);
        primero.setFont(new Font("",Font.BOLD,20));
        primero.setBounds(110, 350, 120, 30); 
        primero.setOpaque(true);
        primero.setBackground(new Color(32, 18, 77));
        primero.setForeground(Color.white);
        add(primero);
    }

    private void iniciarBotones() {
        
        btnAtras = new JButton();
       
        btnAtras.setText("Atras");
        btnAtras.setHorizontalAlignment(SwingConstants.CENTER);
        btnAtras.setFont(new Font("",Font.BOLD,20));
        btnAtras.setBounds(300, 500, 100, 50);         
        add(btnAtras); 
    }

    private void iniciarTexto() {
        contactanos = new JTextArea();
        ultimo = new JTextArea();
        
        contactanos.setBounds(80, 100, 550, 235);
        contactanos.setEditable(false);
        contactanos.setText("Para dudas y sugerencias b\u00fascanos en nuestras redes:"+
            "\nbrainstorm.loop@gmail.com" +
            " https://sites.google.com/est.umss.edu/brainstorm-loop"+
            "\nPonte en contacto con nuestros desarrolladores;"+
            "\n- Angulo Urquieta Boris Anthony +591 78945615" +
            "\n- Ayaviri Rodriguez Daniel Caleb +591 79461326" +
            "\n- Cabero Torrico Gabriel +591 69874123" +
            "\n- Hualca Yavi Lizbeth +591 63214789" +
            "\n- Quinteros Bohorquez Litzi +591 68423519");
        contactanos.setLineWrap(true);
        contactanos.setWrapStyleWord(true);
        contactanos.setFont(new Font("",Font.BOLD,20));
        add(contactanos);
        
        
        ultimo.setBounds(80, 400, 550, 65);
        ultimo.setEditable(false);
        ultimo.setText("Somos un aplicación divertida y entretenida, nos gusta mantener un nivel alto de calidad y respeto.");
        ultimo.setLineWrap(true);
        ultimo.setWrapStyleWord(true);
        ultimo.setFont(new Font("",Font.BOLD,20));
        add(ultimo);
    }

}
