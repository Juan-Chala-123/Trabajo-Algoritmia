import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        byte number = sc.nextByte();

        if (number > 20 && number < 40) {
            System.out.println("El numero " + number + " esta entre 20 y 40");
        } else {
            System.out.println("El numero " + number + " no esta entre 20 y 40");
        }

        sc.close();
    }
}
