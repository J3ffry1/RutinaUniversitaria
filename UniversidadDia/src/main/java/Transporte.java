package com.mycompany.universidaddia;
public class Transporte {
    private String tipo;
    private boolean disponible;

    public Transporte(String tipo, boolean disponible) {
        this.tipo = tipo;
        this.disponible = disponible;
    }

    public void tomar() {
        if (disponible) {
            System.out.println("Tomando transporte: " + tipo);
        } else {
            System.out.println("El transporte no está disponible.");
        }
    }

    public void evaluarClima(Clima clima) {
        clima.influirTransporte();
    }
}
