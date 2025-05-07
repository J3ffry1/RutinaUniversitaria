package com.mycompany.universidaddia;

public class Clima {
    private String estado;

    public Clima(String estado) {
        this.estado = estado;
    }

    public void influirTransporte() {
        System.out.println("El clima está " + estado + ". Puede afectar el transporte.");
    }
}
