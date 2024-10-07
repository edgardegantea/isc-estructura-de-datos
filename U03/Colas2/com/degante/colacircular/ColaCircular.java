package com.degante.colacircular;

public class ColaCircular {

    private int[] cola;
    private int frente;
    private int finalCola;
    private int tamanio;

    public ColaCircular(int tamanio) {
        this.tamanio = tamanio;
        cola = new int[tamanio];
        frente = -1;
        finalCola = -1;
    }

    public boolean estaVacia() {
        return (frente == -1);
    }

    public boolean estaLlena() {
        return ((finalCola + 1) % tamanio == frente);
    }

    public void encolar(int valor) {
        if (estaLlena()) {
            System.out.println("Cola llena. No se puede insertar.");
            return;
        }
        if (estaVacia()) {
            frente = 0;
        }
        finalCola = (finalCola + 1) % tamanio;
        cola[finalCola] = valor;
        System.out.println("Elemento insertado: " + valor);
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("Cola vacía. No se puede eliminar.");
            return -1;
        }
        int valor = cola[frente];
        if (frente == finalCola) {
            frente = -1;
            finalCola = -1;
        } else {
            frente = (frente + 1) % tamanio;
        }
        return valor;
    }


    public int frente() {
        if (estaVacia()) {
            System.out.println("Cola vacía.");
            return -1;
        }
        return cola[frente];
    }
}
