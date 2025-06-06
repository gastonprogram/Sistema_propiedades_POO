import java.util.Date;

abstract public class Persona {

    int dni;
    String nombreCompleto;
    String email;
    String contrasenia;
    String telefono;
    Date fechaAlta;

    public abstract void verPerfil();

    public abstract void editarPerfil();

    public abstract void registrar();

    public abstract void iniciarSesion();




}
