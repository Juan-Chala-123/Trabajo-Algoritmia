package EjerciciosAlgoritmia.LogicaProposicional;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        byte number = sc.nextByte();

        if (number > 10 && number < 50) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }

        sc.close();
    }
}