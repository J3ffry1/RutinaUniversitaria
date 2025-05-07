package com.mycompany.universidaddia;
// -*- coding: utf-8 -*-

import com.mycompany.universidaddia.Desayuno;
import com.mycompany.universidaddia.Mochila;
import com.mycompany.universidaddia.Uniforme;
import com.mycompany.universidaddia.Clima;
import com.mycompany.universidaddia.Transporte;
import com.mycompany.universidaddia.Universidad;
import com.mycompany.universidaddia.Aula;


public class Persona {
    private String nombre;
    private String horaDespertar;
    private Uniforme uniforme;
    private Mochila mochila;
    private Desayuno desayuno;

    public Persona(String nombre, String horaDespertar, Uniforme uniforme, Mochila mochila) {
        this.nombre = nombre;
        this.horaDespertar = horaDespertar;
        this.uniforme = uniforme;
        this.mochila = mochila;
    }

    public void despertar() {
        System.out.println(nombre + " se despierta a las " + horaDespertar + ".");
    }

    public void lavarseDientes() {
        System.out.println("Lavándose los dientes.");
    }

    public void prepararDesayuno() {
        desayuno = new Desayuno("Pan con queso y café", 1);
        desayuno.preparar();
        desayuno.consumir();
    }

    public void alistarse() {
        lavarseDientes();
        uniforme.ponerse();
    }

    public void elegirTransporte(Transporte transporte, Clima clima) {
        transporte.evaluarClima(clima);
        transporte.tomar();
    }

    public void llegarUniversidad(Universidad universidad) {
        universidad.recibirAlumno();
    }

    public void empezarClase(Aula aula) {
        aula.ingresar();
        aula.recibirAlumno();
        aula.iniciarClase();
    }

    public void revisarMochila() {
        mochila.revisarContenido();
    }
}
