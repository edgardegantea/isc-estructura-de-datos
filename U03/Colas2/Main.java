import com.degante.colas.ColaTareas;
import com.degante.colacircular.ColaCircular;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        operacionesConPilaCircular();
    }


    public static void operacionesConPilaCircular() {
        System.out.print("Ingrese el tamaño de la cola circular: ");
        int tamanio = scanner.nextInt();

        ColaCircular cola = new ColaCircular(tamanio);

        int opcion;
        do {
            System.out.println("\n--- OPCIONES ---");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Verificar si la cola está llena");
            System.out.println("4. Verificar si la cola está vacía");
            System.out.println("5. Mostrar el frente de la cola");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a encolar: ");
                    int valor = scanner.nextInt();
                    cola.encolar(valor);
                    break;

                case 2:
                    int eliminado = cola.desencolar();
                    if (eliminado != -1) {
                        System.out.println("Elemento desencolado: " + eliminado);
                    }
                    break;

                case 3:
                    if (cola.estaLlena()) {
                        System.out.println("La cola está llena.");
                    } else {
                        System.out.println("La cola no está llena.");
                    }
                    break;

                case 4:
                    if (cola.estaVacia()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("La cola no está vacía.");
                    }
                    break;

                case 5:
                    int frente = cola.frente();
                    if (frente != -1) {
                        System.out.println("El frente de la cola es: " + frente);
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close();
    }


}