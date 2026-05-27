package org.taller;

public class PruebaUtilidades {
    public static void main(String[] args) {
        Utilidades util = new Utilidades();

        System.out.println("Suma 10 + 5 = " + util.sumar(10, 5));
        System.out.println("Resta 10 - 5 = " + util.restar(10, 5));
        System.out.println("Multiplicación 10 * 5 = " + util.multiplicar(10, 5));
        System.out.println("División 10 / 4 = " + util.dividir(10, 4));

        // Prueba de división entre cero
        try {
            util.dividir(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
    }
}
