
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
public class PanelComentarios extends JPanel{
    public JButton btnComentar;
    public JTextArea txtChat;
    public JTextArea txtEscribe;
    public JButton btnAtras;
    private JLabel jlIcono;
    
    public PanelComentarios(){
        setSize(500, 400);
        setBackground(new java.awt.Color(28, 14, 74));
        setLayout(null);
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        btnComentar = new JButton("comentar");
        txtChat = new JTextArea();
        txtEscribe = new JTextArea();
        btnAtras = new JButton("atras");
        
        btnComentar.setEnabled(true);
        btnComentar.setBackground(Color.white);
        btnComentar.setFont(new Font("", 0, 15));
        btnComentar.setBounds(350, 330, 120, 50);
        this.add(btnComentar);
        
        btnAtras.setEnabled(true);
        btnAtras.setBackground(Color.white);
        btnAtras.setFont(new Font("", 0, 15));
        btnAtras.setBounds(380, 20, 90, 40);
        this.add(btnAtras);
        
        txtChat.setFont(new Font("arial", 0, 18));
        txtChat.setEditable(false);
        txtChat.setLineWrap(true);
        txtChat.setWrapStyleWord(true);
        txtChat.setOpaque(true);
        txtChat.setForeground(Color.white);
        txtChat.setBackground(new java.awt.Color(32, 18, 77));
        txtChat.setBorder(null);
        JScrollPane scrollDos = new JScrollPane(txtChat);
        scrollDos.setBounds(20, 80, 450, 250);
        scrollDos.setBackground(new java.awt.Color(32, 18, 77));
        scrollDos.setBorder(null);
        this.add(scrollDos); 
        
        txtEscribe.setFont(new Font("arial", 0, 12));
        txtEscribe.setEditable(true);
        txtEscribe.setLineWrap(true);
        txtEscribe.setWrapStyleWord(true);
        txtEscribe.setOpaque(true);
        txtEscribe.setForeground(Color.black);
        txtEscribe.setBackground(Color.white);
        txtEscribe.setBorder(null);
        JScrollPane scrollUno = new JScrollPane(txtEscribe);
        scrollUno.setBounds(20, 330, 310, 50);
        scrollUno.setBackground(Color.white);
        scrollUno.setBorder(null);
        this.add(scrollUno);
        
        ImageIcon logo = new ImageIcon("src/Imagenes/logo.png");
        jlIcono = new JLabel();
        jlIcono.setBounds(20, 20, 70, 40);
        jlIcono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(70, 40, Image.SCALE_SMOOTH)));
        this.add(jlIcono);
    }
}
