import java.util.Scanner;

public class ValidarNumeroPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número par:");
        int numero = scanner.nextInt();

        try {
            validarNumeroPar(numero);
            System.out.println("El número ingresado es par.");
        } catch (NumeroNoParException e) {
            System.out.println("Error: El número ingresado no es par.");
        }
    }

    public static void validarNumeroPar(int numero) throws NumeroNoParException {
        if (numero % 2 != 0) {
            throw new NumeroNoParException();
        }
    }
}


/*
La clase NumeroNoParException es una excepción personalizada que hereda de la clase Exception. 
En su constructor, se proporciona un mensaje de error indicando que el número ingresado no es par. */
class NumeroNoParException extends Exception {
    public NumeroNoParException() {
        super("El número ingresado no es par.");
    }
}
