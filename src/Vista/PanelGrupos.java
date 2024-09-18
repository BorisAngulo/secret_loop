
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
/**
 *
 * @author boris
 */
public class PanelGrupos extends JPanel{
    
    public JButton btnAtras;
    public JButton btnUno;
    public JButton btnDos;
    public JButton btnTres;
    public JButton btnCuatro;
    public JButton btnCinco;
    public JButton btnSeis;
    public JButton btnSiete;
    public JButton btnOcho;
       
    private JLabel logo;
    private JLabel titulo;
    
    private JLabel unoA;
    private JLabel dosA;
    private JLabel tresA;
    private JLabel cuatroA;
    private JLabel cincoA;
    private JLabel seisA;
    private JLabel sieteA;
    private JLabel ochoA;
    
    
    public PanelGrupos(){
        setSize(700, 600);
        setLayout(null);
        setBackground(new java.awt.Color(32, 18, 77));        
        iniciarComponentes();  
    }  

    private void iniciarComponentes() {
        iniciarEtiquetas();
        iniciarBotonoes();
        iniciarIconos();
    }

    private void iniciarEtiquetas() {
        logo = new JLabel();
        titulo = new JLabel();
        
        ImageIcon imagen = new ImageIcon("src/Imagenes/logo.png");
        logo.setIcon(imagen);
        logo.setBounds(30,30,90, 55);
        logo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH)));
        add(logo);
        
        titulo.setText("GRUPOS DE USUARIOS");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("arial",Font.BOLD,30));
        titulo.setBounds(180, 25, 350, 50); 
        titulo.setForeground(Color.white);
        titulo.setBackground(new Color(32,18,77));
        titulo.setOpaque(true);
        add(titulo);
        
    }

    private void iniciarBotonoes() {
        
        btnAtras = new JButton();
        btnUno = new JButton();
        btnDos = new JButton();
        btnTres = new JButton();
        btnCuatro = new JButton();
        btnCinco = new JButton();
        btnSeis = new JButton();
        btnSiete = new JButton();
        btnOcho = new JButton();
        

        btnAtras.setText("Atras");
        btnAtras.setHorizontalAlignment(SwingConstants.CENTER);
        btnAtras.setFont(new Font("",Font.BOLD,20));
        btnAtras.setBounds(300, 530, 100, 30);         
        add(btnAtras); 
        
        btnUno.setBounds(140,130, 190, 30);
        btnUno.setText("La Promesa");
        btnUno.setFont(new Font("",Font.BOLD,20));
        add(btnUno);

        btnDos.setBounds(140,230, 190, 30);
        btnDos.setText("En la naural");
        btnDos.setFont(new Font("",Font.BOLD,20));
        add(btnDos);
        
        btnTres.setBounds(140,330, 190, 30);
        btnTres.setText("pies a cabeza");
        btnTres.setFont(new Font("",Font.BOLD,20));
        add(btnTres);

        btnCuatro.setBounds(140,430, 190, 30);
        btnCuatro.setText("libros de mente");
        btnCuatro.setFont(new Font("",Font.BOLD,20));
        add(btnCuatro);

        btnCinco.setBounds(450,130, 160, 30);
        btnCinco.setText("Políticos");
        btnCinco.setFont(new Font("",Font.BOLD,20));
        add(btnCinco);

        btnSeis.setBounds(450,230, 160, 30);
        btnSeis.setText("Animalitos");
        btnSeis.setFont(new Font("",Font.BOLD,20));
        add(btnSeis);

        btnSiete.setBounds(450,330, 160, 30);
        btnSiete.setText("Deportistas");
        btnSiete.setFont(new Font("",Font.BOLD,20));
        add(btnSiete);

        btnOcho.setBounds(450, 430, 160, 30);
        btnOcho.setText("Juegos im");
        btnOcho.setFont(new Font("",Font.BOLD,20));
        add(btnOcho);      
    }

    private void iniciarIconos() {
        
        unoA = new JLabel();
        dosA = new JLabel();
        tresA = new JLabel();
        cuatroA = new JLabel();
        cincoA = new JLabel();
        seisA = new JLabel();
        sieteA = new JLabel();
        ochoA = new JLabel();
        
        ImageIcon imagen = new ImageIcon("src/Imagenes/GrupoUsario.png");
        
        unoA.setBounds(60, 120,50,50);        
        unoA.setIcon(imagen);
        add(unoA);

        dosA.setBounds(60, 220,50,50);        
        dosA.setIcon(imagen);
        add(dosA);

        tresA.setBounds(60, 320,50,50);        
        tresA.setIcon(imagen);
        add(tresA);

        cuatroA.setBounds(60, 420,50,50);        
        cuatroA.setIcon(imagen);
        add(cuatroA);

        cincoA.setBounds(380, 120,50,50);        
        cincoA.setIcon(imagen);
        add(cincoA);

        seisA.setBounds(380, 220,50,50);        
        seisA.setIcon(imagen);
        add(seisA);

        sieteA.setBounds(380, 320,50,50);        
        sieteA.setIcon(imagen);
        add(sieteA);

        ochoA.setBounds(380, 420,50,50);        
        ochoA.setIcon(imagen);
        add(ochoA);        
    }
}
