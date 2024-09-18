public class Recursividad {

    public static int fibonacci(int numero) {
        // Fn = Fn-1 + Fn-2
        if (numero >= 3) {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        } else {
            return numero;
        }
        
    }



    // Método de tipo: 
    public static int factorial(int numero) {
        
        if (numero == 0) {
            return 1;
        }
        if (numero == 1) {
            return 1;
        }

        return factorial(numero) * factorial(numero - 1);
    }

}
