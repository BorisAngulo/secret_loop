
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author boris
 */
public class PanelConCuenta extends JPanel{
    
    public JButton btnAtras;
    public JButton btnNavegar;
    public JTextField jtfUusario;
    public JTextField jtfContraseña;
    private final JLabel jlIngresar;
    private final JLabel jlIcono;
    
    public PanelConCuenta(){
        setBackground(new java.awt.Color(32, 18, 77));
        setLayout(null);
        setSize(700, 600);
    
        
        btnAtras = new JButton();
        btnAtras.setText("atras");
        btnAtras.setBounds(300, 550, 100, 30);       
        this.add(btnAtras);
        
        
        btnNavegar = new JButton();
        btnNavegar.setText("NAVEGAR");
        btnNavegar.setBackground(new java.awt.Color(159, 197, 248));
        btnNavegar.setFont(new Font("arial", 1, 20));
        btnNavegar.setBounds(275, 480, 150, 50);        
        this.add(btnNavegar);
        
        ImageIcon logo = new ImageIcon("src/Imagenes/logo.png");
        jlIcono = new JLabel();
        jlIcono.setBounds(270, 30, 150, 80);
        jlIcono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH)));
        this.add(jlIcono);
        
        jlIngresar = new JLabel();
        jlIngresar.setText("INGRESAR");
        jlIngresar.setForeground(Color.WHITE);
        jlIngresar.setFont(new Font("arial" ,0, 20));
        jlIngresar.setBounds(295, 110, 120, 50);
        this.add(jlIngresar);
               
        jtfUusario = new JTextField("Usuario");
        jtfUusario.setBounds(50, 250, 600, 30);
        this.add(jtfUusario);
        
        jtfContraseña = new JTextField("Contraseña");
        jtfContraseña.setBounds(50, 350, 600, 30);
        this.add(jtfContraseña);  
    }
}
