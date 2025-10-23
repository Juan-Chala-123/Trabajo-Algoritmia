package EjerciciosAlgoritmia.ProgramacionSecuencial;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el radio: ");
        byte radio = sc.nextByte();

        System.out.println("Area");
        System.out.println("El area del circulo es: ");
        System.out.println("(" + radio + " x " + radio + ") x " + Math.PI + " = " + ((radio * radio) * Math.PI) + "\n");

        System.out.println("Perimetro");
        System.out.println("El perimetro del circulo es: ");
        System.out.println("(2 x " + radio + ") x " + Math.PI + " = " + ((2 * radio) * Math.PI));

        sc.close();
    }
}
