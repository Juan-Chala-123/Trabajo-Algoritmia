package EjerciciosAlgoritmia.ProgramacionCiclica;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero natural hasta donde quieres sumar: ");
        int numero = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= numero; i++) {
            System.out.println(suma += i);
        }
        System.out.println("La suma de los primeros " + numero + " números naturales es: " + suma);

        sc.close();
    }
}
