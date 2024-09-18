
package Controlador;

import Modelo.Comentarios;
import Modelo.ConsultaComentarios;
import Modelo.ConsultasImagen;
import Modelo.ImagenPub;
import Modelo.ListaCDE;
import Modelo.UsuarioR;
import Vista.PanelComentarios;
import Vista.VentanaPequenia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author boris
 */
public class CtrlComentarios implements ActionListener {
    
    private PanelComentarios pnlComentarios;
    private VentanaPequenia frmVentana;
    
    private UsuarioR user;
    private ImagenPub imagen;
    private Comentarios comentario;
    private ConsultaComentarios cc;
    private ConsultasImagen ci;
    
    
    public CtrlComentarios(PanelComentarios pnlComentarios, VentanaPequenia frmVentana, UsuarioR user, ImagenPub imagen, 
            Comentarios comentario, ConsultaComentarios cc, ConsultasImagen ci){
        this.pnlComentarios = pnlComentarios;
        this.frmVentana = frmVentana;
        this.user = user;
        this.imagen = imagen;
        this.comentario = comentario;
        this.cc = cc;
        this.ci = ci;
        
        this.frmVentana.add(pnlComentarios);
        
        this.pnlComentarios.btnAtras.addActionListener(this);
        this.pnlComentarios.btnComentar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pnlComentarios.btnAtras){
            frmVentana.dispose();
        }
        if(e.getSource() == pnlComentarios.btnComentar){
            comentario.setComentario(pnlComentarios.txtEscribe.getText());
            comentario.setIdUsuario(user.getIdUsuario());
            comentario.setIdPublicacion(imagen.getIdImagen());
            if(cc.comentar(comentario)){
                JOptionPane.showMessageDialog(null, "comentado");
                ListaCDE<Comentarios> l = new ListaCDE<>();
                l = cc.cargarComentarios(l, imagen.getIdImagen());
                pnlComentarios = cc.mostrarComentarios(l, pnlComentarios, ci);
            }else{
                JOptionPane.showMessageDialog(null, "error");
            }
        }
    }
}
