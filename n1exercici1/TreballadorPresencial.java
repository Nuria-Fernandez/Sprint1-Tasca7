package n1exercici1;

public class TreballadorPresencial extends Treballador {
    private static double gasolina;

    public TreballadorPresencial(String nombre, String apellido, double sueldoHora, double gasolina){
        super(nombre, apellido, sueldoHora);
        this.gasolina = gasolina;
    }

    public static double getGasolina() {
        return gasolina;
    }

    public static void setGasolina(double gasolina) {
        TreballadorPresencial.gasolina = gasolina;
    }
    public String toString(){
        return super.toString() + " y la gasolina le ha costado " + gasolina;
    }
    @Override
    public double calcularSueldo(double horasTrabajadasMes){
        double sueldo = (horasTrabajadasMes * sueldoHora) + gasolina;
        return sueldo;

    }
    @Deprecated
    public void metodoDeprecated(){
        System.out.println("Aquí tienes el método obsoleto");
    }
}
