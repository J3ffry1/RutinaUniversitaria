/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.universidaddia;


public class UniversidadDia {
    public static void main(String[] args) {
        // Crear objetos necesarios
        Uniforme uniforme = new Uniforme("Formal", true);
        Mochila mochila = new Mochila();

        mochila.cargar(new Material("Cuaderno", 1));
        mochila.cargar(new Material("Laptop", 1));

        Persona estudiante = new Persona("Ana", "5:30 AM", uniforme, mochila);

        estudiante.despertar();
        estudiante.prepararDesayuno();
        estudiante.alistarse();
        estudiante.revisarMochila();

        Clima clima = new Clima("lluvioso");
        Transporte transporte = new Transporte("bus", true);

        estudiante.elegirTransporte(transporte, clima);

        Universidad universidad = new Universidad("UniEjemplo", "Centro");
        Aula aula = new Aula(101, 30);

        estudiante.llegarUniversidad(universidad);
        estudiante.empezarClase(aula);
    }
}
