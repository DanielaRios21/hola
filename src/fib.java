
    import java.util.Scanner;
public class fib {

       public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a = 0, b = 1, c, n;

        System.out.print("Ingresar n");
        n= teclado.nextInt();

        for(int i = 1; i<n; i++){
          System.out.print(a);
          c= a + b;
          a = b;
          b = c;


        }
     
       
}
}
