package com.degante.pilas;

public class Pila {

    private int capacidad;
    private int[] arreglo;
    private int cima;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
        this.cima = -1; 
    }

    public void push(int elemento) {
        if (estaLlena()) {
            System.out.println("Error: La pila está llena.");
            return;
        }
        cima++;
        arreglo[cima] = elemento;
        System.out.println("Elemento " + elemento + " apilado."); 
    }

    public int pop() {
        if (estaVacia()) {
            System.out.println("Error: La pila está vacía.");
            return -1; 
        }
        int elemento = arreglo[cima];
        cima--;
        System.out.println("Elemento " + elemento + " desapilado."); 
        return elemento;
    }

    public int peek() {
        if (estaVacia()) {
            System.out.println("Error: La pila está vacía.");
            return -1; 
        }
        System.out.println("Elemento en la cima: " + arreglo[cima]); 
        return arreglo[cima];
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == capacidad - 1;
    }

    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }
        System.out.print("Contenido de la pila: ");
        for (int i = cima; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }


}
