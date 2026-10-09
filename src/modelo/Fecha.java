package modelo;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private int cDias;
    
    public Fecha(int dd, int mm, int aaaa){
        setDia(dd);
        setMes(mm);
        setAnio(aaaa);
    }

    public Fecha(int aaaa){
        setAnio(aaaa);
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        if(dia <= 0 || dia > 30){
            System.err.println("Día no válido");
            return;
        }
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        if (mes <= 0 || mes > 12){
            System.err.println("Mes no válido");
            return;
        }
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if(anio <= 2026){//De acuerdo con el contexto, el año lógicamente no debe ser menor a 2026;
            System.err.println("Año no válido");
            return;
        }
        this.anio = anio;
    }
    
    public void setCantidadDias(Fecha f1, Fecha f2){ ///f1 = fecha inicial, f2 = fecha final
        cDias = ((f2.getAnio() - f1.getAnio())*360) - (f2.getMes() - f1.getMes())*30 - f1.getDia() + f2.getDia();

    }

    public int getCantidadDias(){
        return cDias;
    }
    public int getCantidadDias(Fecha f1){
        return cDias;
    }
}
