package EjerciciosAlgoritmia.ProgramacionSecuencial;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        float number1 = sc.nextByte();

        System.out.println("Ingresa el segundo numero: ");
        float number2 = sc.nextByte();

        System.out.println("Operaciones Matematicas:");
        System.out.println("Suma: " + number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println("Resta: " + number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println("Division: " + number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println("Multiplicacion: " + number1 + " x " + number2 + " = " + (number1 * number2));

        sc.close();
    }
}
