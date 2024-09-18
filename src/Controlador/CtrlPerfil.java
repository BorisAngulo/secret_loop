package Controlador;

import Modelo.ConsultasImagen;
import Modelo.ImagenPub;
import Modelo.ListaCDE;
import Modelo.PalabrasProhibidas;
import Modelo.UsuarioR;
import Vista.PanelBuscar;
import Vista.PanelIntereses;
import Vista.PanelPantallaPrincipal;
import Vista.PanelPerfil;
import Vista.VentanaTotal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author boris
 */
public class CtrlPerfil implements ActionListener {

    private VentanaTotal frmVentana;
    private PanelPerfil pnlPerfil;
    private UsuarioR user;
    private PalabrasProhibidas pp;
    private ImagenPub ip;
    private ConsultasImagen ci;
    private ListaCDE<ImagenPub> lista;

    public CtrlPerfil(VentanaTotal frmVentana, PanelPerfil pnlPerfil, UsuarioR user, PalabrasProhibidas pp
                      , ImagenPub ip, ConsultasImagen ci, ListaCDE<ImagenPub> lista) {
        this.frmVentana = frmVentana;
        this.pnlPerfil = pnlPerfil;
        this.user = user;
        this.pp = pp;
        this.ip = ip;
        this.ci = ci;
        this.lista = lista;

        this.frmVentana.add(pnlPerfil);
        
        pnlPerfil.btnAtras.addActionListener(this);
        pnlPerfil.btnChats.addActionListener(this);
        pnlPerfil.btnEditDesc.addActionListener(this);
        pnlPerfil.btnEditEdad.addActionListener(this);
        pnlPerfil.btnPubl.addActionListener(this);
        pnlPerfil.btnGrupos.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pnlPerfil.btnAtras) {
            
            PanelPantallaPrincipal ppp = new PanelPantallaPrincipal(user, ip);
            PanelBuscar pb = new PanelBuscar();
            VentanaTotal fm = new VentanaTotal();
            PanelIntereses pi = new PanelIntereses();
            CtrlPantPrincipal cpp = new CtrlPantPrincipal(fm, ppp, pb, pi, user, pp, ip, ci, lista);
            frmVentana.dispose();
            fm.setVisible(true);
        }
        if (e.getSource() == pnlPerfil.btnChats) {

        }
        if (e.getSource() == pnlPerfil.btnEditDesc) {

        }
        if (e.getSource() == pnlPerfil.btnEditEdad) {

        }
        if (e.getSource() == pnlPerfil.btnGrupos) {

        }
        if (e.getSource() == pnlPerfil.btnPubl) {

        }
    }
}
