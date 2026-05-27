public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
        this.tipoCuenta = tipoCuenta;
    }

    // Este es el getter, devuelve el saldo actual de la cuenta
    public double getSaldo() {
        return saldo;
    }

    // Este es el setter, establece el saldo y valida qu no sea negativo
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
        }
        this.saldo = saldo;
    }

    public void mostrarDetalles() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}
