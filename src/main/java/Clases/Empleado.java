public class Empleado {
    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    //Este es el getter: devuelve el valor del salario
    public double getSalario() {

        return salario;
    }

    // Este es el setter: establece el salario y valida que este no sea negativo
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
        this.salario = salario;
    }
}
