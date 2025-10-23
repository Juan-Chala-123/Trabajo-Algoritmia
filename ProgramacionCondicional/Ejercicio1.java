package EjerciciosAlgoritmia.ProgramacionCondicional;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero: ");
        byte n = sc.nextByte();

        if (n % 2 == 0) {
            System.out.println("El numero " + n + " es par.");
        } else {
            System.out.println("El numero " + n + " no es par.");
        }

        sc.close();
    }
}
