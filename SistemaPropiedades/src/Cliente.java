import java.util.Date;

public class Cliente extends Usuario {


    public Cliente(int dni, String nombreCompleto, String email, String contrasenia, String telefono, Date fechaAlta, String perfil) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.contrasenia = contrasenia;
        this.telefono = telefono;
        this.fechaAlta = fechaAlta;
        this.perfil = perfil;
    }


    @Override
    public void verPerfil(){
        System.out.println("----- PERFIL DEL CLIENTE -----");
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Email: " + email);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Fecha de alta: " + fechaAlta);
        System.out.println("Perfil: " + perfil);
    }

    @Override
    public void editarPerfil(){}

    @Override
    public void registrar(){}

    @Override
    public void iniciarSesion(){}


    @Override
    public void actualizarPerfilUsuario(){}


    public void alquilarPropiedad(Alquiler propiedad){}

    public void reservarPropiedad(Alquiler propiedad){}

    public Contrato[] consultarContratosVigentes(){
        return null;
    }

    public void verHistorialPropiedades(){}

    public void comprarPropiedad(Venta propiedad){}


}
