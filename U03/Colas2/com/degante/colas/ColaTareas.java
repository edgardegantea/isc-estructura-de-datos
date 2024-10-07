package com.degante.colas;

class Tarea {
    int id;
    String descripcion;

    public Tarea(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
}


public class ColaTareas {

    private Tarea[] cola;
    private int frente;
    private int finalCola;
    private int tamanio;
    private int capacidad;

    public ColaTareas(int capacidad) {
        this.capacidad = capacidad;
        this.frente = 0;
        this.finalCola = 0;
        this.tamanio = 0;
        this.cola = new Tarea[capacidad];
    }

    public boolean estaLlena() {
        return tamanio == capacidad;
    }

    public boolean estaVacia() {
        return tamanio == 0;
    }

    public void agregarTarea(int id, String descripcion) {
        if (estaVacia()) {
            System.out.println("No hay tareas en la cola");
        }

        Tarea tarea = cola[frente];
        frente = (frente + 1) % capacidad;
        tamanio++;
    }

}
