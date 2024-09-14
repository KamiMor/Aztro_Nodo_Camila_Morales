package calculadora;

public class Dividir extends Operacion {

    public Dividir(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }
}
