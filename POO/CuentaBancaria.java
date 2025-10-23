package EjerciciosAlgoritmia.POO;
import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private int saldo;

    public CuentaBancaria(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar() {
        System.out.println("Ingrese el valor que desea depositar: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int suma = this.saldo + valor;
        System.out.println("Saldo actual: " + suma);
    }

    public void retirar() {
        System.out.println("Ingrese el valor que desea retirar: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int retiro = this.saldo - valor;
        System.out.println("Saldo actual: " + retiro);
    }

    public void mostrarSaldo() {
        System.out.println(this.saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el titular: ");
        String titular = sc.nextLine();

        System.out.println("Ingrese la accion (1- Depositar, 2- Retirar, 3- Mostrar Saldo): ");
        byte accion = sc.nextByte();

        CuentaBancaria cb = new CuentaBancaria(titular, 200000);

        if (accion == 1) {
            cb.depositar();
        } else if (accion == 2){
            cb.retirar();
        } else if (accion == 3) {
            cb.mostrarSaldo();
        } else {
            System.out.println("Error: Tiene que ser un numero entre el 1 y el 3.");
        }

        sc.close();
    }
}
