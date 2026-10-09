package test;
import modelo.Empresa;
import modelo.Alquiler;
import modelo.Fecha;
import modelo.Barco;
public class MainSisal {
    public static void main(String[] args){
        Empresa sisal = new Empresa("El sol caliente");
        Barco barcoAndre = new Barco (33310212, 12.5);
        Barco barcoLeo = new Barco (12345678, 30);
        
        sisal.setAlquiler(new Alquiler("Andre Casanova", 21201333, new Fecha(9,10,2026), new Fecha(10,12,2026),'D', new Fecha(1965)));
               
        System.out.println(sisal.printReporte(sisal.getAlquiler(1), barcoAndre));


    }
}
