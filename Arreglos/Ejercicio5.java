package EjerciciosAlgoritmia.Arreglos;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa cuantas notas vas a ingresar: ");
        int n = sc.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingresa la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        int aprobadas = 0;
        for (int i = 0; i < n; i++) {
            if (notas[i] >= 3.0) {
                aprobadas++;
            }
        }

        System.out.println("Las notas aprobadas (>= 3.0) son: " + aprobadas);

        sc.close();
    }
}
