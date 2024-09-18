
package Controlador;

import Modelo.ConsultasImagen;
import Modelo.ImagenPub;
import Modelo.ListaCDE;
import Modelo.PalabrasProhibidas;
import Modelo.UsuarioR;
import Vista.PanelBuscar;
import Vista.PanelGrupos;
import Vista.PanelIntereses;
import Vista.PanelPantallaPrincipal;
import Vista.VentanaTotal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author boris
 */
public class CtrlGrupos implements ActionListener{
    private VentanaTotal frmVentana;
    private PanelGrupos pnlGrupo;
    private PalabrasProhibidas pp;
    private UsuarioR user;
    private ImagenPub ip;
    private ConsultasImagen ci;
    private ListaCDE<ImagenPub> lista;
    
    public CtrlGrupos(VentanaTotal frmVentana, PanelGrupos pnlGrupo, PalabrasProhibidas pp, UsuarioR user,
                        ImagenPub ip, ConsultasImagen ci, ListaCDE<ImagenPub> lista){
        this.frmVentana = frmVentana;
        this.pnlGrupo = pnlGrupo;
        this.user = user;
        this.pp = pp;
        this.ip = ip;
        this.ci = ci;
        this.lista = lista;
        
        this.frmVentana.add(pnlGrupo);
        
        this.pnlGrupo.btnAtras.addActionListener(this);
        this.pnlGrupo.btnUno.addActionListener(this);
        this.pnlGrupo.btnDos.addActionListener(this);
        this.pnlGrupo.btnTres.addActionListener(this);
        this.pnlGrupo.btnCuatro.addActionListener(this);
        this.pnlGrupo.btnCinco.addActionListener(this);
        this.pnlGrupo.btnSeis.addActionListener(this);
        this.pnlGrupo.btnSiete.addActionListener(this);
        this.pnlGrupo.btnOcho.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pnlGrupo.btnAtras){
            PanelPantallaPrincipal ppp = new PanelPantallaPrincipal(user, ip);
            PanelBuscar pb = new PanelBuscar();
            VentanaTotal fma = new VentanaTotal();
            PanelIntereses pi = new PanelIntereses();
            CtrlPantPrincipal cpp = new CtrlPantPrincipal(fma, ppp, pb, pi, user, pp, ip, ci, lista);
            frmVentana.dispose();
            fma.setVisible(true);
        }
    }
}
