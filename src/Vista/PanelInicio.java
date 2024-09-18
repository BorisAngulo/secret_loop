
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author boris
 */
public class PanelInicio extends JPanel{
    
    public JButton btnSinCuenta;
    public JButton btnConCuenta;
    public JButton btnRegistro;
    public JButton btnSalir;
    private JLabel jlIcono;
    
    public PanelInicio(){
        iniciar();
    }
    
    private void iniciar(){
        
        btnSinCuenta  = new JButton();
        btnConCuenta = new JButton();
        btnRegistro = new JButton();
        btnSalir = new JButton();
        jlIcono = new JLabel();
        
        setBackground(new java.awt.Color(32, 18, 77));
        setLayout(null);
        setSize(700, 600);

        
        btnSinCuenta.setText("Ingresar Sin Cuenta");
        btnSinCuenta.setBackground(new java.awt.Color(89, 126, 170));
        btnSinCuenta.setForeground(Color.WHITE);
        btnSinCuenta.setFont(new Font("arial", 0, 20));
        btnSinCuenta.setEnabled(true);
        btnSinCuenta.setBounds(235, 150, 220, 80);
        this.add(btnSinCuenta);
        
        
        btnConCuenta.setText("Ingresar Con Cuenta");
        btnConCuenta.setBackground(new java.awt.Color(111, 168, 220));
        btnConCuenta.setForeground(Color.BLACK);
        btnConCuenta.setFont(new Font("arial", 0, 20));
        btnConCuenta.setEnabled(true);
        btnConCuenta.setBounds(235, 300, 220, 80);
        this.add(btnConCuenta);
        
        
        
        btnRegistro.setText("Registrarse");
        btnRegistro.setBackground(new java.awt.Color(159, 197, 248));
        btnRegistro.setForeground(Color.BLACK);
        btnRegistro.setFont(new Font("arial", 0, 20));
        btnRegistro.setEnabled(true);
        btnRegistro.setBounds(235, 450, 220, 80);
        this.add(btnRegistro);
         
        ImageIcon sOpaco = new ImageIcon("src/imagenes/salir_opaco.png");
        ImageIcon s64 = new ImageIcon("src/imagenes/salir_64.png");
        
        btnSalir.setBounds(610, 15, 70, 70);
        btnSalir.setForeground(Color.WHITE);
        btnSalir.setIcon(new ImageIcon(sOpaco.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
        btnSalir.setEnabled(true);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setPressedIcon(s64);
        btnSalir.setRolloverIcon(s64);
        btnSalir.setBorderPainted(false);
        btnSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.add(btnSalir);
        
        ImageIcon logo = new ImageIcon("src/Imagenes/logo.png");
        jlIcono.setBounds(270, 30, 150, 80);
        jlIcono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH)));
        this.add(jlIcono);
    }
}
