package EjerciciosAlgoritmia.ProgramacionSecuencial;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor del producto: ");
        int a = sc.nextInt();

        System.out.println("IVA (19%): 19% x " + a + " = " + (0.19 * a));
        System.out.println("Total: " + ((0.19 * a) + a));

        sc.close();
    }
}
