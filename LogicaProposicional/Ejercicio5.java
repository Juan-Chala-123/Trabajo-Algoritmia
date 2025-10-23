import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año (ejemplo: 2025): ");
        short year = sc.nextShort();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("El año (" + year + ") es bisiesto.");
        } else {
            System.out.println("El año (" + year + ") no es bisiesto.");
        }
        sc.close();
    }
}
