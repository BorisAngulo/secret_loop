
package Modelo;

/**
 *
 * @author boris
 */
public class UsuarioR {
    private int idUsuario;
    private String usuario_u;
    private String contrasenia_u;
    private String nombre_u;
    private int tipoUsuario;

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    private String descripción_u;
    private String edad_u;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario_u() {
        return usuario_u;
    }

    public void setUsuario_u(String usuario_u) {
        this.usuario_u = usuario_u;
    }

    public String getContrasenia_u() {
        return contrasenia_u;
    }

    public void setContrasenia_u(String contrasenia_u) {
        this.contrasenia_u = contrasenia_u;
    }

    public String getNombre_u() {
        return nombre_u;
    }

    public void setNombre_u(String nombre_u) {
        this.nombre_u = nombre_u;
    }

    public String getDescripción_u() {
        return descripción_u;
    }

    public void setDescripción_u(String descripción_u) {
        this.descripción_u = descripción_u;
    }

    public String getEdad_u() {
        return edad_u;
    }

    public void setEdad_u(String edad_u) {
        this.edad_u = edad_u;
    }
}
