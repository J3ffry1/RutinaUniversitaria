package com.mycompany.universidaddia;
public class Uniforme {
    private String tipo;
    private boolean limpio;

    public Uniforme(String tipo, boolean limpio) {
        this.tipo = tipo;
        this.limpio = limpio;
    }

    public void ponerse() {
        if (limpio) {
            System.out.println("Uniforme limpio puesto: " + tipo);
        } else {
            System.out.println("El uniforme no está limpio.");
        }
    }
}

