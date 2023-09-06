
import java.util.Scanner;


public class fibonacci {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Obtener el número de la posición en la sucesión
        System.out.print("Ingrese el número de la posición en la sucesión de Fibonacci (menor a 20): ");
        int posicion = scanner.nextInt();
        
        // Verificar si el número está dentro del rango válido
        if (posicion < 1 || posicion > 20) {
            System.out.println("El número está fuera del rango válido.");
            return;
        }
        
        // Generar la sucesión de Fibonacci
        System.out.println("Sucesión de Fibonacci hasta la posición " + posicion + ":");
        for (int i = 1; i <= posicion; i++) {
            int numero = fibonacci(i);
            System.out.print(numero + " ");
        }
    }
    
    // Función para calcular el número de Fibonacci en una posición dada
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            int a = 1;
            int b = 1;
            int c = 0;
            
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            
            return c;
        }
    }
}
