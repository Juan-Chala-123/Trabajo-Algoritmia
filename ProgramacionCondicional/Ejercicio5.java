package EjerciciosAlgoritmia.ProgramacionCondicional;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la nota final del 1 al 5: ");
        float notaFinal = sc.nextFloat();

        if (notaFinal >= 4 && notaFinal <= 5) {
            System.out.println("La nota es Suficiente.");
        } else if (notaFinal >= 3 && notaFinal < 4) {
            System.out.println("La nota es Buena.");
        } else if (notaFinal >= 0 && notaFinal < 3) {
            System.out.println("La nota es Insuficiente.");
        } else {
            System.out.println("Debes poner un numero entre el 1 al 5.");
        }

        sc.close();
    }
}
