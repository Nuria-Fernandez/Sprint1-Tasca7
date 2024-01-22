package n1exercici2;


import n1exercici1.TreballadorOnline;
import n1exercici1.TreballadorPresencial;

public class Main {
    public static void main(String[] args){
        @SuppressWarnings("deprecation")
        TreballadorPresencial primero = new TreballadorPresencial("Toni", "Cabanes", 7, 150);
        primero.metodoDeprecated();
        TreballadorOnline segundo = new TreballadorOnline("Lola", "Mejías", 9);
        segundo.metodoDeprecated();



    }
}
