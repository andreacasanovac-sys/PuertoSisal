package modelo;

public class Alquiler {
    private String nombreCliente;
    private int clienteID;
    private Fecha fechaInicial;
    private Fecha fechaFinal;
    private char posicion;
    private Fecha anioFabricacion;
    private int mastiles;
    private int camarotes;
    private int cantidadDias;
    

    public Alquiler(String nombreCliente, int clienteID, Fecha fechaInicial, Fecha fechaFinal, char posicion, Fecha anioFabricacion) {
        this.nombreCliente = nombreCliente;
        this.clienteID = clienteID;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posicion = posicion;
        this.anioFabricacion = anioFabricacion;
    }

    public Alquiler(String nombreCliente, int clienteID, Fecha fechaInicial, Fecha fechaFinal, char posicion, Fecha anioFabricacion, int mastiles, int camarotes) {
        this.nombreCliente = nombreCliente;
        this.clienteID = clienteID;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posicion = posicion;
        this.anioFabricacion = anioFabricacion;
        this.mastiles = mastiles;
        this.camarotes = camarotes;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public Fecha getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Fecha fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Fecha getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Fecha fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public char getPosicion() {
        return posicion;
    }

    public void setPosicion(char posicion) {
        if(posicion != 'D' || posicion != 'I' || posicion != 'd' || posicion != 'i'){
            System.err.println("No se reconoce una posición válida");
            return;
        }
        this.posicion = posicion;
    }

    public Fecha getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Fecha anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public double calcularAlquiler(Barco pBarco){
        double alquiler = this.getcDias() * pBarco.getSubtotal();
        return alquiler;
    }
    
    public void setCantidadDias(Fecha dTotales){
        dTotales.setCantidadDias(this.getFechaInicial(), this.getFechaFinal());
        cantidadDias = dTotales.getCantidadDias();
    }

    public int getcDias(){
        return cantidadDias;
    }
}
