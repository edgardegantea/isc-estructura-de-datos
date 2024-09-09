package org.degante.arreglos;

import java.util.HashSet;

public class Arreglo {

    private static int[] numerosEnteros = {1, 2, 3, 4, 5, 0, 3, 4, 1};


    public void sumarElementos() {
        int suma = 0;
        for (int i = 0; i < numerosEnteros.length; i++) {
            suma = numerosEnteros[i] + suma;
            System.out.println("Elemento " + i + ": " + numerosEnteros[i]);
        }

        System.out.println("Suma: " + suma);
    }


    public void numeroMayor() {
        int mayor = numerosEnteros[0];

        for (int i = 0; i < numerosEnteros.length; i++) {
            if (numerosEnteros[i] > mayor) {
                mayor = numerosEnteros[i];
            }
        }

        System.out.println("El número más grande es: " + mayor);
    }
    

    public void numeroMenor() {
        int menor = numerosEnteros[0];

        for (int i = 0; i < numerosEnteros.length; i++) {
            if (numerosEnteros[i] < menor) {
                menor = numerosEnteros[i];
            }
        }

        System.out.println("El número más pequeño es: " + menor);
    }


    public void invertirElementos() {
        for (int i = 0; i < numerosEnteros.length/2; i++) {
            int temporal = numerosEnteros[i];
            numerosEnteros[i] = numerosEnteros[numerosEnteros.length - 1 - i];
            numerosEnteros[numerosEnteros.length - 1 - i] = temporal;
        }

        System.out.println("Arreglo invertido: ");

        for (int numero : numerosEnteros) {
            System.out.println(numero + " ");
        }

    }


    public void eliminarDuplicados() {
        HashSet<Integer> conjunto = new HashSet<>();
        for (int numero : numerosEnteros) {
            conjunto.add(numero);
        }

        int[] resultado = new int[conjunto.size()];
        int i = 0;
        for (int numero : conjunto) {
            resultado[i++] = numero;
        }

        System.out.println("Arreglo sin duplicados: ");
        for (int numero : resultado) {
            System.out.println(numero + " ");
        }
    }


    public void eliminarDuplicadosSinHashSet() {
        int[] resultado = new int[numerosEnteros.length];
        int indiceResultado = 0;

        for (int i = 0; i < numerosEnteros.length; i++) {
            boolean esDuplicado = false;

            for (int j = 0; j < indiceResultado; j++) {
                if (numerosEnteros[i] == resultado[j]) {
                    esDuplicado = true;
                    break;
                }
            }

            if (!esDuplicado) {
                resultado[indiceResultado++] = numerosEnteros[i];
            }
        }

        int[] arregloFinal = new int[indiceResultado];
        System.arraycopy(resultado, 0, arregloFinal, 0, indiceResultado);

        System.out.println("Arreglo sin duplicados: ");
        for (int numero : arregloFinal) {
            System.out.println(numero + " ");
        }


        for (int i = 0; i < arregloFinal.length - 1; i++) {
            for (int j = 0; j < arregloFinal.length - i - 1; j++) {
                if (arregloFinal[j] > arregloFinal[j+1]) {
                    int temporal = arregloFinal[j];
                    arregloFinal[j] = arregloFinal[j+1];
                    arregloFinal[j+1] = temporal;
                }
            }
        }

        System.out.println("Arreglo ordenado: ");
        for (int elemento : arregloFinal) {
            System.out.println(elemento + " ");
        }
    }

    
}
