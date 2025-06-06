abstract public class Propiedad {

    String direccion;
    String tipo;
    String descripcion;
    float superficieTotal;
    int cantidadAmbientes;
    int aniosDeAntiguedad;
    boolean disponible;
    Propietario propietario;
    AgenteInmobiliario agenteAsignado;

    public abstract void mostrarDatos();

    public abstract void calcularPrecioFinal();

    public abstract void cambiarDisponibilidad();

    public abstract void mostrarDetalleCompleto();
    



}
