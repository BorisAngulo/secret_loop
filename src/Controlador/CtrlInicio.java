package Controlador;

import Modelo.ConsultaUsuarioR;
import Modelo.ConsultasImagen;
import Modelo.ImagenPub;
import Modelo.ListaCDE;
import Modelo.PalabrasProhibidas;
import Modelo.UsuarioR;
import Vista.PanelBuscar;
import Vista.PanelConCuenta;
import Vista.PanelInicio;
import Vista.PanelIntereses;
import Vista.PanelPantallaPrincipal;
import Vista.PanelRegistro;
import Vista.PanelTerminosYLimitaciones;
import Vista.VentanaTotal;
import Vista.VentanaSalir;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author boris
 */
public class CtrlInicio implements ActionListener {

    private VentanaTotal frmInicio;
    private PanelInicio pnlInicio;
    private PanelRegistro pnlRegistro;
    private PanelTerminosYLimitaciones pnlTYL;
    private PanelConCuenta pnlCuenta;
    private VentanaSalir frmSalir;

    private PalabrasProhibidas pp;
    private UsuarioR ur;
    private ConsultaUsuarioR cur;

    private ImagenPub ip;
    private ConsultasImagen ci;
    private ListaCDE<ImagenPub> lista;

    public CtrlInicio(PanelInicio pnlInicio, PanelRegistro pnlRegistro, VentanaTotal frmInicio,
            PanelConCuenta pnlCuenta, PanelTerminosYLimitaciones pnlTYL, UsuarioR ur, ConsultaUsuarioR cur, PalabrasProhibidas pp,
            ImagenPub ip, ConsultasImagen ci, ListaCDE<ImagenPub> lista) {

        this.frmInicio = frmInicio;
        this.pnlInicio = pnlInicio;
        this.pnlRegistro = pnlRegistro;
        this.pnlCuenta = pnlCuenta;
        this.pnlTYL = pnlTYL;

        this.ur = ur;
        this.cur = cur;
        this.pp = pp;
        this.ip = ip;
        this.ci = ci;
        this.lista = lista;

        this.frmInicio.add(pnlInicio);

        this.pnlRegistro.btnAtras.addActionListener(this);
        this.pnlRegistro.btnRegistro.addActionListener(this);

        this.pnlCuenta.btnAtras.addActionListener(this);
        this.pnlCuenta.btnNavegar.addActionListener(this);

        this.pnlInicio.btnConCuenta.addActionListener(this);
        this.pnlInicio.btnRegistro.addActionListener(this);
        this.pnlInicio.btnSinCuenta.addActionListener(this);
        this.pnlInicio.btnSalir.addActionListener(this);

        this.pnlTYL.btnAceptar.addActionListener(this);
        this.pnlTYL.btnNoAceptar.addActionListener(this);
    }

    public void Iniciar() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == pnlInicio.btnRegistro) {
            pnlTYL.setVisible(true);
            frmInicio.setContentPane(pnlTYL);

        }
        if (e.getSource() == pnlInicio.btnConCuenta) {
            pnlCuenta.setVisible(true);
            frmInicio.setContentPane(pnlCuenta);
        }
        if (e.getSource() == pnlInicio.btnSinCuenta) {

            if (cur.loginUserAnonimo(ur)) {
                PanelPantallaPrincipal ppp = new PanelPantallaPrincipal(ur, ip);
                PanelBuscar pb = new PanelBuscar();
                VentanaTotal fma = new VentanaTotal();
                PanelIntereses pi = new PanelIntereses();
                CtrlPantPrincipal cpp = new CtrlPantPrincipal(fma, ppp, pb, pi, ur, pp, ip, ci, lista);
                frmInicio.dispose();
                fma.setVisible(true);
            }
        }
        if (e.getSource() == pnlInicio.btnSalir) {
            frmSalir = new VentanaSalir();
            frmSalir.setVisible(true);
        }
        if (e.getSource() == pnlCuenta.btnAtras) {
            pnlInicio.setVisible(true);
            frmInicio.setContentPane(pnlInicio);
        }
        if (e.getSource() == pnlCuenta.btnNavegar) {

            if (!pnlCuenta.jtfUusario.getText().equals("") && !pnlCuenta.jtfContraseña.getText().equals("")) {

                ur.setUsuario_u(pnlCuenta.jtfUusario.getText());
                ur.setContrasenia_u(pnlCuenta.jtfContraseña.getText());

                if (cur.login(ur)) {
                    PanelPantallaPrincipal ppp = new PanelPantallaPrincipal(ur, ip);
                    PanelBuscar pb = new PanelBuscar();
                    VentanaTotal fm = new VentanaTotal();
                    PanelIntereses pi = new PanelIntereses();
                    CtrlPantPrincipal cpp = new CtrlPantPrincipal(fm, ppp, pb, pi, ur, pp, ip, ci, lista);
                    frmInicio.dispose();
                    fm.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
                }

            } else {
                JOptionPane.showMessageDialog(null, "debe ingresar sus datos");
            }
        }
        if (e.getSource() == pnlTYL.btnAceptar) {
            pnlRegistro.setVisible(true);
            frmInicio.setContentPane(pnlRegistro);
        }
        if (e.getSource() == pnlTYL.btnNoAceptar) {
            pnlInicio.setVisible(true);
            frmInicio.setContentPane(pnlInicio);
        }
        if (e.getSource() == pnlRegistro.btnAtras) {
            pnlTYL.setVisible(true);
            frmInicio.setContentPane(pnlTYL);
        }
        if (e.getSource() == pnlRegistro.btnRegistro) {

            if (pp.filtro(pnlRegistro.jtUsuario.getText())) {
                ur.setUsuario_u(pnlRegistro.jtUsuario.getText());
                ur.setContrasenia_u(pnlRegistro.jtRepitaContraseña.getText());
                ur.setDescripción_u(null);
                ur.setNombre_u(pnlRegistro.jtUsuario.getText());

                if (pnlRegistro.jtContraseña.getText().equals(pnlRegistro.jtRepitaContraseña.getText())) {

                    if (pnlRegistro.rbtnEdad1.isSelected()) {
                        ur.setEdad_u(pnlRegistro.rbtnEdad1.getLabel());
                        registroAux();
                    } else if (pnlRegistro.rbtnEdad2.isSelected()) {
                        ur.setEdad_u(pnlRegistro.rbtnEdad2.getLabel());
                        registroAux();
                    } else if (pnlRegistro.rbtnEdad3.isSelected()) {
                        ur.setEdad_u(pnlRegistro.rbtnEdad3.getLabel());
                        registroAux();
                    } else if (pnlRegistro.rbtnEdad4.isSelected()) {
                        ur.setEdad_u(pnlRegistro.rbtnEdad4.getLabel());
                        registroAux();
                    } else {
                        JOptionPane.showMessageDialog(null, "seleccione un rango de edad");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña no es igual en las\n dos cajas de texto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "su usuario contiene una palabra prohibida");
            }

        }
    }

    public void limpiar() {
        pnlRegistro.jtUsuario.setText("Ingrese su usuario");
        pnlRegistro.jtContraseña.setText("Ingrese una contraseña");
        pnlRegistro.jtRepitaContraseña.setText("repita su contraseña");
    }

    private void registroAux() {
        if (cur.registrar(ur, pnlRegistro.jtUsuario.getText(), pp)) {
            JOptionPane.showMessageDialog(null, "Registro Correcto");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar");
            limpiar();
        }
    }
}
