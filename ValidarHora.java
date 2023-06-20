import java.util.Scanner;

public class ValidarHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese la hora (formato 24 horas):");
            String entradaUsuario = scanner.nextLine(); // Lee la entrada del usuario

            validarHora(entradaUsuario); // Llama al método para validar la hora ingresada
            System.out.println("La hora ingresada es válida."); // Muestra un mensaje si la hora es válida
        } catch (NumberFormatException e) {
            System.out.println("Error: La hora ingresada no es un número válido."); // Captura una excepción si la hora no es un número válido
        } catch (HoraInvalidaException e) {
            System.out.println("Error: La hora ingresada es inválida."); // Captura una excepción si la hora es inválida
        } finally {
            scanner.close(); // Cierra el Scanner en el bloque finally
        }
    }

    public static void validarHora(String entrada) throws HoraInvalidaException {
        String[] partes = entrada.split(":"); // Divide la entrada en partes separadas por ":"

        if (partes.length != 2) {
            throw new HoraInvalidaException(); // Lanza una excepción si la cantidad de partes no es igual a 2
        }

        int horas, minutos;

        try {
            horas = Integer.parseInt(partes[0]); // Convierte la primera parte en horas (entero)
            minutos = Integer.parseInt(partes[1]); // Convierte la segunda parte en minutos (entero)
        } catch (NumberFormatException e) {
            throw new NumberFormatException(); // Lanza una excepción si alguna parte no se puede convertir a entero
        }

        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
            throw new HoraInvalidaException(); // Lanza una excepción si las horas o minutos están fuera del rango válido
        }
    }
}

class HoraInvalidaException extends Exception {
    public HoraInvalidaException() {
        super("La hora ingresada es inválida."); // Constructor de la excepción personalizada HoraInvalidaException
    }
}
