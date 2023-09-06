
//Mi clase en java
public class HolaMundo {

    public static void main(String args[]) { //Main es el metodo para ejecutar la clase // (STrings args: argumentod
       int a= 3, b=2;
       var resultado = a + b;
        System.out.println("resultado de la suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado de la resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        var resultadoDos = 3.0 / b;
        System.out.println("resultado Division = " + resultadoDos);
        
        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);
        
        if (b %2 == 0)
            System.out.println("Par" );
        else
            System.out.println("Impar");
        
       
    }

}
