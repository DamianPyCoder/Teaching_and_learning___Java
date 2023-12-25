import java.util.Scanner;

public class Entrada {
    private static Scanner scanner = new Scanner(System.in);

    public static String readline() {
        System.out.print("Ingrese un valor: ");
        return scanner.nextLine();
    }
}

/*
Ejemplo:
public class Main {
    public static void main(String[] args) {
        String input = Entrada.readline();
        System.out.println("El usuario ingresó: " + input);
        // Aquí puedes realizar otras operaciones con el valor ingresado por el usuario
    }
}
*/