
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
public class PanelReportes extends JPanel{
    
    public JButton btnEnviar;
    public JButton btnAtras;
    public JTextArea reportes;
    public JLabel titulo;
    private JLabel jlIcono;
    
    public PanelReportes(){
        setSize(500, 400);
        setBackground(new java.awt.Color(28, 14, 74));
        setLayout(null);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        btnEnviar = new JButton("Enviar");
        btnAtras = new JButton("Atras");
        reportes = new JTextArea();
        titulo = new JLabel(); 
        
        btnEnviar.setEnabled(true);
        btnEnviar.setBackground(Color.white);
        btnEnviar.setFont(new Font("", 1, 20));
        btnEnviar.setBounds(350, 330, 90, 50);
        this.add(btnEnviar);
        
        btnAtras.setEnabled(true);
        btnAtras.setBackground(Color.white);
        btnAtras.setFont(new Font("", 1, 20));
        btnAtras.setBounds(30, 330, 90, 50);
        this.add(btnAtras);
        
        titulo.setText("Puede reportar por:");
        titulo.setForeground(Color.WHITE);
        titulo.setBackground(new java.awt.Color(28, 14, 74));
        titulo.setFont(new Font("", 1, 25));
        titulo.setBounds(100, 20, 300, 90);
        this.add(titulo);
        
        reportes.setFont(new Font("arial", 0, 20));
        reportes.setEditable(false);
        reportes.setLineWrap(true);
        reportes.setWrapStyleWord(true);
        reportes.setOpaque(true);
        reportes.setForeground(Color.BLACK);
        reportes.setBackground(Color.white);
        reportes.setText("-Lenguaje inapropiado en el texto (LENGUAJE SOEZ)."
                        + "\n-Contenido inapropiado en fotos y videos"
                        + "\n-Noticias falsas(FAKE NEWS)"
                        + "\n-Discriminación por: raza, color, religión, ideología, etc");
        JScrollPane scrollDos = new JScrollPane(reportes);
        scrollDos.setBounds(20, 130, 450, 180);
        scrollDos.setBackground(Color.WHITE);
        scrollDos.setBorder(null);
        this.add(scrollDos); 
        
        ImageIcon logo = new ImageIcon("src/Imagenes/logo.png");
        jlIcono = new JLabel();
        jlIcono.setBounds(20, 20, 70, 40);
        jlIcono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(70, 40, Image.SCALE_SMOOTH)));
        this.add(jlIcono);
        
    }
    
}
