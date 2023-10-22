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
import model.Person;


// Clase genérica Directorio
class DirectorioV2Alt<T extends Person> {
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
            if (persona.getName().equals(nombre)) {
                iterator.remove();
            }
        }
    }

    // Método para mostrar el directorio
    public void muestraDirectorio() {
        for (T persona : directorio) {
            System.out.println(persona.getName());
        }
    }
    
    
    // Ejemplo de uso
    public static void main(String[] args) {
        // Crear un directorio
        DirectorioV2Alt<Person> dir = new DirectorioV2Alt<>();

        // Agregar personas al directorio
        dir.agrega(new Person("Ana",11,'F'));
        dir.agrega(new Person("Juan",15,'M'));
        dir.agrega(new Person("Pedro",19,'M'));

        // Mostrar directorio
        dir.muestraDirectorio();

        // Borrar a "Juan" del directorio
        dir.borra("Juan");

        // Mostrar directorio después de borrar
        dir.muestraDirectorio();
    }
}

