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
    
    public Alquiler getAlquiler(int slot){
        if(slot < 1 || slot > 3){
            System.err.println("Slot no válido");
            return null;
        }
        return barco[slot - 1];
    }

    public String printReporte(Alquiler cliente, Barco barco){
        return "Nombre del titular: " + cliente.getNombreCliente() + "\n" +
        "Dias contratados: " + cliente.getcDias() + "\n" +
        "Total a pagar: " + cliente.calcularAlquiler(barco);
    }

}
