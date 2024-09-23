package com.degante.pilas;

import java.util.Stack;

public class PilaConStack {
    public void metodo01() {
        // Crear pila a partir de la clase Stack
        Stack<String> pila = new Stack<String>();

        pila.push("Edgar");
        pila.push("María");
        pila.push("Peter");

        System.out.println("Elementos de la pila: " + pila);
    }
}
