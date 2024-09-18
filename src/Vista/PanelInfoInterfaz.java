
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author boris
 */
public class PanelInfoInterfaz extends JPanel{
    
    public JButton btnAtras;
    
    private JLabel logo;
    private JLabel titulo;
    private JLabel primero;
    private JLabel segundo;
    private JLabel tercero;
    
    private JTextArea primeroA;
    private JTextArea segundoA;
    private JTextArea terceroA;
    
    public PanelInfoInterfaz(){
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
        

        titulo.setText("INTERFAZ DE SECRET LOOP");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("",Font.BOLD,28));
        titulo.setBackground(new java.awt.Color(32, 18, 77));
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(150, 30, 400, 30); 
        titulo.setOpaque(true);
        add(titulo); 
        

        primero.setText("Navegación en la red ");
        primero.setForeground(Color.WHITE);
        primero.setHorizontalAlignment(SwingConstants.LEFT);
        primero.setFont(new Font("",Font.BOLD,24));
        primero.setBounds(100, 80, 250, 30);        
        primero.setOpaque(true);
        primero.setBackground(new java.awt.Color(32, 18, 77));
        add(primero); 
        

        segundo.setText("Interacción entree usuarios ");
        segundo.setForeground(Color.WHITE);
        segundo.setHorizontalAlignment(SwingConstants.LEFT);
        segundo.setFont(new Font("",Font.BOLD,24));
        segundo.setBounds(100, 210, 350, 30);        
        segundo.setOpaque(true);
        segundo.setBackground(new java.awt.Color(32, 18, 77));
        add(segundo);  
        

        tercero.setText("Publicaciónes ");
        tercero.setForeground(Color.WHITE);
        tercero.setHorizontalAlignment(SwingConstants.LEFT);
        tercero.setFont(new Font("",Font.BOLD,24));
        tercero.setBounds(100, 330, 175, 30);        
        tercero.setOpaque(true);
        tercero.setBackground(new java.awt.Color(32, 18, 77));;
        add(tercero);
           
    }

    private void iniciarBotones() {
        
        btnAtras = new JButton();
        
        btnAtras.setText("Atras");
        btnAtras.setHorizontalAlignment(SwingConstants.CENTER);
        btnAtras.setFont(new Font("",Font.BOLD,20));
        btnAtras.setBounds(300, 500, 100, 50);  
        add(btnAtras); 
    }

    private void iniciarTexto() {
        
        primeroA = new JTextArea();
        segundoA = new JTextArea();
        terceroA = new JTextArea();
        
        primeroA.setText("-Secret Loop le brinda a todos los usuarios la capacidad de navegar en la red. "
                + "Leer y mirar publicaciones de todos los internautas, crear estas y por supuesto reaccionar con un comentario,"
                + " reporte , me gusta o no me gusta."
                + "\n-Es posible tambien buscar publicaciones de su interfaz, como tambien buscar a usuarios de registrados y mirar su perfil");
        primeroA.setEditable(false);
        primeroA.setLineWrap(true);
        primeroA.setWrapStyleWord(true);
        primeroA.setFont(new Font("",Font.BOLD,18));
        JScrollPane scroll = new JScrollPane(primeroA);
        scroll.setBounds(100, 120, 530, 90);
        add(scroll);
        

        segundoA.setText("- Aquellos usuarios que navegan de manera casual, podrian acceder a conversaciones aleatorias con personas desconocidas." + 
                "\n-Ahora aquellos internautas que se registren, acceder a un chat personalizado con usuarios de la misma naturaleza,"
                + " de misma manera podran acceder un chat aleatorio, tambien se dara paso a iniciar una chat grupal,"
                + " con usuarios registrados, por supuesto que pueden agregar a sus usuarios a su lista de amigos ");
        segundoA.setEditable(false);
        segundoA.setLineWrap(true);//Permite delimitar el texto a lo horizontal
        segundoA.setWrapStyleWord(true);
        segundoA.setFont(new Font("",Font.BOLD,18));
        JScrollPane scrollDos = new JScrollPane(segundoA);
        scrollDos.setBounds(100, 240, 530, 90);
        add(scrollDos);
        

        terceroA.setText("-Los usuarios sin cuenta pueden publicar unicamente texto, al cual se le asignara una imagen aleatoria de fondo,"
                + " si el usuario no esta satisfecho con la imagen de fondo podran pasar a otra imagen aleatoria, "
                + "si no es suficiente selecciona una color de su agrado." +
            "\n-Los usuarios registrados tiene acceso a publicar imagenes y texto al mismo tiempo, "
                + "con la misma particularidades anteriormente mencionadas." +
            "\n-Todas la publicaciones estaran con etiqueta esta la determina de que naturaleza en la publicacion, "
                + "estos se definen a la hora de crear la publicacion ");
        terceroA.setEditable(false);
        terceroA.setLineWrap(true);//Permite delimitar el texto a lo horizontal
        terceroA.setWrapStyleWord(true);
        terceroA.setFont(new Font("",Font.BOLD,18));
        JScrollPane scrollTres = new JScrollPane(terceroA);
        scrollTres.setBounds(100, 370, 530, 90);
        add(scrollTres);
    }
}
