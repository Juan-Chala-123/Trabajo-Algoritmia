package EjerciciosAlgoritmia.POO;
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private double[] notas;

    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public void calcularPromedio() {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingresa la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        double promedio = (double) suma / notas.length;
        System.out.println("El promedio de " + nombre + " es: " + promedio);

        if (promedio >= 3.0 && promedio <= 5.0) {
            System.out.println("El estudiante aprueba.");
        } else if (promedio >= 1.0 && promedio < 3.0) {
            System.out.println("El estudiante no aprueba.");
        } else {
            System.out.println("Error: el numero debe ser entre 1 y 5.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        Estudiante estudiante = new Estudiante(nombre, notas);

        estudiante.calcularPromedio();

        sc.close();
    }
}
