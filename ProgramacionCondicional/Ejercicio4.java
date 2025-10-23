package EjerciciosAlgoritmia.ProgramacionCondicional;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Ingresa el tecer numero: ");
        int num3 = sc.nextInt();
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("Los numero son iguales.");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("El numero " + num1 + " es mayor.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero " + num2 + " es mayor.");
        } else {
            System.out.println("El numero " + num3 + " es mayor.");
        }

        sc.close();
    }
}
