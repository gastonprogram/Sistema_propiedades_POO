import java.util.Date;

public class Propietario extends Usuario {

    public Propietario(int dni, String nombreCompleto, String email, String contrasenia, int telefono, Date fechaAlta, String perfil) {
        this.dni = dni;
        this.nombreCOmpleto = nombreCompleto;
        this.email = email;
        this.contrasenia = contrasenia;
        this.telefono = telefono;
        this.fechaAlta = fechaAlta;
        this.perfil = perfil;
    }

    public void crearPropiedad(){}

    public void editarPropiedad(){}

    public void eliminarPropiedad(){}

    public void consultarPropiedadesPublicadas(){}



}
