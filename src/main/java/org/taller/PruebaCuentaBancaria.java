public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("001-123456", 1500.0, "Ahorros");

        cuenta.mostrarDetalles();
        System.out.println();

        cuenta.setSaldo(2000.0);
        System.out.println("Saldo actualizado: $" + cuenta.getSaldo());

        // Acceso permitido al atributo público tipoCuenta
        //System.out.println("Tipo de cuenta: " + cuenta.tipoCuenta);

        // La siguiente línea causaría ERROR DE COMPILACIÓN porque numeroCuenta es privado:
        System.out.println(cuenta.numeroCuenta); // 'numeroCuenta' has private access
    }
}
