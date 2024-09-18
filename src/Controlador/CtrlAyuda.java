package Controlador;

import Modelo.ConsultasImagen;
import Modelo.ImagenPub;
import Modelo.ListaCDE;
import Modelo.PalabrasProhibidas;
import Modelo.UsuarioR;
import Vista.PanelAjusteCuenta;
import Vista.PanelAyuda;
import Vista.PanelBuscar;
import Vista.PanelComoEmpezar;
import Vista.PanelContactanos;
import Vista.PanelInfoInterfaz;
import Vista.PanelIntereses;
import Vista.PanelPantallaPrincipal;
import Vista.VentanaTotal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * TERMINADO
 * @author boris
 */
public class CtrlAyuda implements ActionListener {

    private VentanaTotal frmVentana;
    private PanelAyuda pnlAyuda;
    private PanelInfoInterfaz pnlInfoInterfaz;
    private PanelAjusteCuenta pnlAjusteCuenta;
    private PanelComoEmpezar pnlComoEmpezar;
    private PanelContactanos pnlContactanos;
    private UsuarioR user;
    private PalabrasProhibidas pp;
    private ImagenPub ip;
    private ConsultasImagen ci;
    private ListaCDE<ImagenPub> lista;

    public CtrlAyuda(VentanaTotal frmVentana, PanelAyuda pnlAyuda, PanelInfoInterfaz pnlInfoInterfaz, PanelAjusteCuenta pnlAjusteCuenta,
            PanelComoEmpezar pnlComoEmpezar, PanelContactanos pnlContactanos, UsuarioR user, PalabrasProhibidas pp,
            ImagenPub ip, ConsultasImagen ci, ListaCDE<ImagenPub> lista) {

        this.frmVentana = frmVentana;
        this.pnlAjusteCuenta = pnlAjusteCuenta;
        this.pnlAyuda = pnlAyuda;
        this.pnlComoEmpezar = pnlComoEmpezar;
        this.pnlContactanos = pnlContactanos;
        this.pnlInfoInterfaz = pnlInfoInterfaz;
        this.user = user;
        this.pp = pp;
        this.ip = ip;
        this.ci = ci;
        this.lista = lista;

        this.frmVentana.add(pnlAyuda);

        this.pnlAyuda.btnAjusteCuenta.addActionListener(this);
        this.pnlAyuda.btnAtras.addActionListener(this);
        this.pnlAyuda.btnComoEmpezar.addActionListener(this);
        this.pnlAyuda.btnContactanos.addActionListener(this);
        this.pnlAyuda.btnInterfaz.addActionListener(this);

        this.pnlAjusteCuenta.btnAtras.addActionListener(this);

        this.pnlComoEmpezar.btnAtras.addActionListener(this);

        this.pnlContactanos.btnAtras.addActionListener(this);

        this.pnlInfoInterfaz.btnAtras.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pnlAyuda.btnAjusteCuenta) {
            pnlAjusteCuenta.setVisible(true);
            frmVentana.setContentPane(pnlAjusteCuenta);
        }
        if (e.getSource() == pnlAyuda.btnAtras) {
            
            PanelPantallaPrincipal ppp = new PanelPantallaPrincipal(user, ip);
            PanelBuscar pb = new PanelBuscar();
            VentanaTotal fma = new VentanaTotal();
            PanelIntereses pi = new PanelIntereses();
            CtrlPantPrincipal cpp = new CtrlPantPrincipal(fma, ppp, pb, pi, user, pp, ip, ci, lista);
            frmVentana.dispose();
            fma.setVisible(true);
            
        }
        if (e.getSource() == pnlAyuda.btnComoEmpezar) {
            pnlComoEmpezar.setVisible(true);
            frmVentana.setContentPane(pnlComoEmpezar);
        }
        if (e.getSource() == pnlAyuda.btnContactanos) {
            pnlContactanos.setVisible(true);
            frmVentana.setContentPane(pnlContactanos);
        }
        if (e.getSource() == pnlAyuda.btnInterfaz) {
            pnlInfoInterfaz.setVisible(true);
            frmVentana.setContentPane(pnlInfoInterfaz);
        }   
        if (e.getSource() == pnlAjusteCuenta.btnAtras) {
            pnlAyuda.setVisible(true);
            frmVentana.setContentPane(pnlAyuda);
        }
        if (e.getSource() == pnlComoEmpezar.btnAtras) {
            pnlAyuda.setVisible(true);
            frmVentana.setContentPane(pnlAyuda);
        }
        if (e.getSource() == pnlContactanos.btnAtras) {
            pnlAyuda.setVisible(true);
            frmVentana.setContentPane(pnlAyuda);
        }
        if (e.getSource() == pnlInfoInterfaz.btnAtras) {
            pnlAyuda.setVisible(true);
            frmVentana.setContentPane(pnlAyuda);
        }
    }
}
