package ioc.xtec.cat.calculadora;

public class Operacions {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

      public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("El divisor no pot ser zero");
        }
        return a / b;
    }
}
