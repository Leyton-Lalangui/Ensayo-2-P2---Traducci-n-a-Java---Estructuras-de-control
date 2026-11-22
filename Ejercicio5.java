package ejercicio5;

import java.util.Scanner;

/**
 * @author [Leyton Joao Lalangui Herrera]
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double calificacion;

        System.out.println("Ingrese una calificacion entre 0 y 10:");
        calificacion = scanner.nextDouble();

        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Excelente");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("Muy Bueno");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("Bueno");
        } else if (calificacion >= 5 && calificacion < 7) {
            System.out.println("Regular");
        } else if (calificacion >= 0 && calificacion < 5) {
            System.out.println("Deficiente");
        } else {
            System.out.println("Calificacion fuera de rango (debe estar entre 0 y 10)");
        }
    }
}