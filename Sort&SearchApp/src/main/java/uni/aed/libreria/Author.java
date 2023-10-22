/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.libreria;

/**
 *
 * @author AndreP
 */
public class Author {
    public String name;
    public BookList books = new BookList( ); // Crear LinkedList de libros
    public Author() {
    }
    public boolean equals(Object node) { // Retorna true si es objeto es igual, false si no
        // Se usa el metodo equals de String
        return name.equals(((Author) node).name);
    }
    public void display( ) {
        // Se escribe el nombre y libros en pantalla
        System.out.println(name);
        books.display();
    }
}
