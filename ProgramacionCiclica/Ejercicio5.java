package EjerciciosAlgoritmia.ProgramacionCiclica;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingre la cantidad de numero que va calcular: ");
        byte numero = sc.nextByte();

        float suma = 0;
        for (int i = 1; i <= numero; i++) {
            System.out.println("Ingrese la nota " + i + ": ");
            float nota = sc.nextFloat();
            suma += nota;
        }

        System.out.println("Promedio: " + (suma / numero));

        sc.close();
    }
}
