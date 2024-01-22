package n1exercici1;

public class TreballadorOnline extends Treballador{
    private final double TARIFAPLANA = 40.9;

    public TreballadorOnline(String nombre, String apellido, double sueldoHora){
        super(nombre, apellido, sueldoHora);

    }

    public double getTARIFAPLANA() {
        return TARIFAPLANA;
    }

    @Override
    public String toString() {
        return super.toString() + " y la tarifa plana le ha costado " + TARIFAPLANA;
    }
    @Override
    public double calcularSueldo(double horasTrabajadasMes){
        double sueldoMes = (horasTrabajadasMes * sueldoHora) + TARIFAPLANA;
        return sueldoMes;
    }
}
