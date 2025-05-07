package com.mycompany.universidaddia;
import java.util.ArrayList;

public class Mochila {
    private ArrayList<Material> contenido;
    private double peso;

    public Mochila() {
        this.contenido = new ArrayList<>();
        this.peso = 0.0;
    }

    public void cargar(Material material) {
        contenido.add(material);
        peso += 0.5; // simplificación de peso fijo por material
        System.out.println("Material " + material.tipo + " cargado.");
    }

    public void revisarContenido() {
        System.out.println("Revisando contenido de la mochila:");
        for (Material m : contenido) {
  System.out.println("- " + m.getTipo() + " x" + m.getCantidad());

        }
    }
}
