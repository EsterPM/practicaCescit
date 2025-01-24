package ioc.xtec.cat.calculadora;

public class Operacions {

    public static double sumar(double a, double b) {
        return a + b;
    }
    
    public static double restar(double a, double b) {
	return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("El divisor no pot ser zero");
        }
        return a / b;
    }
}
