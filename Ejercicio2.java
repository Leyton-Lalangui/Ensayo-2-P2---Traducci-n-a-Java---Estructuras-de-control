package ejercicio2;
import java.util.Scanner;
/**
 * @author [Leyton Joao Lalangui Herrera]
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        int suma, resta, multiplicacion, residuo;
        double division;

        System.out.println("Ingrese el primer numero entero:");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero entero:");
        num2 = scanner.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);

        if (num2 != 0) {
            division = (double) num1 / num2;
            residuo = num1 % num2;
            System.out.println("Division: " + division);
            System.out.println("Residuo: " + residuo);
        } else {
            System.out.println("No se puede dividir entre cero");
        }

        scanner.close();
    }
}