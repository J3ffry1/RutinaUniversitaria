package com.mycompany.universidaddia;


public class Aula {
    private final int numero;
    private final int capacidad;

    public Aula(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public void ingresar(){
        System.out.println("Ingresando al aula " + numero);
    }
    

    public void recibirAlumno() {
        System.out.println("Alumno recibido en el aula.");
    }

    public void iniciarClase() {
        System.out.println("Clase iniciada.");
    }
}