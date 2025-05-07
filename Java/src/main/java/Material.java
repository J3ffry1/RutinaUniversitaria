package com.mycompany.universidaddia;

public class Material {
    String tipo;
    int cantidad;

    public Material(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void usar() {
        System.out.println("Usando " + cantidad + " de " + tipo);
    }

    public void guardar() {
        System.out.println("Guardando " + tipo);
    }
    public String getTipo() {
    return tipo;
}

public int getCantidad() {
    return cantidad;
}

}
