package EjerciciosAlgoritmia.POO;
import java.util.Scanner;

public class Persona {
    private String name;
    private byte age;

    public Persona(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public void mayorEdad() {
        if (age >= 18) {
            System.out.println("La persona " + this.name + " es mayor de edad.");
        } else {
            System.out.println("La persona " + this.name + " no es mayor de edad.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la persona: ");
        String name = sc.nextLine();

        System.out.println("Ingresa la edad: ");
        byte age = sc.nextByte();

        Persona persona = new Persona(name, age);

        persona.mayorEdad();

        sc.close();
    }
}
