package EjerciciosAlgoritmia.ProgramacionCondicional;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la edad: ");
        byte age = sc.nextByte();

        if (age >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        sc.close();
    }
}
