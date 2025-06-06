import java.util.Date;

public class Alquiler extends Propiedad {

    boolean alquilada;
    float precioPorMes;
    Date fechaPublicacion;
    float gastosAdministrativos;

    public Alquiler(String direccion, String tipo, String descripcion, float superficieTotal,int cantidadAmbientes, int aniosDeAntiguedad, boolean disponible, Propietario propietario, AgenteInmobiliario agenteAsignado,boolean alquilada, float precioPorMes ,Date fechaPublicacion, float gastosAdministrativos ) {
        this.direccion = direccion;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.superficieTotal = superficieTotal;
        this.cantidadAmbientes = cantidadAmbientes;
        this.disponible = disponible;
        this.propietario = propietario;
        this.agenteAsignado = agenteAsignado;
        this.alquilada = alquilada;
        this.precioPorMes = precioPorMes;
        this.fechaPublicacion = fechaPublicacion;
        this.gastosAdministrativos = gastosAdministrativos;
    }

    @Override
    public void mostrarDatos() {

    }

    @Override
    public void calcularPrecioFinal() {

    }

    @Override
    public void cambiarDisponibilidad() {

    }

    @Override
    public void mostrarDetalleCompleto() {

    }



}
