import java.util.Date;

public class Contrato{

    int idContrato;
    Date fechaInicio;
    Date fechaFin;
    String formaDePago;
    String tipo;
    Cliente cliente;
    Propietario propietario;
    Propiedad propiedad;
    AgenteInmobiliario agenteInmobiliario;

    public Contrato(int idContrato, Date fechaInicio, Date fechaFin, String formaDePago, String tipo, Cliente cliente, Propietario propietario, Propiedad propiedad, AgenteInmobiliario agenteInmobiliario) {
        this.idContrato = idContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.formaDePago = formaDePago;
        this.tipo = tipo;
        this.cliente = cliente;
        this.propietario = propietario;
        this.propiedad = propiedad;
        this.agenteInmobiliario = agenteInmobiliario;
    }

    public void mostrarResumen(){

    }

    public void asociarCliente(Cliente cliente){}

    public void asociarPropiedad(Propiedad propiedad){}

    public void asociarPropietario(Propietario propietario){}

    public void asociarAgente(AgenteInmobiliario agenteInmobiliario){}





}
