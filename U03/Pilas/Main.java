import com.degante.pilas.Pila;
import com.degante.pilas.PilaConStack;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // operacionesDePila();
        miStack();
    }


    public static void miStack() {
        PilaConStack pilaConStack = new PilaConStack();
        pilaConStack.metodo01();
    }


    public static void operacionesDePila() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad de la pila: ");
        int capacidad = scanner.nextInt();
        Pila pila = new Pila(capacidad);

        int opcion;
        do {
            System.out.println("\nOperaciones:");
            System.out.println("1. Apilar (push)");
            System.out.println("2. Desapilar (pop)");
            System.out.println("3. Ver cima (peek)");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a apilar: ");
                    int elemento = scanner.nextInt();
                    pila.push(elemento);
                    break;
                case 2:
                    pila.pop();
                    break;
                case 3:
                    pila.peek();
                    break;
                case 4:
                    pila.mostrarPila();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();

    }
}

