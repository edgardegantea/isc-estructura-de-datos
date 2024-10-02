import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuCola();
    }

    
    public static void menuCola() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la cola: ");
        int capacidad = scanner.nextInt();
        Cola cola = new Cola(capacidad);

        while (true) {
            System.out.println("\n1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Mostrar Cola");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número para encolar: ");
                    int num = scanner.nextInt();
                    try {
                        cola.encolar(num);
                        System.out.println(num + " ha sido encolado.");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        int elementoDesencolado = cola.desencolar();
                        System.out.println(elementoDesencolado + " ha sido desencolado.");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    cola.mostrarCola();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
