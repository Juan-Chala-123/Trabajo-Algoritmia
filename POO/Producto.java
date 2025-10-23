package EjerciciosAlgoritmia.POO;
import java.util.Scanner;

public class Producto {
    private String nombre;
    private int precio;
    private byte cantidad;

    public Producto(String nombre, int precio, byte cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void CalcularTotal() {
        int total = precio * cantidad;

        System.out.println("El total es: " + total);
    }

    public void AplicarDescuento() {
        int total = precio * cantidad;

        if (total >= 100000) {
            double descuento = total * 0.10;
            System.out.println("Se aplica un descuento del 10%");
            System.out.println("El total es: " + (descuento + total));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa el precio del producto: ");
        int precio = sc.nextInt();
        System.out.println("Ingresa la cantidad que deseas comprar: ");
        byte cantidad = sc.nextByte();

        Producto p1 = new Producto(nombre, precio, cantidad);

        if ((precio * cantidad) >= 100000) {
            p1.AplicarDescuento();
        } else {
            p1.CalcularTotal();
        }
    }
}
