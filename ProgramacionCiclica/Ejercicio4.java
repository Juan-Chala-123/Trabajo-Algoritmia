package EjerciciosAlgoritmia.ProgramacionCiclica;

public class Ejercicio4 {
    public static void main(String[] args) {
        byte par = 0;
        byte impar = 0;
        byte numero = 0;

        while (numero < 50) {
            numero++;
            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es par.");
                par++;
            } else {
                System.out.println("El numero " + numero + " es impar.");
                impar++;
            }
        }

        System.out.println("El total de pares es: " + par);
        System.out.println("El total de impares es: " + impar);
    }
}
