package ejercicio11;

import java.util.Scanner;

/**
 * @author [Leyton Joao Lalangui Herrera]
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        double mayor, menor;

        System.out.println("Ingrese el numero 1:");
        numero = scanner.nextDouble();
        mayor = numero;
        menor = numero;

        for (int i = 2; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ":");
            numero = scanner.nextDouble();

            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}
