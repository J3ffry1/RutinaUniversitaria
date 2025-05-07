#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Desayuno {
public:
    string tipo;
    int cantidad;

    Desayuno(string tipo, int cantidad) : tipo(tipo), cantidad(cantidad) {}

    void preparar() {
        cout << "Preparando desayuno: " << tipo << endl;
    }

    void consumir() {
        cout << "Desayuno consumido: " << tipo << ", cantidad: " << cantidad << endl;
    }
};

class Material {
public:
    string tipo;
    int cantidad;

    Material(string tipo, int cantidad) : tipo(tipo), cantidad(cantidad) {}

    void usar() {
        cout << "Usando " << cantidad << " de " << tipo << endl;
    }

    void guardar() {
        cout << "Guardando " << tipo << endl;
    }
};

class Mochila {
public:
    vector<Material> contenido;
    float peso = 0;

    void cargar(Material material) {
        contenido.push_back(material);
        peso += 0.5;
        cout << "Material " << material.tipo << " cargado" << endl;
    }

    void revisarContenido() {
        cout << "Revisando contenido de la mochila:" << endl;
        for (auto& m : contenido) {
            cout << "- " << m.tipo << " x" << m.cantidad << endl;
        }
    }
};

class Uniforme {
public:
    string tipo;
    bool limpio;

    Uniforme(string tipo, bool limpio = true) : tipo(tipo), limpio(limpio) {}

    void ponerse() {
        if (limpio) {
            cout << "Uniforme limpio puesto: " << tipo << endl;
        } else {
            cout << "El uniforme no está limpio." << endl;
        }
    }
};

class Clima {
public:
    string estado;

    Clima(string estado) : estado(estado) {}

    void influirTransporte() {
        cout << "El clima está " << estado << ". Puede afectar el transporte." << endl;
    }
};

class Transporte {
public:
    string tipo;
    bool disponibilidad;

    Transporte(string tipo, bool disponibilidad = true) : tipo(tipo), disponibilidad(disponibilidad) {}

    void tomar() {
        if (disponibilidad) {
            cout << "Tomando transporte: " << tipo << endl;
        } else {
            cout << "El transporte no está disponible." << endl;
        }
    }

    void evaluarClima(Clima clima) {
        clima.influirTransporte();
    }
};

class Aula {
public:
    int numero;
    int capacidad;

    Aula(int numero, int capacidad) : numero(numero), capacidad(capacidad) {}

    void ingresar() {
        cout << "Ingresando al aula " << numero << endl;
    }

    void recibirAlumno() {
        cout << "Alumno recibido en el aula." << endl;
    }

    void iniciarClase() {
        cout << "Clase iniciada." << endl;
    }
};

class Universidad {
public:
    string nombre;
    string ubicacion;

    Universidad(string nombre, string ubicacion) : nombre(nombre), ubicacion(ubicacion) {}

    void recibirAlumno() {
        cout << "Alumno recibido en la universidad " << nombre << endl;
    }

    void iniciarClase() {
        cout << "Clases iniciadas en la universidad." << endl;
    }
};

class Persona {
private:
    string nombre;
    string horaDespertar;
    Uniforme uniforme;
    Mochila mochila;
    Desayuno desayuno;

public:
    Persona(string nombre, string horaDespertar, Uniforme uniforme, Mochila mochila)
        : nombre(nombre), horaDespertar(horaDespertar), uniforme(uniforme), mochila(mochila),
          desayuno("Pan con queso y café", 1) {}

    void despertar() {
        cout << nombre << " se despierta a las " << horaDespertar << "." << endl;
    }

    void lavarseDientes() {
        cout << "Lavándose los dientes." << endl;
    }

    void prepararDesayuno() {
        desayuno.preparar();
    }

    void alistarse() {
        lavarseDientes();
        uniforme.ponerse();
    }

    void elegirTransporte(Transporte transporte, Clima clima) {
        transporte.evaluarClima(clima);
        transporte.tomar();
    }

    void llegarUniversidad(Universidad universidad) {
        universidad.recibirAlumno();
    }

    void empezarClase(Aula aula) {
        aula.ingresar();
        aula.recibirAlumno();
        aula.iniciarClase();
    }

    void revisarMochila() {
        mochila.revisarContenido();
    }
};

int main() {
    Uniforme uniforme("Formal");
    Mochila mochila;
    mochila.cargar(Material("Cuaderno", 1));
    mochila.cargar(Material("Laptop", 1));
    mochila.cargar(Material("Cargador", 1));

    Persona estudiante("Ana", "5:30 AM", uniforme, mochila);
    estudiante.despertar();
    estudiante.prepararDesayuno();
    estudiante.alistarse();
    estudiante.revisarMochila();

    Clima clima("lluvioso");
    Transporte transporte("bus");
    estudiante.elegirTransporte(transporte, clima);

    Universidad universidad("UniEjemplo", "Centro");
    Aula aula(101, 30);
    estudiante.llegarUniversidad(universidad);
    estudiante.empezarClase(aula);

    return 0;
}
