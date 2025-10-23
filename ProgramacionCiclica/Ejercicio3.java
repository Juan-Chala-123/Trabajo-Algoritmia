package EjerciciosAlgoritmia.ProgramacionCiclica;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero de la tabla que quieres ver: ");
        byte numero = sc.nextByte();
        byte counter = 0;

        System.out.println("Tabla de multiplicar del numero " + numero);

        while (counter < 10) {
            counter ++;
            System.out.println(numero + " x " + counter + " = " + (numero * counter));
        }
        sc.close();
    }
}
