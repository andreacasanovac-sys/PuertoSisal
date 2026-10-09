package modelo;

public class Barco {
    private int matricula;
    private double tamEslora;
    private static int tarifa;

    public Barco(int matricula, double tamEslora) {
        this.matricula = matricula;
        this.tamEslora = tamEslora;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getTamEslora() {
        return tamEslora;
    }

    public void setTamEslora(double tamEslora) {
        this.tamEslora = tamEslora;
    }

    public static int getTarifa() {
        return tarifa;
    }

    public static void setTarifa(int tarifa) {
        Barco.tarifa = tarifa;
    }
    
    public double getSubtotal(){
        return getTarifa() * getTamEslora();
    }
    
}
