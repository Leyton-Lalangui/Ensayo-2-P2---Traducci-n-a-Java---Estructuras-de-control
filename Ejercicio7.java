package ejercicio7;

import java.util.Scanner;

/**
 * @author [Leyton Joao Lalangui Herrera]
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int cantidad = 0;
        int suma = 0;

        System.out.println("Ingrese un numero positivo (negativo para terminar):");
        numero = scanner.nextInt();

        while (numero >= 0) {
            cantidad++;
            suma += numero;

            System.out.println("Ingrese otro numero positivo (negativo para terminar):");
            numero = scanner.nextInt();
        }

        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
    }
}
