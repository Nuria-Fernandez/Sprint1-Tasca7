package n1exercici1;

public class Main {
    public static void main(String[] args){
        Treballador primero = new Treballador("Antonio", "Ruiz", 8.5);
        TreballadorPresencial segundo = new TreballadorPresencial("Rosa", "García", 8.5, 200);
        TreballadorOnline tercero = new TreballadorOnline("Luis", "Martín", 8.5);

        System.out.println(primero.calcularSueldo(150));
        System.out.println(segundo.calcularSueldo(150));
        System.out.println(tercero.calcularSueldo(150));
    }
}
