
package com.mycompany.universidaddia;

 
   public class Desayuno {
    private String tipo;
    private int cantidad;

    public Desayuno(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void preparar() {
        System.out.println("Preparando desayuno: " + tipo);
    }

    public void consumir() {
        System.out.println("Desayuno consumido: " + tipo + ", cantidad: " + cantidad);
    }
}
 

