public class EjemploExcepcionNoGestionada {
    public static void main(String[] args) {
        int dividendo = 10;
        int divisor = 0;
        
        if (divisor == 0) {
            throw new ArithmeticException("Divisor no puede ser cero");
        }
        
        int resultado = dividendo / divisor;
        System.out.println("El resultado es: " + resultado);
    }
}