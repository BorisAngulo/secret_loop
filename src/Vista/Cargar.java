package Vista;

/*
 * @author Gabriel
 */
import Controlador.CtrlInicio;
import Modelo.ConsultaUsuarioR;
import Modelo.ConsultasImagen;
import Modelo.ImagenPub;
import Modelo.ListaCDE;
import Modelo.PalabrasProhibidas;
import Modelo.UsuarioR;
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cargar extends JFrame {

    private JPanel panelUno;
    private JProgressBar barraDeCarga;

    public Cargar() {
        setSize(700, 600);
        setTitle("Scret Loop");
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JLabel fondo = new JLabel();
        ImageIcon imagen2 = new ImageIcon("src/Imagenes/Caratula.jpg");
        fondo.setIcon(imagen2);
        fondo.setSize(getWidth(), getHeight());
        this.add(fondo);
        panelUno = new JPanel();
        panelUno.setLayout(null);
        this.getContentPane().add(panelUno);
        iniciarBarra();
    }

    private void iniciarBarra() {
        barraDeCarga = new JProgressBar();
        barraDeCarga.setValue(0);
        barraDeCarga.setBounds(280, 450, 150, 40);
        barraDeCarga.setForeground(Color.MAGENTA);
        barraDeCarga.setBackground(Color.WHITE);

        Thread hilo = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    try {
                        Thread.sleep(40);
                        barraDeCarga.setValue(i);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Cargar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (i == 100) {
//                        setVisible(false);
                        dispose();
                        VentanaTotal vi = new VentanaTotal();
                        PanelInicio pi = new PanelInicio();
                        PanelConCuenta pc = new PanelConCuenta();
                        PanelTerminosYLimitaciones ptyc = new PanelTerminosYLimitaciones();
                        PanelRegistro pr = new PanelRegistro();
                        
                        PalabrasProhibidas pp = new PalabrasProhibidas();
                        UsuarioR ur = new UsuarioR();
                        ConsultaUsuarioR cur = new ConsultaUsuarioR();
                        ConsultasImagen ci = new ConsultasImagen();
                        ImagenPub ip = new ImagenPub();
                        ListaCDE<ImagenPub> lista = new ListaCDE<>();

                        CtrlInicio ctrli = new CtrlInicio(pi, pr, vi, pc, ptyc, ur, cur, pp, ip, ci, lista);
                        vi.setVisible(true);
                    }
                }
            }
        };
        hilo.start();
        panelUno.add(barraDeCarga);
    }

}
