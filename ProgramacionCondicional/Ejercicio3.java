package EjerciciosAlgoritmia.ProgramacionCondicional;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor de la compra: ");
        int compra= sc.nextInt();

        if (compra > 100000) {
            System.out.println("Tienes un descuento del 10%.");
            System.out.println("Total: " + compra + " x 10% " + " = " + ((compra*0.10)+compra));
        } else {
            System.out.println("Total: " + compra);
        }
    }
}
