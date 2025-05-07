package com.mycompany.universidaddia;
public class Universidad {
    private String nombre;
    private String ubicacion;

    public Universidad(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void recibirAlumno() {
        System.out.println("Alumno recibido en la universidad " + nombre);
    }

    public void iniciarClase() {
        System.out.println("Clases iniciadas en la universidad.");
    }
}
