package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author boris
 */
public class PanelAyuda extends JPanel {

    public JButton btnAtras;
    public JButton btnInterfaz;
    public JButton btnAjusteCuenta;
    public JButton btnComoEmpezar;
    public JButton btnContactanos;

    public PanelAyuda() {
        setSize(700, 600);
        setLayout(null);
        setBackground(new java.awt.Color(32, 18, 77));
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        iniciarEtiquetas();
        iniciarBotones();
    }

    private void iniciarEtiquetas() {
        JLabel logo = new JLabel();
        ImageIcon imagen = new ImageIcon("src/Imagenes/logo.png");
        logo.setIcon(imagen);
        logo.setBounds(20, 20, 90, 55);
        logo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH)));
        add(logo);

        JLabel titulo = new JLabel();
        titulo.setText("AYUDA");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("", Font.BOLD, 40));
        titulo.setBounds(270, 30, 150, 50);
        titulo.setBackground(new java.awt.Color(32, 18, 77));
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(true);
        add(titulo);
    }

    private void iniciarBotones() {
        btnAtras = new JButton();
        btnInterfaz = new JButton();
        btnAjusteCuenta = new JButton();
        btnComoEmpezar = new JButton();
        btnContactanos = new JButton();
        
        btnInterfaz.setText("Interfaz de Screet Loop");
        btnInterfaz.setHorizontalAlignment(SwingConstants.CENTER);
        btnInterfaz.setFont(new Font("", Font.BOLD, 30));
        btnInterfaz.setBounds(160, 120, 380, 50);
        add(btnInterfaz);

        btnAjusteCuenta.setText("Ajuste de la cuenta");
        btnAjusteCuenta.setHorizontalAlignment(SwingConstants.CENTER);
        btnAjusteCuenta.setFont(new Font("", Font.BOLD, 30));
        btnAjusteCuenta.setBounds(160, 210, 380, 50);
        add(btnAjusteCuenta);

        btnComoEmpezar.setText("Como empezar");
        btnComoEmpezar.setHorizontalAlignment(SwingConstants.CENTER);
        btnComoEmpezar.setFont(new Font("", Font.BOLD, 30));
        btnComoEmpezar.setBounds(160, 300, 380, 50);
        add(btnComoEmpezar);

        btnContactanos.setText("Contáctanos");
        btnContactanos.setHorizontalAlignment(SwingConstants.CENTER);
        btnContactanos.setFont(new Font("", Font.BOLD, 30));
        btnContactanos.setBounds(160, 390, 380, 50);
        add(btnContactanos);

        btnAtras.setText("Atras");
        btnAtras.setHorizontalAlignment(SwingConstants.CENTER);
        btnAtras.setFont(new Font("", Font.BOLD, 20));
        btnAtras.setBounds(300, 500, 100, 50);
        add(btnAtras);
    }
}
