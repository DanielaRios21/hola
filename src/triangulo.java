
import java.util.Scanner;

public class triangulo {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Obtener el monto inicial
        int montoInicial = 13000;        
        // Obtener el número de compras
        System.out.print("Ingrese el número de compras: ");
        int numCompras = scanner.nextInt();
        
        // Realizar las compras
        for (int i = 1; i <= numCompras; i++) {
            
            // Obtener el monto de la compra
            System.out.print("Ingrese el monto de la compra: $");
            int montoCompra = scanner.nextInt();
            
            // Verificar si el monto de la compra es válido
            if (montoCompra <= montoInicial) {
                // Restar el monto de la compra al monto inicial
                montoInicial -= montoCompra;
                
                System.out.println("Nuevo saldo: $" + montoInicial);
            } else {
                System.out.println("No se puede realizar la compra. El monto excede el saldo disponible.");
            }
        }
    }
}

