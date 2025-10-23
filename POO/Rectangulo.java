package EjerciciosAlgoritmia.POO;
import java.util.Scanner;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        System.out.println("Area");
        System.out.println(this.base + " x " + this.altura + " = " + (this.base * this.altura));
    }

    public void calcularPerimetro() {
        System.out.println("Perimetro");
        int perimetro = 2 * (this.base + this.altura);
        System.out.println(this.base + " + " + this.base + " + " + this.altura + " + " + this.altura + " = " + perimetro + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor de la base del Rectangulo: ");
        int base = sc.nextInt();

        System.out.println("Ingresa el valor de la altura del Rectangulo: ");
        int altura = sc.nextInt();

        Rectangulo rc = new Rectangulo(base, altura);

        rc.calcularArea();
        rc.calcularPerimetro();
        sc.close();
    }
}
