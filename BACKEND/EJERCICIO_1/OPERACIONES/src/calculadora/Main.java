package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Elige la operación (sumar, restar, multiplicar, dividir):");
        String operacion = scanner.next();

        Operacion operacionSeleccionada;

        switch (operacion.toLowerCase()) {
            case "sumar":
                operacionSeleccionada = new Sumar(numero1, numero2);
                break;
            case "restar":
                operacionSeleccionada = new Restar(numero1, numero2);
                break;
            case "multiplicar":
                operacionSeleccionada = new Multiplicar(numero1, numero2);
                break;
            case "dividir":
                operacionSeleccionada = new Dividir(numero1, numero2);
                break;
            default:
                System.out.println("Operación no válida");
                return;
        }

        double resultado = operacionSeleccionada.calcular();
        System.out.println("El resultado es: " + resultado);
    }
}
