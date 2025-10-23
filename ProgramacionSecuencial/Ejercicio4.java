package EjerciciosAlgoritmia.ProgramacionSecuencial;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los grados en Celsius: ");
        float c = sc.nextFloat();

        System.out.println("Los grados Celsius en Fahrenheit: ");
        System.out.println("(" + c + " x 9 / 5) + 32 = " + ((c * 9/5) + 32));

        sc.close();
    }
}
