package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author boris
 */
public class PanelRegistro extends JPanel {
    
    public JButton btnAtras;
    public JButton btnRegistro;
    public JTextField jtUsuario;
    public JTextField jtContraseña;
    public JTextField jtRepitaContraseña;
    private final JLabel jlIcono;
    private final JLabel jlIngresar;
    private final JLabel jlSelEdad;
    public JRadioButton rbtnEdad1;
    public JRadioButton rbtnEdad2;
    public JRadioButton rbtnEdad3;
    public JRadioButton rbtnEdad4;

    public PanelRegistro() {
        this.setBackground(new java.awt.Color(32, 18, 77));
        setLayout(null);
        this.setSize(700, 600);

        btnAtras = new JButton();
        btnAtras.setText("Atras");
        btnAtras.setBounds(300, 550, 100, 30);
        this.add(btnAtras);

        btnRegistro = new JButton();
        btnRegistro.setText("Registrarse");
        btnRegistro.setFont(new Font("arial", 1, 20));
        btnRegistro.setBackground(new java.awt.Color(159, 197, 248));
        btnRegistro.setBounds(275, 480, 150, 60);
        this.add(btnRegistro);

        ImageIcon logo = new ImageIcon("src/Imagenes/logo.png");
        jlIcono = new JLabel();
        jlIcono.setBounds(270, 30, 150, 80);
        jlIcono.setIcon(new ImageIcon(logo.getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH)));
        this.add(jlIcono);

        jlIngresar = new JLabel();
        jlIngresar.setText("REGISTRO");
        jlIngresar.setForeground(Color.WHITE);
        jlIngresar.setFont(new Font("arial", 0, 20));
        jlIngresar.setBounds(295, 110, 120, 50);
        this.add(jlIngresar);

        jtUsuario = new JTextField("Usuario");
        jtUsuario.setBounds(50, 175, 600, 30);
        this.add(jtUsuario);

        jtContraseña = new JTextField("Contraseña");
        jtContraseña.setBounds(50, 225, 600, 30);
        this.add(jtContraseña);

        jtRepitaContraseña = new JTextField("Repita su Contraseña");
        jtRepitaContraseña.setBounds(50, 275, 600, 30);
        this.add(jtRepitaContraseña);

        jlSelEdad = new JLabel("Selecciona tu rango de edad:");
        jlSelEdad.setForeground(Color.WHITE);
        jlSelEdad.setFont(new Font("arial", 0, 20));
        jlSelEdad.setBounds(50, 315, 300, 25);
        this.add(jlSelEdad);

        rbtnEdad1 = new JRadioButton("15-18 años", false);
        rbtnEdad1.setBounds(50, 350, 600, 30);
        rbtnEdad1.setBackground(new java.awt.Color(32, 18, 77));
        rbtnEdad1.setForeground(Color.WHITE);
        this.add(rbtnEdad1);

        rbtnEdad2 = new JRadioButton("19-25 años", false);
        rbtnEdad2.setBounds(50, 380, 600, 30);
        rbtnEdad2.setBackground(new java.awt.Color(32, 18, 77));
        rbtnEdad2.setForeground(Color.WHITE);
        this.add(rbtnEdad2);

        rbtnEdad3 = new JRadioButton("26-41 años", false);
        rbtnEdad3.setBounds(50, 410, 600, 30);
        rbtnEdad3.setBackground(new java.awt.Color(32, 18, 77));
        rbtnEdad3.setForeground(Color.WHITE);
        this.add(rbtnEdad3);

        rbtnEdad4 = new JRadioButton("41-superior años", false);
        rbtnEdad4.setBounds(50, 440, 600, 30);
        rbtnEdad4.setBackground(new java.awt.Color(32, 18, 77));
        rbtnEdad4.setForeground(Color.WHITE);
        this.add(rbtnEdad4);

        ButtonGroup edades;
        edades = new ButtonGroup();
        edades.add(rbtnEdad4);
        edades.add(rbtnEdad3);
        edades.add(rbtnEdad2);
        edades.add(rbtnEdad1);
    }

}
