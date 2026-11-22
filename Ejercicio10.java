package ejercicio10;

import java.util.Scanner;

/**
 * @author [Leyton Joao Lalangui Herrera]
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ":");
            numero = scanner.nextInt();
            suma += numero;
        }

        promedio = (double) suma / 10;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}       