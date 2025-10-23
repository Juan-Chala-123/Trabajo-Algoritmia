package EjerciciosAlgoritmia.ProgramacionSecuencial;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la primera nota: ");
        byte a = sc.nextByte();

        System.out.println("Ingresa la segunda nota: ");
        byte b = sc.nextByte();

        System.out.println("Ingresa la tercera nota: ");
        byte c = sc.nextByte();

        System.out.println("El promedio de las tres notas es: ");
        System.out.println("(" + a + " + " + b + " + " + c + ") / 3 = " + ((a+b+c)/3));

        sc.close();
    }
}
