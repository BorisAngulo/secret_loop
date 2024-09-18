
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
/**
 *
 * @author boris
 */
public class PanelAjusteCuenta extends JPanel{
    public JButton btnAtras;
    
    public PanelAjusteCuenta(){
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
        logo.setBounds(20,20,90, 55);
        logo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH)));
        add(logo);
        
        JLabel titulo = new JLabel();
        titulo.setText("Ajustes de la cuenta");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("",Font.BOLD,30));
        titulo.setBounds(200, 30, 300, 30); 
        titulo.setBackground(new java.awt.Color(32, 18, 77)); 
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(true);
        add(titulo);
        
        
        JLabel primero = new JLabel();
        primero.setText("Acceso de cuenta:");
        primero.setHorizontalAlignment(SwingConstants.LEFT);
        primero.setFont(new Font("",Font.BOLD,20));
        primero.setBounds(110, 80, 180, 30); 
        primero.setOpaque(true);
        primero.setBackground(new Color(32, 18, 77));
        primero.setForeground(Color.white);
        add(primero);
        
        JLabel segundo = new JLabel();
        segundo.setText("Nombre Único:");
        segundo.setHorizontalAlignment(SwingConstants.LEFT);
        segundo.setFont(new Font("",Font.BOLD,20));
        segundo.setBounds(110, 160, 180, 30); 
        segundo.setOpaque(true);
        segundo.setBackground(new Color(32, 18, 77));
        segundo.setForeground(Color.white);
        add(segundo);
        
        JLabel tercero = new JLabel();
        tercero.setText("Nickname:");
        tercero.setHorizontalAlignment(SwingConstants.LEFT);
        tercero.setFont(new Font("",Font.BOLD,20));
        tercero.setBounds(110, 240, 180, 30); 
        tercero.setOpaque(true);
        tercero.setBackground(new Color(32, 18, 77));
        tercero.setForeground(Color.white);
        add(tercero);
        
        JLabel cuarto = new JLabel();
        cuarto.setText("Rango de Edad:");
        cuarto.setHorizontalAlignment(SwingConstants.LEFT);
        cuarto.setFont(new Font("",Font.BOLD,20));
        cuarto.setBounds(110, 320, 180, 30); 
        cuarto.setOpaque(true);
        cuarto.setBackground(new Color(32, 18, 77));
        cuarto.setForeground(Color.white);
        add(cuarto);
        
        JLabel quinto = new JLabel();
        quinto.setText("Descripción:");
        quinto.setHorizontalAlignment(SwingConstants.LEFT);
        quinto.setFont(new Font("",Font.BOLD,20));
        quinto.setBounds(110, 400, 180, 30); 
        quinto.setOpaque(true);
        quinto.setBackground(new Color(32, 18, 77));
        quinto.setForeground(Color.white);
        add(quinto);
    }

    private void iniciarTexto() {
        JLabel primero = new JLabel();
        primero.setText("Disponer de una contraseña y un nombre de usuario");
        primero.setHorizontalAlignment(SwingConstants.LEFT);
        primero.setFont(new Font("",Font.BOLD,15));
        primero.setBounds(110, 120, 505, 30); 
        primero.setOpaque(true);
        primero.setBackground(Color.WHITE);        
        add(primero);
        
        JLabel segundo = new JLabel();
        segundo.setText("Ingresar una nombre para su cuenta, este será único");
        segundo.setHorizontalAlignment(SwingConstants.LEFT);
        segundo.setFont(new Font("",Font.BOLD, 15));
        segundo.setBounds(110, 200, 505, 30); 
        segundo.setOpaque(true);
        segundo.setBackground(Color.WHITE);        
        add(segundo);
        
        JLabel tercero = new JLabel();
        tercero.setText("Usuarios sin registrase se les asigna un numero único");
        tercero.setHorizontalAlignment(SwingConstants.LEFT);
        tercero.setFont(new Font("",Font.BOLD,15));
        tercero.setBounds(110, 280, 505, 30); 
        tercero.setOpaque(true);
        tercero.setBackground(Color.WHITE);        
        add(tercero);
        
        JLabel cuatro = new JLabel();
        cuatro.setText("Tendrá que seleccionar una rango de edad Ej (15-18)");
        cuatro.setHorizontalAlignment(SwingConstants.LEFT);
        cuatro.setFont(new Font("",Font.BOLD,15));
        cuatro.setBounds(110, 360, 505, 30); 
        cuatro.setOpaque(true);
        cuatro.setBackground(Color.WHITE);        
        add(cuatro);
        
        JLabel quinto = new JLabel();
        quinto.setText("Se trata de describir las características del usuario");
        quinto.setHorizontalAlignment(SwingConstants.LEFT);
        quinto.setFont(new Font("",Font.BOLD,15));
        quinto.setBounds(110, 440, 505, 30); 
        quinto.setOpaque(true);
        quinto.setBackground(Color.WHITE);        
        add(quinto);        
    }

    private void iniciarBotones() {
        btnAtras = new JButton();
        
        btnAtras.setText("Atras");
        btnAtras.setHorizontalAlignment(SwingConstants.CENTER);
        btnAtras.setFont(new Font("",Font.BOLD,20));
        btnAtras.setBounds(300, 520, 100, 30);        
        add(btnAtras); 
    }
}
