public class Venta extends Propiedad{

    boolean vendida;
    float precioDeVenta;

    public Venta(String direccion, String tipo, String descripcion, float superficieTotal,int cantidadAmbientes, int aniosDeAntiguedad, boolean disponible, Propietario propietario, AgenteInmobiliario agenteAsignado, boolean vendida, float precioDeVenta) {
        this.direccion = direccion;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.superficieTotal = superficieTotal;
        this.cantidadAmbientes = cantidadAmbientes;
        this.aniosDeAntiguedad = aniosDeAntiguedad;
        this.disponible = disponible;
        this.propietario = propietario;
        this.agenteAsignado = agenteAsignado;
        this.vendida = vendida;
        this.precioDeVenta = precioDeVenta;
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
