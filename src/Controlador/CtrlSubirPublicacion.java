package Controlador;

import Modelo.ConsultasImagen;
import Modelo.ImagenPub;
import Modelo.ListaCDE;
import Modelo.PalabrasProhibidas;
import Modelo.UsuarioR;
import Vista.PanelBuscar;
import Vista.PanelEscogerEtiquetas;
import Vista.PanelIntereses;
import Vista.PanelPantallaPrincipal;
import Vista.PanelSubirPublicacionDos;
import Vista.PanelSubirPublicacionUno;
import Vista.VentanaTotal;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author boris
 */
public class CtrlSubirPublicacion implements ActionListener {

    private VentanaTotal frmVentana;
    private PanelSubirPublicacionUno pnlPubUno;
    private PanelSubirPublicacionDos pnlPubDos;
    private PanelEscogerEtiquetas pnlEtiquetas;
    private UsuarioR user;
    private PalabrasProhibidas pp;

    private ConsultasImagen ci;
    private ImagenPub ip;

    private String ruta = "";
    private ListaCDE<ImagenPub> lista;

    private boolean imagenCargada = false;
    int aux = 0;
    private boolean imagDefecto = false;

    public CtrlSubirPublicacion(VentanaTotal frmVentana, PanelSubirPublicacionUno pnlPubUno, PanelSubirPublicacionDos pnlPubDos,
            PanelEscogerEtiquetas pnlEtiquetas, UsuarioR user, PalabrasProhibidas pp, ConsultasImagen ci, ImagenPub ip,
            ListaCDE<ImagenPub> lista) {

        this.frmVentana = frmVentana;
        this.pnlEtiquetas = pnlEtiquetas;
        this.pnlPubDos = pnlPubDos;
        this.pnlPubUno = pnlPubUno;
        this.user = user;
        this.pp = pp;
        this.ci = ci;
        this.ip = ip;
        this.lista = lista;

        frmVentana.add(pnlPubUno);

        this.pnlPubUno.btnAtras.addActionListener(this);
        this.pnlPubUno.btnSgtPaso.addActionListener(this);

        this.pnlPubDos.btnAtras.addActionListener(this);
        this.pnlPubDos.btnEtiqueta.addActionListener(this);
        this.pnlPubDos.btnGaleria.addActionListener(this);
        this.pnlPubDos.btnImagen.addActionListener(this);
        this.pnlPubDos.btnPublicar.addActionListener(this);

        this.pnlEtiquetas.btnAceptar.addActionListener(this);
        this.pnlEtiquetas.btnAtras.addActionListener(this);

        this.pnlPubDos.btnAgregarImagenAleatoria.addActionListener(this);
        this.pnlPubDos.btnSubirAleatoria.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == pnlPubUno.btnAtras) {

            PanelPantallaPrincipal ppp = new PanelPantallaPrincipal(user, ip);
            PanelBuscar pb = new PanelBuscar();
            VentanaTotal fm = new VentanaTotal();
            PanelIntereses pi = new PanelIntereses();
            CtrlPantPrincipal cpp = new CtrlPantPrincipal(fm, ppp, pb, pi, user, pp, ip, ci, lista);
            frmVentana.dispose();
            fm.setVisible(true);
        }
        if (e.getSource() == pnlPubUno.btnSgtPaso) {

            if (pp.filtro(pnlPubUno.txtCaja.getText()) == true) {
                pnlPubDos.setVisible(true);
                frmVentana.setContentPane(pnlPubDos);
                ip.setTextoPublicacion(pnlPubUno.txtCaja.getText());
                pnlPubDos.txtPublicacion.setText(ip.getTextoPublicacion());
            } else {
                JOptionPane.showMessageDialog(null, "tu publicacion contiene palabras prohibidas");
            }
            System.out.println(user.getNombre_u() + " " + user.getTipoUsuario());
        }
        if (e.getSource() == pnlPubDos.btnAtras) {
            pnlPubUno.setVisible(true);
            frmVentana.setContentPane(pnlPubUno);
        }
        if (e.getSource() == pnlPubDos.btnEtiqueta) {
            pnlEtiquetas.setVisible(true);
            frmVentana.setContentPane(pnlEtiquetas);

            ip.setIdCategoria(seleccionCateg());
        }
        if (e.getSource() == pnlPubDos.btnGaleria) {

            if (ip.getIdCategoria() != 0) {

                pnlPubDos.publicacion.removeAll();
                pnlPubDos.publicacion.setText(ip.getTextoPublicacion());
                buscarArchivo(pnlPubDos.publicacion);
            } else {
                JOptionPane.showMessageDialog(null, "Primero seleccione una categoria");
            }

        }
        if (e.getSource() == pnlPubDos.btnImagen) {

            if (ip.getIdCategoria() != 0) {
                pnlPubDos.publicacion.removeAll();
                pnlPubDos.publicacion.setText(ip.getTextoPublicacion());
                ListaCDE<byte[]> listaA = ci.cargarAleatorio(ip.getIdCategoria(), ip);
                if (aux == listaA.longitud()) {
                    aux = 0;
                }
                ip.setImagen(ci.mostrarImagenesAleatorias(listaA, pnlPubDos.publicacion, aux));
                aux++;
                imagenCargada = true;
                imagDefecto = true;
            } else {
                JOptionPane.showMessageDialog(null, "Primero seleccione una categoria");
            }

        }
        if (e.getSource() == pnlPubDos.btnPublicar) {

            if (imagenCargada == true) {
                if (imagDefecto != true) {
                    ImagenPub mImagen = new ImagenPub();
                    mImagen.setTextoPublicacion(pnlPubDos.txtPublicacion.getText().trim());
                    mImagen.setImagen(ci.getImagen(ruta));
                    mImagen.setIdUsuario(user.getIdUsuario());
                    mImagen.setIdCategoria(seleccionCateg());
                    try {
                        if (ci.publicarA(mImagen, user)) {
                            JOptionPane.showMessageDialog(null, "Publicación realizada");
                            lista = ci.CargarImagenes();
                            

                            PanelPantallaPrincipal ppp = new PanelPantallaPrincipal(user, ip);
                            PanelBuscar pb = new PanelBuscar();
                            VentanaTotal fm = new VentanaTotal();
                            PanelIntereses pi = new PanelIntereses();
                            CtrlPantPrincipal cpp = new CtrlPantPrincipal(fm, ppp, pb, pi, user, pp, ip, ci, lista);
                            frmVentana.dispose();
                            fm.setVisible(true);
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(CtrlSubirPublicacion.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "error al publicar imagen");
                    }
                } else {
                    ip.setTextoPublicacion(pnlPubDos.txtPublicacion.getText().trim());
                    ip.setIdUsuario(user.getIdUsuario());
                    ip.setIdCategoria(seleccionCateg());
                    try {
                        if (ci.publicarA(ip, user)) {
                            JOptionPane.showMessageDialog(null, "Publicación realizada");
                            lista = ci.CargarImagenes();
                            PanelPantallaPrincipal ppp = new PanelPantallaPrincipal(user, ip);
                            PanelBuscar pb = new PanelBuscar();
                            VentanaTotal fm = new VentanaTotal();
                            PanelIntereses pi = new PanelIntereses();
                            CtrlPantPrincipal cpp = new CtrlPantPrincipal(fm, ppp, pb, pi, user, pp, ip, ci, lista);
                            frmVentana.dispose();
                            fm.setVisible(true);
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(CtrlSubirPublicacion.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "error al publicar imagen");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "primero selecciona\nuna imagen");
            }

        }
        if (e.getSource() == pnlEtiquetas.btnAceptar) {
            pnlPubDos.setVisible(true);
            frmVentana.setContentPane(pnlPubDos);
        }
        if (e.getSource() == pnlEtiquetas.btnAtras) {
            pnlPubDos.setVisible(true);
            frmVentana.setContentPane(pnlPubDos);
        }
        if (e.getSource() == pnlPubDos.btnAgregarImagenAleatoria) {
            if (ip.getIdCategoria() != 0) {

                pnlPubDos.publicacion.removeAll();
                buscarArchivo(pnlPubDos.publicacion);
            } else {
                JOptionPane.showMessageDialog(null, "Primero seleccione una categoria");
            }
        }
        if (e.getSource() == pnlPubDos.btnSubirAleatoria) {

            if (imagenCargada == true) {
                ImagenPub mImagen = new ImagenPub();
                mImagen.setImagen(ci.getImagen(ruta));
                mImagen.setIdCategoria(seleccionCateg());
                try {
                    if (ci.publicarAleatorio(mImagen)) {
                        JOptionPane.showMessageDialog(null, "Publicación realizada");
                        lista = ci.CargarImagenes();
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CtrlSubirPublicacion.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "error al publicar imagen");
                }
            } else {
                JOptionPane.showMessageDialog(null, "selecciona una imagen");
            }
        }
    }

    private int seleccionCateg() {
        if (pnlEtiquetas.rbtnTodos.isSelected()) {
            return 1;
        } else if (pnlEtiquetas.rbtnTecnologia.isSelected()) {
            return 2;
        } else if (pnlEtiquetas.rbtnJuegos.isSelected()) {
            return 3;
        } else if (pnlEtiquetas.rbtnMusica.isSelected()) {
            return 4;
        } else if (pnlEtiquetas.rbtnCine.isSelected()) {
            return 5;
        } else if (pnlEtiquetas.rbtnAnimales.isSelected()) {
            return 6;
        } else if (pnlEtiquetas.rbtnDeportes.isSelected()) {
            return 7;
        } else if (pnlEtiquetas.rbtnPolitica.isSelected()) {
            return 8;
        } else if (pnlEtiquetas.rbtnArte.isSelected()) {
            return 9;
        } else if (pnlEtiquetas.rbtnNaturaleza.isSelected()) {
            return 10;
        }
        return 0;
    }

    private void buscarArchivo(JLabel lblImagen) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        fileChooser.setFileFilter(extensionFilter);

        int seleccion = fileChooser.showOpenDialog(lblImagen);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            ruta = fileChooser.getSelectedFile().getAbsolutePath();
            Image mImagen = new ImageIcon(ruta).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), 0));
            lblImagen.setIcon(mIcono);
            imagenCargada = true;
        }
    }
}
