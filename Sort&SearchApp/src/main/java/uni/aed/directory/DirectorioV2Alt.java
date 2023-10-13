package uni.aed.directory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AndreP
 */
import java.util.ArrayList;
import java.util.Iterator;

// Clase base
class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String obtenNombre() {
        return nombre;
    }
}

// Clase genérica Directorio
class DirectorioV2Alt<T extends Persona> {
    private ArrayList<T> directorio;

    public DirectorioV2Alt() {
        this.directorio = new ArrayList<>();
    }

    // Método para agregar un nuevo objeto T
    public void agrega(T persona) {
        directorio.add(persona);
    }

    // Método para borrar objetos T basados en el nombre
    public void borra(String nombre) {
        Iterator<T> iterator = directorio.iterator();
        while (iterator.hasNext()) {
            T persona = iterator.next();
            if (persona.obtenNombre().equals(nombre)) {
                iterator.remove();
            }
        }
    }

    // Método para mostrar el directorio (opcional)
    public void muestraDirectorio() {
        for (T persona : directorio) {
            System.out.println(persona.obtenNombre());
        }
    }
    
    
    // Ejemplo de uso
    public static void main(String[] args) {
        // Crear un directorio
        DirectorioV2Alt<Persona> dir = new DirectorioV2Alt<>();

        // Agregar personas al directorio
        dir.agrega(new Persona("Ana"));
        dir.agrega(new Persona("Juan"));
        dir.agrega(new Persona("Pedro"));

        // Mostrar directorio
        dir.muestraDirectorio();

        // Borrar a "Juan" del directorio
        dir.borra("Juan");

        // Mostrar directorio después de borrar
        dir.muestraDirectorio();
    }
}

