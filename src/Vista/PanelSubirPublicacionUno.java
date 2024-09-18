
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

/**
 *
 * @author boris
 */
public class PanelSubirPublicacionUno extends JPanel{
    
    public JButton btnAtras;
    public JButton btnSgtPaso;
    public JTextArea txtCaja;
    private JLabel jlIcono;
    
    public PanelSubirPublicacionUno(){
        setSize(700, 600);
        setBackground(new java.awt.Color(32, 18, 77));
        setLayout(null);
            
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        
               
        btnAtras = new JButton("Atras");  
        btnSgtPaso = new JButton("Siguiente Paso");
        txtCaja = new JTextArea("\n \n \n           Escribe lo que piensas");
        jlIcono = new JLabel();
        
        btnAtras.setBounds(25, 550, 180, 30);
        btnAtras.setFont(new Font("arial", 0, 15));
        btnAtras.setEnabled(true);
        this.add(btnAtras);

        
        btnSgtPaso.setBounds(500, 550, 180, 30);
        btnSgtPaso.setFont(new Font("arial", 0, 15));
        btnSgtPaso.setEnabled(true);
        this.add(btnSgtPaso);
        
        txtCaja.setFont(new Font("arial", 0, 25));
        txtCaja.setEditable(true);
        txtCaja.setLineWrap(true);
        txtCaja.setWrapStyleWord(true);
        JScrollPane scrollDos = new JScrollPane(txtCaja);
        scrollDos.setBounds(150, 180, 420, 200);
        this.add(scrollDos); 
        
        
        ImageIcon logo = new ImageIcon("src/Imagenes/logo.png");       
        jlIcono.setBounds(15, 10, 90, 50);
        jlIcono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(90, 50, Image.SCALE_SMOOTH)));
        this.add(jlIcono); 
    }
}
