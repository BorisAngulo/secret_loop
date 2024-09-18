
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author boris
 */
public class VentanaSalir extends JFrame{
    PanelSalir ps;
    public VentanaSalir(){
        iniciar();
    }
    
    private void iniciar(){
        setTitle("salir");
        setSize(400, 250);
        setLayout(null);
        setResizable(false);
        setUndecorated(true);
        setLocationRelativeTo(null);
        
        ps = new PanelSalir();
        add(ps);
        
        
    }
    
    class PanelSalir extends JPanel{
        
        public JButton btnSi;
        public JButton btnNo;
        private JLabel jlTitulo;
        private JLabel jlIcono;
        
        public PanelSalir(){
            iniciar();
        }
        
        private void iniciar(){
            setSize(700, 600);
            setBackground(new java.awt.Color(42, 28, 86));
            setLayout(null);
            
            
            btnSi = new JButton();
            btnSi.setText("SI");
            btnSi.setEnabled(true);
            btnSi.setBackground(Color.RED);
            ActionSi s = new ActionSi();
            btnSi.addActionListener(s);
            btnSi.setBounds(50, 150, 80, 40); 
            add(btnSi);
        
            btnNo = new JButton();
            btnNo.setText("NO");
            btnNo.setEnabled(true);
            ActionNo n = new ActionNo();
            btnNo.addActionListener(n);
            btnNo.setBounds(270, 150, 80, 40);
            add(btnNo);
        
            jlTitulo = new JLabel();
            jlTitulo.setText("¿Desea Salir?");
            jlTitulo.setFont(new Font("arial", 1, 20));
            jlTitulo.setForeground(Color.WHITE);
            jlTitulo.setBounds(135, 30, 150, 50);       
            add(jlTitulo);
            
            ImageIcon logo = new ImageIcon("src/Imagenes/logo.png");
            jlIcono = new JLabel();
            jlIcono.setBounds(10, 10, 70, 45);
            jlIcono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(70, 45, Image.SCALE_SMOOTH)));
            add(jlIcono);
        }
    }
    class ActionSi implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    
    }
    
    class ActionNo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
        }
    }
}
