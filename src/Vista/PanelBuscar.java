
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 *
 * @author boris
 */
public class PanelBuscar extends JPanel{
    
    public JButton btnAtras;
    public JButton btnBuscar;
    public JTextField txtBusqueda;
    
    public PanelBuscar(){
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
        titulo.setText("BUSCAR");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("",Font.BOLD,30));
        titulo.setBounds(200, 30, 280, 30); 
        titulo.setOpaque(true);
        titulo.setBackground(new Color(32, 18, 77));
        titulo.setForeground(Color.white);
        add(titulo);
    }

    private void iniciarTexto() {
        txtBusqueda = new JTextField(); 
        txtBusqueda.setBounds(120, 110, 530, 30);
        txtBusqueda.setText("Ingrese su busqueda");
        txtBusqueda.setFont(new Font("",Font.BOLD,20));
        add(txtBusqueda);
        
        JLabel borde = new JLabel();
        borde.setBounds(100, 145, 550, 380);
        borde.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3),"Resultados", 
        javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.CENTER, 
        new java.awt.Font("Segoe UI", Font.BOLD, 18), new java.awt.Color(255, 255, 255)));
        add(borde);
    }

    private void iniciarBotones() {
        
        btnAtras = new JButton();
        btnBuscar = new JButton();

        btnAtras.setText("Atras");
        btnAtras.setHorizontalAlignment(SwingConstants.CENTER);
        btnAtras.setFont(new Font("",Font.BOLD,20));
        btnAtras.setBounds(300, 545, 100, 40);          
        add(btnAtras);

        btnBuscar.setBounds(30, 100, 60, 55);
        ImageIcon imagen = new ImageIcon("src/Imagenes/buscar.png");
        btnBuscar.setIcon(imagen);
        add(btnBuscar);
    }
}
