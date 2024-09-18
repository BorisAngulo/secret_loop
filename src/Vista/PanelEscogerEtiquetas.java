package Vista;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author boris
 */
public class PanelEscogerEtiquetas extends JPanel {

    public JButton btnAtras;
    public JButton btnAceptar;

    public JRadioButton rbtnTodos;
    public JRadioButton rbtnTecnologia;
    public JRadioButton rbtnJuegos;
    public JRadioButton rbtnMusica;
    public JRadioButton rbtnCine;
    public JRadioButton rbtnAnimales;
    public JRadioButton rbtnDeportes;
    public JRadioButton rbtnPolitica;
    public JRadioButton rbtnArte;
    public JRadioButton rbtnNaturaleza;
    
    public ButtonGroup grupo;

    public PanelEscogerEtiquetas() {
        setSize(700, 600);
        setLayout(null);
        setBackground(new java.awt.Color(32, 18, 77));
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        iniciarEtiquetas();
        iniciarBotones();
        iniciarBotonesA();
    }

    private void iniciarEtiquetas() {
        JLabel logo = new JLabel();
        ImageIcon imagen = new ImageIcon("src/Imagenes/logo.png");
        logo.setIcon(imagen);
        logo.setBounds(30, 30, 90, 55);
        logo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH)));
        add(logo);

        JLabel titulo = new JLabel();
        titulo.setBounds(150, 30, 500, 40);
        titulo.setText("Seleccioné la categoría a cual pertenece su publicación");
        titulo.setOpaque(true);
        titulo.setBackground(new java.awt.Color(32, 18, 77));
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("arial", Font.BOLD, 18));
        add(titulo);
    }

    private void iniciarBotones() {

        rbtnTodos = new JRadioButton();
        rbtnTecnologia = new JRadioButton();
        rbtnJuegos = new JRadioButton();
        rbtnMusica = new JRadioButton();
        rbtnCine = new JRadioButton();
        rbtnAnimales = new JRadioButton();
        rbtnDeportes = new JRadioButton();
        rbtnPolitica = new JRadioButton();
        rbtnArte = new JRadioButton();
        rbtnNaturaleza = new JRadioButton();
        
        rbtnTodos.setText("  Todos");
        rbtnTodos.setBounds(30, 130, 250, 50);
        rbtnTodos.setFont(new Font("", 1, 30));
        rbtnTodos.setForeground(Color.WHITE);
        rbtnTodos.setBackground(new java.awt.Color(32, 18, 77));
        this.add(rbtnTodos);
        
        rbtnTecnologia.setText("  Tecnologia");
        rbtnTecnologia.setBounds(30, 180, 250, 50);
        rbtnTecnologia.setFont(new Font("", 1, 30));
        rbtnTecnologia.setForeground(Color.WHITE);
        rbtnTecnologia.setBackground(new java.awt.Color(32, 18, 77));
        this.add(rbtnTecnologia);
        
        rbtnJuegos.setText("  Juegos");
        rbtnJuegos.setBounds(30, 230, 250, 50);
        rbtnJuegos.setFont(new Font("", 1, 30));
        rbtnJuegos.setForeground(Color.WHITE);
        rbtnJuegos.setBackground(new java.awt.Color(32, 18, 77));
        this.add(rbtnJuegos);
        
        rbtnMusica.setText("  Música");
        rbtnMusica.setBounds(30, 280, 250, 50);
        rbtnMusica.setFont(new Font("", 1, 30));
        rbtnMusica.setForeground(Color.WHITE);
        rbtnMusica.setBackground(new java.awt.Color(32, 18, 77));
        this.add(rbtnMusica);
        
        rbtnCine.setText("  Cine");
        rbtnCine.setBounds(30, 330, 250, 50);
        rbtnCine.setFont(new Font("", 1, 30));
        rbtnCine.setForeground(Color.WHITE);
        rbtnCine.setBackground(new java.awt.Color(32, 18, 77));
        this.add(rbtnCine);
        
        rbtnAnimales.setText("  Animales");
        rbtnAnimales.setBounds(400, 130, 250, 50);
        rbtnAnimales.setFont(new Font("", 1, 30));
        rbtnAnimales.setForeground(Color.WHITE);
        rbtnAnimales.setBackground(new java.awt.Color(32, 18, 77));
        this.add(rbtnAnimales);
        
        rbtnDeportes.setText("  Deportes");
        rbtnDeportes.setBounds(400, 180, 250, 50);
        rbtnDeportes.setFont(new Font("", 1, 30));
        rbtnDeportes.setForeground(Color.WHITE);
        rbtnDeportes.setBackground(new java.awt.Color(32, 18, 77));
        this.add(rbtnDeportes);
        
        rbtnPolitica.setText("  Política");
        rbtnPolitica.setBounds(400, 230, 250, 50);
        rbtnPolitica.setFont(new Font("", 1, 30));
        rbtnPolitica.setForeground(Color.WHITE);
        rbtnPolitica.setBackground(new java.awt.Color(32, 18, 77));
        this.add(rbtnPolitica);
        
        rbtnArte.setText("  Arte");
        rbtnArte.setBounds(400, 280, 250, 50);
        rbtnArte.setFont(new Font("", 1, 30));
        rbtnArte.setForeground(Color.WHITE);
        rbtnArte.setBackground(new java.awt.Color(32, 18, 77));
        this.add(rbtnArte);
        
        rbtnNaturaleza.setText("  Naturaleza");
        rbtnNaturaleza.setBounds(400, 330, 250, 50);
        rbtnNaturaleza.setFont(new Font("", 1, 30));
        rbtnNaturaleza.setForeground(Color.WHITE);
        rbtnNaturaleza.setBackground(new java.awt.Color(32, 18, 77));
        this.add(rbtnNaturaleza);

        
        grupo = new ButtonGroup();
        grupo.add(rbtnAnimales);
        grupo.add(rbtnTodos);
        grupo.add(rbtnTecnologia);
        grupo.add(rbtnJuegos);
        grupo.add(rbtnMusica);
        grupo.add(rbtnCine);
        grupo.add(rbtnNaturaleza);
        grupo.add(rbtnDeportes);
        grupo.add(rbtnArte);
        grupo.add(rbtnPolitica);

    }

    private void iniciarBotonesA() {

        btnAtras = new JButton();
        btnAceptar = new JButton();

        btnAtras.setBounds(100, 500, 100, 50);
        btnAtras.setText("Atras");
        btnAtras.setOpaque(true);
        btnAtras.setBackground(Color.WHITE);
        btnAtras.setFont(new Font("arial", Font.BOLD, 25));
        add(btnAtras);

        btnAceptar.setBounds(500, 500, 140, 50);
        btnAceptar.setText("Aceptar");
        btnAceptar.setOpaque(true);
        btnAceptar.setBackground(Color.WHITE);
        btnAceptar.setFont(new Font("arial", Font.BOLD, 25));
        add(btnAceptar);
    }
}
