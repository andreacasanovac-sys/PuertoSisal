package modelo;

public class Empresa {
    private Alquiler[] barco;
    private String nombre;
    private int slots;

    public Empresa(String nombre) {
        barco = new Alquiler[3];
        this.nombre = nombre;
        slots = 0;
    }

    public void setAlquiler(Alquiler solicitud){
        this.barco[slots] = solicitud;
        slots++;
    }
    
    public Alquiler getAlquiler(){
        return barco[slots - 1];
    }

    public String printReporte(Alquiler cliente, Barco barco, Fecha dias){
        return "Nombre del titular: " + cliente.getNombreCliente() + "\n" +
        "Dias contratados: " + dias.getCantidadDias(dias.setCantidadDias(cliente.getFechaInicial(),cliente.getFechaFinal())) + "\n" +
        "Total a pagar: " + cliente.calcularAlquiler(dias, barco);
    }

}
