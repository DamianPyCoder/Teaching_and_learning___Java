import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Tu nombre completo es: " + nombre + " " + apellido);
        System.out.println("Tu edad es: " + edad);
    }
}
