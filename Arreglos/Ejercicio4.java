package EjerciciosAlgoritmia.Arreglos;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Ingresa 10 numeros.");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Arraglo Invertido.");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}
