
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author boris
 */
public class PanelTerminosYLimitaciones extends JPanel{
    
    public JButton btnAceptar;
    public JButton btnNoAceptar;
    private final JLabel jlTerminos;
    private final JLabel jlLimitaciones;
    private final JLabel jlIcono;
    private final JTextArea jtaTerminos;
    private final JTextArea jtaLimitaciones;
    
    public PanelTerminosYLimitaciones(){
        setBackground(new java.awt.Color(32, 18, 77));
        setLayout(null);
        setSize(700, 600);
            
        String ter = "1) ¿Usted cuenta con la edad mínima legal de 15 años?" + 
                     "\n2) En la Secret Loop, se topará con material de todo tipo siendo alguno, que pueda dañar su sensibilidad,"
                    +"\n¿Desea continuar?"
                   + "\n3) ¿Está de acuerdo con las limitaciones de las publicaciones y estadía en la red?";
            
        String lim = "1) Si una publicación llega acumular 4 reportes, pasará a ser observado por el administrador y "
                    + "este definirá si se elimina o no"
                    +"\n2) Una vez que entre todos los usuarios lleguen a la cantidad de 40 publicaciones, el"
                    +"sistema automáticamente, eliminará la más antigua de las publicaciones y dará paso a la nueva publicación."
                    +"\n3) Si un usuario se registra, en Secret Loop y pasan seis meses sin"
                    +"actividad, automáticamente el sistema eliminara a este usuario.";
                    
        btnNoAceptar = new JButton();
        btnNoAceptar.setText("No acepto");
        btnNoAceptar.setBounds(100, 550, 100, 30);       
        this.add(btnNoAceptar);
           
        btnAceptar = new JButton();
        btnAceptar.setText("Acepto");
        btnAceptar.setBounds(500, 550, 100, 30);       
        this.add(btnAceptar);
      
        jlTerminos = new JLabel("Terminos:");
        jlTerminos.setFont(new Font("arial", 1, 30));
        jlTerminos.setForeground(Color.WHITE);
        jlTerminos.setBounds(50, 125, 200, 50);
        this.add(jlTerminos);
                    
        jlLimitaciones = new JLabel("Limitaciones:");
        jlLimitaciones.setFont(new Font("arial", 1, 30));
        jlLimitaciones.setForeground(Color.WHITE);
        jlLimitaciones.setBounds(50, 325, 200, 50);
        this.add(jlLimitaciones);
            
        jtaTerminos = new JTextArea(ter);
        jtaTerminos.setLineWrap(true);
        jtaTerminos.setWrapStyleWord(true);
        jtaTerminos.setEditable(false);
        jtaTerminos.setBounds(50, 175, 600, 150);
        this.add(jtaTerminos);
            
        jtaLimitaciones = new JTextArea(lim);
        jtaLimitaciones.setLineWrap(true);
        jtaLimitaciones.setWrapStyleWord(true);
        jtaLimitaciones.setEditable(false);
        jtaLimitaciones.setBounds(50, 375, 600, 150);
        this.add(jtaLimitaciones);
        

        ImageIcon logo = new ImageIcon("src/Imagenes/logo.png");
        jlIcono = new JLabel();
        jlIcono.setBounds(270, 30, 150, 80);
        jlIcono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH)));
        this.add(jlIcono);
    }
}
