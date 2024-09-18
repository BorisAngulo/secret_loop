
package Vista;

import javax.swing.JFrame;

/**
 *
 * @author boris
 */
public class VentanaPequenia extends JFrame{
    public VentanaPequenia(){
        setSize(500, 400);
        setResizable(false);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
