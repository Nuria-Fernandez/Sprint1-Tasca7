package n1exercici1;

public class Treballador {
    protected String nombre;
    protected String apellido;
    protected double sueldoHora;

    public Treballador(String nombre, String apellido, double sueldoHora){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoHora = sueldoHora;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }
    public String toString(){
        return nombre + " " + apellido + " gana"
                + sueldoHora;
    }

    public double calcularSueldo(double horasTrabajadas){
        double sueldoTotal = horasTrabajadas * sueldoHora;
        return sueldoTotal;
    }
}
