/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.libreria;

/**
 *
 * @author AndreP
 */
public class Patron {
    public String name;
    public BookList books = new BookList( );
    public boolean equals (Object node) {
        return name.equals( ( (Patron) node).name) ;
    }
    public void display() {
        if( !books.isEmpty()) {
            System.out.println(name + " tiene los libros siguientes:");
            books.display( );
        }

        else System.out.print(name + " no tiene libros");
    }
    @Override
    public String toString() {
        if( !books.isEmpty()) {
            return name + " tiene: \n" + books.toString();
        }
        else return name + " no tiene libros";
    }
}  