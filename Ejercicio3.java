package ejercicio3;

import java.util.Scanner;
/**
 * @author [Leyton Joao Lalangui Herrera]
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;

        System.out.println("Ingrese la edad de la persona:");
        edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }
    }
}