import java.util.Scanner;

class Cola {
    private int[] elementos;
    private int frente;
    private int fin;
    private int tamanio;

    public Cola(int capacidad) {
        elementos = new int[capacidad];
        frente = 0;
        fin = -1;
        tamanio = 0;
    }

    public void encolar(int elemento) {
        if (estaLlena()) {
            throw new RuntimeException("La cola está llena");
        }
        fin = (fin + 1) % elementos.length;
        elementos[fin] = elemento;
        tamanio++;
    }

    public int desencolar() {
        if (estaVacia()) {
            throw new RuntimeException("La cola está vacía");
        }
        int elemento = elementos[frente];
        frente = (frente + 1) % elementos.length;
        tamanio--;
        return elemento;
    }

    public boolean estaVacia() {
        return tamanio == 0;
    }

    public boolean estaLlena() {
        return tamanio == elementos.length;
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.print("Contenido de la cola: ");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(elementos[(frente + i) % elementos.length] + " ");
        }
        System.out.println();
    }

    
}
