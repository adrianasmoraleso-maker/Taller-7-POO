public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Ana García", 3500.0);

        // Acceso directo al atributo público
        System.out.println("Nombre: " + emp.nombre);
        System.out.println("Salario: " + emp.getSalario());

        emp.setSalario(4000.0);
        System.out.println("Nuevo salario: " + emp.getSalario());

        // Prueba de validación del setter
        try {
            emp.setSalario(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
