
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
/**
 *
 * @author boris
 */
public class PanelIntereses extends JPanel{
    
    public JButton btnAtras;
    
    private JLabel logo;
    private JLabel titulo;
    private JLabel uno;
    private JLabel dos;
    private JLabel tres;
    private JLabel cuatro;
    private JLabel cinco;
    private JLabel seis;
    private JLabel siete;
    private JLabel ocho;
    private JLabel nueve;
    private JLabel diez;
    
    
    
    
    public PanelIntereses(){
        setSize(700, 600);
        setLayout(null);
        setBackground(new java.awt.Color(32, 18, 77));        
        iniciarComponentes(); 
    }
    
    private void iniciarComponentes(){
        iniciarEtiquetas();
        iniciarBotones();
    }

    private void iniciarEtiquetas() {
        
        logo = new JLabel();
        titulo = new JLabel();
        uno = new JLabel();
        dos = new JLabel();
        tres = new JLabel();
        cuatro = new JLabel();
        cinco = new JLabel();
        seis = new JLabel();
        siete = new JLabel();
        ocho = new JLabel();
        nueve = new JLabel();
        diez = new JLabel();
        
        ImageIcon imagen = new ImageIcon("src/Imagenes/logo.png");
        logo.setIcon(imagen);
        logo.setBounds(30,30,90, 55);
        logo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH)));
        add(logo);
        
        titulo.setBounds(150, 30, 500, 40);
        titulo.setText("Seleccione el contenido de su interes"); 
        titulo.setBackground(new java.awt.Color(32, 18, 77));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setOpaque(true);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("arial",Font.BOLD,25));
        add(titulo);
        
        uno.setText("Todos");
        uno.setBounds(30, 130, 100, 50);
        uno.setFont(new Font("arial",Font.BOLD,30));        
        uno.setForeground(Color.white);
        add(uno);
        

        dos.setText("Tecnologia");
        dos.setBounds(30, 190, 180, 50);
        dos.setFont(new Font("arial",Font.BOLD,30));        
        dos.setForeground(Color.white);
        add(dos);
        

        tres.setText("Juegos");
        tres.setBounds(30, 250, 180, 50);
        tres.setFont(new Font("arial",Font.BOLD,30));        
        tres.setForeground(Color.white);
        add(tres);
        

        cuatro.setText("Musica");
        cuatro.setBounds(30, 310, 180, 50);
        cuatro.setFont(new Font("arial",Font.BOLD,30));        
        cuatro.setForeground(Color.white);
        add(cuatro);
        

        cinco.setText("Cine");
        cinco.setBounds(30, 370, 180, 50);
        cinco.setFont(new Font("arial",Font.BOLD,30));        
        cinco.setForeground(Color.white);
        add(cinco);
        

        seis.setText("Animales");
        seis.setBounds(380, 130, 180, 50);
        seis.setFont(new Font("arial",Font.BOLD,30));        
        seis.setForeground(Color.white);
        add(seis);
        

        siete.setText("Deportes");
        siete.setBounds(380, 190, 180, 50);
        siete.setFont(new Font("arial",Font.BOLD,30));        
        siete.setForeground(Color.white);
        add(siete);
        

        ocho.setText("Politica");
        ocho.setBounds(380, 250, 180, 50);
        ocho.setFont(new Font("arial",Font.BOLD,30));        
        ocho.setForeground(Color.white);
        add(ocho);
        

        nueve.setText("Arte");
        nueve.setBounds(380, 310, 180, 50);
        nueve.setFont(new Font("arial",Font.BOLD,30));        
        nueve.setForeground(Color.white);
        add(nueve);
        

        diez.setText("Naturaleza");
        diez.setBounds(380, 370, 180, 50);
        diez.setFont(new Font("arial",Font.BOLD,30));        
        diez.setForeground(Color.white);
        add(diez);
    }

    private void iniciarBotones() {
        
        btnAtras = new JButton();
        
        
//        ImageIcon imagen = new ImageIcon("src/Imagenes/Ayuda/Circulo.png");
//        JButton unoA = new JButton();
//        unoA.setBounds(280, 140, 40, 40);        
//        unoA.setIcon(imagen);
//        add(unoA);
//        
//        JButton dosA = new JButton();
//        dosA.setBounds(280, 200, 40, 40);
//        dosA.setIcon(imagen);
//        add(dosA);
//        
//        JButton tresA = new JButton();
//        tresA.setBounds(280, 260, 40, 40);
//        tresA.setIcon(imagen);
//        add(tresA);
//        
//        JButton cuatroA = new JButton();
//        cuatroA.setBounds(280, 320, 40, 40);
//        cuatroA.setIcon(imagen);
//        add(cuatroA);
//        
//        JButton cincoA = new JButton();
//        cincoA.setBounds(280, 380, 40, 40);
//        cincoA.setIcon(imagen);
//        add(cincoA);
//        
//        JButton seisA = new JButton();
//        seisA.setBounds(590, 140, 40, 40);
//        seisA.setIcon(imagen);
//        add(seisA);
//        
//        JButton sieteA = new JButton();
//        sieteA.setBounds(590, 200, 40, 40);
//        sieteA.setIcon(imagen);
//        add(sieteA);
//        
//        JButton ochoA = new JButton();
//        ochoA.setBounds(590, 260, 40, 40);
//        ochoA.setIcon(imagen);
//        add(ochoA);
//        
//        JButton nueveA = new JButton();
//        nueveA.setBounds(590, 320, 40, 40);
//        nueveA.setIcon(imagen);
//        add(nueveA);
//        
//        JButton diezA = new JButton();
//        diezA.setBounds(590, 380, 40, 40);
//        diezA.setIcon(imagen);
//        add(diezA);
        

        btnAtras.setBounds(300, 500, 100, 50);
        btnAtras.setText("Atras");
        btnAtras.setOpaque(true);
        btnAtras.setBackground(Color.WHITE);
        btnAtras.setFont(new Font("arial",Font.BOLD,25));
        add(btnAtras);
    }
}
