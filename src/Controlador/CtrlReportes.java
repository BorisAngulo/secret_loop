
package Controlador;

import Modelo.ConsultaReportes;
import Modelo.ImagenPub;
import Vista.PanelReportes;
import Vista.VentanaPequenia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author boris
 */
public class CtrlReportes implements ActionListener{
    
    private PanelReportes pnlReportes;
    private VentanaPequenia frmVentana;
    
    private ImagenPub publ;
    private ConsultaReportes cr;
    
    public CtrlReportes(PanelReportes pnlReportes, VentanaPequenia frmVentana, ImagenPub publ, ConsultaReportes cr){
        this.pnlReportes = pnlReportes;
        this.frmVentana = frmVentana;
        
        this.publ = publ;
        this.cr = cr;
        
        this.frmVentana.add(pnlReportes);
        
        this.pnlReportes.btnAtras.addActionListener(this);
        this.pnlReportes.btnEnviar.addActionListener(this);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pnlReportes.btnAtras){
            frmVentana.dispose();
        }
        if(e.getSource() == pnlReportes.btnEnviar){
            int i;
            i = cr.obtenerReportes(publ);
            if(cr.mandarReporte(publ, i)){
                JOptionPane.showMessageDialog(null, "reporte enviado");
            }else{
                JOptionPane.showMessageDialog(null, "error al mandar reporte");
            }
            
        }
    }
}
