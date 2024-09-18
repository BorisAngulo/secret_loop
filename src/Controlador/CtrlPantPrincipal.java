package Controlador;

import Modelo.Comentarios;
import Modelo.ConsultaComentarios;
import Modelo.ConsultaReportes;
import Modelo.ConsultaUsuarioR;
import Modelo.ConsultasImagen;
import Modelo.ImagenPub;
import Modelo.ListaCDE;
import Modelo.PalabrasProhibidas;
import Modelo.UsuarioR;
import Vista.PanelAjusteCuenta;
import Vista.PanelAyuda;
import Vista.PanelBuscar;
import Vista.PanelComentarios;
import Vista.PanelComoEmpezar;
import Vista.PanelConCuenta;
import Vista.PanelContactanos;
import Vista.PanelEscogerEtiquetas;
import Vista.PanelGrupos;
import Vista.PanelInfoInterfaz;
import Vista.PanelInicio;
import Vista.PanelIntereses;
import Vista.PanelPantallaPrincipal;
import Vista.PanelPerfil;
import Vista.PanelRegistro;
import Vista.PanelReportes;
import Vista.PanelSubirPublicacionDos;
import Vista.PanelSubirPublicacionUno;
import Vista.PanelTerminosYLimitaciones;
import Vista.VentanaPequenia;
import Vista.VentanaTotal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author boris
 */
public class CtrlPantPrincipal implements ActionListener {

    private PanelPantallaPrincipal pnlPrin;
    private PanelBuscar pnlBuscar;
    private VentanaTotal frmVentana;
    private PanelIntereses pnlInteres;
    private UsuarioR user;
    private PalabrasProhibidas pp;
    private ImagenPub ip;
    private ConsultasImagen ci;
    private ListaCDE<ImagenPub> lista;
    private int aux = 0;
    
    private boolean activo;
    private String nombre;

    public CtrlPantPrincipal(VentanaTotal frmVentana, PanelPantallaPrincipal pnlPrin, PanelBuscar pnlBuscar, PanelIntereses pnlInteres,
            UsuarioR user, PalabrasProhibidas pp, ImagenPub ip, ConsultasImagen ci, ListaCDE<ImagenPub> lista) {
        this.pnlPrin = pnlPrin;
        this.pnlBuscar = pnlBuscar;
        this.frmVentana = frmVentana;
        this.pnlInteres = pnlInteres;
        this.user = user;
        this.pp = pp;
        this.ip = ip;
        this.ci = ci;
        this.lista = lista;
        
        
        this.pnlPrin.txtPublicacion.setText("");
        this.frmVentana.add(pnlPrin);

        this.lista = this.ci.CargarImagenes();

        this.pnlPrin.btnAnterior.addActionListener(this);
        this.pnlPrin.btnAyuda.addActionListener(this);
        this.pnlPrin.btnBuscar.addActionListener(this);
        this.pnlPrin.btnChat.addActionListener(this);
        this.pnlPrin.btnComentar.addActionListener(this);
        this.pnlPrin.btnDislike.addActionListener(this);
        this.pnlPrin.btnGrupoUsuarios.addActionListener(this);
        this.pnlPrin.btnIntereses.addActionListener(this);
        this.pnlPrin.btnLike.addActionListener(this);
        this.pnlPrin.btnPerfil.addActionListener(this);
        this.pnlPrin.btnReportar.addActionListener(this);
        this.pnlPrin.btnSalir.addActionListener(this);
        this.pnlPrin.btnSiguiente.addActionListener(this);
        this.pnlPrin.btnSubirPublicacion.addActionListener(this);

        this.pnlBuscar.btnAtras.addActionListener(this);
        this.pnlBuscar.btnBuscar.addActionListener(this);

        this.pnlInteres.btnAtras.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == pnlPrin.btnGrupoUsuarios) {
            PanelGrupos pg = new PanelGrupos();
            VentanaTotal frm = new VentanaTotal();

            CtrlGrupos cg = new CtrlGrupos(frm, pg, pp, user, ip, ci, lista);
            frmVentana.dispose();
            frm.setVisible(true);
        }
        if (e.getSource() == pnlPrin.btnIntereses) {
            pnlInteres.setVisible(true);
            frmVentana.setContentPane(pnlInteres);
        }
        if (e.getSource() == pnlPrin.btnAyuda) {

            VentanaTotal frm = new VentanaTotal();
            PanelAyuda pnlAyuda = new PanelAyuda();
            PanelInfoInterfaz pnlInfoInterfaz = new PanelInfoInterfaz();
            PanelAjusteCuenta pnlAjusteCuenta = new PanelAjusteCuenta();
            PanelComoEmpezar pnlComoEmpezar = new PanelComoEmpezar();
            PanelContactanos pnlContactanos = new PanelContactanos();

            CtrlAyuda ca = new CtrlAyuda(frm, pnlAyuda, pnlInfoInterfaz, pnlAjusteCuenta, pnlComoEmpezar, pnlContactanos, user, pp, ip, ci, lista);
            frmVentana.dispose();
            frm.setVisible(true);

        }
        if (e.getSource() == pnlPrin.btnSalir) {

            VentanaTotal vi = new VentanaTotal();
            PanelInicio pi = new PanelInicio();
            PanelConCuenta pc = new PanelConCuenta();
            PanelTerminosYLimitaciones ptyc = new PanelTerminosYLimitaciones();
            PanelRegistro pr = new PanelRegistro();

            UsuarioR ur = new UsuarioR();
            ConsultaUsuarioR cur = new ConsultaUsuarioR();

            CtrlInicio ctrli = new CtrlInicio(pi, pr, vi, pc, ptyc, ur, cur, pp, ip, ci, lista);
            vi.setVisible(true);
            frmVentana.dispose();

        }
        if (e.getSource() == pnlPrin.btnBuscar) {
            pnlBuscar.setVisible(true);
            frmVentana.setContentPane(pnlBuscar);

        }
        if (e.getSource() == pnlPrin.btnReportar) {
            
            PanelReportes pnlReportes = new PanelReportes();
            VentanaPequenia frmVent = new VentanaPequenia();
            ConsultaReportes cre = new ConsultaReportes();
            
            
            CtrlReportes crep = new CtrlReportes(pnlReportes, frmVent, ip, cre);
            frmVent.setVisible(true);

        }
        if (e.getSource() == pnlPrin.btnComentar) {
            VentanaPequenia vp = new VentanaPequenia();
            PanelComentarios pc = new PanelComentarios();
            Comentarios comentario = new Comentarios();
            ConsultaComentarios conComentario = new ConsultaComentarios();
            ListaCDE<Comentarios> listacom = new ListaCDE<>();
            
            listacom = conComentario.cargarComentarios(listacom, ip.getIdImagen());
            pc = conComentario.mostrarComentarios(listacom, pc, ci);
            CtrlComentarios cc = new CtrlComentarios(pc, vp, user, ip, comentario, conComentario, ci);
            
            vp.setVisible(true);
        }
        if (e.getSource() == pnlPrin.btnLike) {
//            activo = ci.dioLike(ip, activo, false, aux, lista, pnlPrin);
        }
        if (e.getSource() == pnlPrin.btnDislike) {
//            activo = ci.dioDislike(ip, activo, false, aux, lista, pnlPrin);
        }
        if (e.getSource() == pnlPrin.btnAnterior) {
            
            ci.mostrarImagenes(lista, pnlPrin.publicacion, aux, ip);
            nombre = ci.obtenerNombre(lista.acceder(aux).getIdUsuario());
            ip.setIdImagen(ci.cargarDatos(aux, lista, pnlPrin, ip, nombre));
            
            aux--;
        }
        if (e.getSource() == pnlPrin.btnSiguiente) {
            
            ci.mostrarImagenes(lista, pnlPrin.publicacion, aux, ip);
            nombre = ci.obtenerNombre(lista.acceder(aux).getIdUsuario());
            ip.setIdImagen(ci.cargarDatos(aux, lista, pnlPrin, ip, nombre));
            
            aux++;
        }
        if (e.getSource() == pnlPrin.btnChat) {

        }
        if (e.getSource() == pnlPrin.btnSubirPublicacion) {

            VentanaTotal vt = new VentanaTotal();
            PanelSubirPublicacionUno pspu = new PanelSubirPublicacionUno();
            PanelSubirPublicacionDos pspd = new PanelSubirPublicacionDos(user, ip);
            PanelEscogerEtiquetas pee = new PanelEscogerEtiquetas();
            CtrlSubirPublicacion csp = new CtrlSubirPublicacion(vt, pspu, pspd, pee, user, pp, ci, ip, lista);
            vt.setVisible(true);
            frmVentana.dispose();

        }
        if (e.getSource() == pnlPrin.btnPerfil) {

            PanelPerfil pn = new PanelPerfil(user);
            VentanaTotal vt = new VentanaTotal();
            CtrlPerfil cp = new CtrlPerfil(vt, pn, user, pp, ip, ci, lista);
            frmVentana.dispose();
            vt.setVisible(true);

        }
        if (e.getSource() == pnlBuscar.btnAtras) {
            pnlPrin.setVisible(true);
            frmVentana.setContentPane(pnlPrin);
        }
        if (e.getSource() == pnlBuscar.btnBuscar) {

        }
        if (e.getSource() == pnlInteres.btnAtras) {
            pnlPrin.setVisible(true);
            frmVentana.setContentPane(pnlPrin);
        }
    }
}
