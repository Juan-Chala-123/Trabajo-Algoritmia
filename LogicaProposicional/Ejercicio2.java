import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        byte age = sc.nextByte();

        if (age >= 18) {
            System.out.println("Puedes votar.");
        } else {
            System.out.println("No puedes votar.");
        }
        sc.close();
    }
}
