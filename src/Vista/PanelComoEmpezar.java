
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
/**
 *
 * @author boris
 */
public class PanelComoEmpezar extends JPanel{
    
    public JButton btnAtras;
    
    private JLabel logo;
    private JLabel titulo;
    private JLabel primero;
    private JLabel segundo;
    private JLabel tercero;
    
    private JTextArea primeroA;
    private JTextArea segundoA;
    private JTextArea terceroA;
    
    public PanelComoEmpezar(){
        setSize(700, 600);
        setLayout(null);
        setBackground(new java.awt.Color(32, 18, 77));        
        iniciarComponentes(); 
    }      
    
    private void iniciarComponentes() {
        iniciarEtiquetas();
        iniciarBotones(); 
        iniciarTexto();
    }

    private void iniciarEtiquetas() {
        logo = new JLabel();
        titulo = new JLabel();
        primero = new JLabel();
        segundo = new JLabel();
        tercero = new JLabel();
        
        ImageIcon imagen = new ImageIcon("src/Imagenes/logo.png");
        logo.setIcon(imagen);
        logo.setBounds(20,20,90, 55);
        logo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH)));
        add(logo);
        
        titulo.setText("COMO COMENZAR");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("",Font.BOLD,30));
        titulo.setBounds(210, 20, 280, 30); 
        titulo.setBackground(new java.awt.Color(32, 18, 77));
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(true);
        add(titulo);
        
        primero.setText("Publicar:");
        primero.setHorizontalAlignment(SwingConstants.LEFT);
        primero.setFont(new Font("",Font.BOLD,22));
        primero.setBounds(110, 80, 180, 30); 
        primero.setOpaque(true);
        primero.setBackground(new Color(32, 18, 77));
        primero.setForeground(Color.white);
        add(primero);

        segundo.setText("Chat");
        segundo.setHorizontalAlignment(SwingConstants.LEFT);
        segundo.setFont(new Font("",Font.BOLD,22));
        segundo.setBounds(110, 215, 180, 30); 
        segundo.setOpaque(true);
        segundo.setBackground(new Color(32, 18, 77));
        segundo.setForeground(Color.white);
        add(segundo);
          
        tercero.setText("Perfil");
        tercero.setHorizontalAlignment(SwingConstants.LEFT);
        tercero.setFont(new Font("",Font.BOLD,22));
        tercero.setBounds(110, 355, 180, 30); 
        tercero.setOpaque(true);
        tercero.setBackground(new Color(32, 18, 77));
        tercero.setForeground(Color.white);
        add(tercero);
    }

    private void iniciarTexto() {
        primeroA = new JTextArea();
        segundoA = new JTextArea();
        terceroA = new JTextArea();
                
        primeroA.setText("- Haz clik en el botón mas y comparte los que piensas, puedes cambiar a una imagen que prefieras." +
                        "\n- Reacciona a las publicaciones de los demás.");
        primeroA.setEditable(false);
        primeroA.setLineWrap(true);
        primeroA.setWrapStyleWord(true);
        primeroA.setFont(new Font("",Font.BOLD,18));
        primeroA.setBounds(100, 120, 530, 90);        
        add(primeroA);
        
        segundoA.setText("-Usa el chat aleatorio para conversar con otros usuarios." +
                        "\n-Registrate y habilita el chat personal." +
                        "\n-Una vez registrado solicitad acceso al administrador del grupo para iniciar una chat grupal");
        segundoA.setEditable(false);
        segundoA.setLineWrap(true);
        segundoA.setWrapStyleWord(true);
        segundoA.setFont(new Font("",Font.BOLD,18));        
        segundoA.setBounds(100, 250, 530, 100);
        add(segundoA);
       
        terceroA.setText("En el podrás observar todos los detalles de tu perfil, también cambiar tu descripción");
        terceroA.setEditable(false);
        terceroA.setLineWrap(true);
        terceroA.setWrapStyleWord(true);
        terceroA.setFont(new Font("",Font.BOLD,18));        
        terceroA.setBounds(100, 400, 530, 50);
        add(terceroA);
    }

    private void iniciarBotones() {
        btnAtras = new JButton();
        btnAtras.setText("Atras");
        btnAtras.setHorizontalAlignment(SwingConstants.CENTER);
        btnAtras.setFont(new Font("",Font.BOLD,20));
        btnAtras.setBounds(300, 500, 100, 50);          
        add(btnAtras); 
    }
}
