/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.libreria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AndreP
 */
public class Library {
    //Instancia listas de LinkedLists TDA
    //A cada letra mayuscula se le otorga una espacio en memoria para una lista, segun su codigo ASCII
    private AuthorList[] catalog = new AuthorList[(int)('Z' + 1)];
    private PatronList[] people = new PatronList[(int)('Z' + 1)];
    
    // Instancia el buffer para leer datos de la terminal y guardarlos en input
//    private String input;
//
//    private BufferedReader buffer = new BufferedReader(
//                                    new InputStreamReader ( System. in) ) ;
    
    
    private final String strErrorAuthor         = "Nombre de autor mal escrito";
    private final String strErrorBook           = "Título mal escrito";
    private final String strErrorUserNotFound   = "Nombre del usuario no encontrado.";
    private final String strErrorAuthorNotFound = "Nombre de autor no encontrado.";
    private final String strErrorBookNotFound   = "Título del libro no encontrado.";
   
    /*
    Inicializa los arreglos catalog y people con listas enlazadas vacías
    para cada letra del alfabeto.
    */
    public Library( ) {
        for (int i = 0; i <= (int) 'Z'; i++) {
            catalog[i] = new AuthorList();
            people[i] = new PatronList();
        }
    }
    
    /*
    Muestra un mensaje al usuario, lee una cadena desde la consola 
    y la devuelve con la primera letra en mayúsculas.
    */
    private String getString(String input) {
//        System.out.print(msg + " ");
//        System.out.flush();
//        try { // Intenta leer y almacenar en input una linea de la terminal
//            input = buffer.readLine();
//        }catch (IOException io){
//            
//        }
        // retorna la string leida con la primera letra en mayuscula
        return input.substring(0,1).toUpperCase() + input.substring(1);
    }
    
    /*
    Metodo para imprimir en consola el catalogo con todos los libros y usuarios
    de la biblioteca
    */
    private void status ( ) {
        
        System.out.println("La biblioteca tiene los libros siguientes:\n");
        for (int i = (int) 'A'; i <= (int) 'Z'; i++){ // Se itera desde la A hasta la Z
            // Se imprime el libro del catalogo si no es vacio
            if (!catalog[i].isEmpty())
                catalog[i].display();
        }
            
        System.out.println( "\nLas personas siguientes están utilizando la biblioteca:\n ");
        
        for (int i = (int) 'A'; i <= (int) 'Z'; i++)
            // Se imprime la lista de personas usando un iterador si el elemento 
            // persona no es vacio usando el metodo definido en Patron
            if (!people[i].isEmpty())
                people[i].display();
    }
    
    /*
    Método que genera una cadena con la lista de libros en el catálogo.
    */
    public String getBooksString() {
        String text = "";
        for (int i = (int) 'A'; i <= (int) 'Z'; i++){ // Se itera desde la A hasta la Z
            // Se imprime el libro del catalogo si no es vacio
            if (!catalog[i].isEmpty())
                text += catalog[i].toString();
        }
        return text;
    }

    /*
    Método que genera una cadena con la lista de personas que utilizan la biblioteca.
    */
    public String getPeopleString() {
        String text = "";
        for (int i = (int) 'A'; i <= (int) 'Z'; i++){ // Se itera desde la A hasta la Z
            if (!people[i].isEmpty())
                text += people[i].toString();
        }
        return text;
    }



    // Permite al usuario agregar un libro a la biblioteca, asociándolo con un autor.
    public void includeBook( String name, String title ) {
        Author newAuthor = new Author( ) ;
        int oldAuthor; // indice
        Book newBook = new Book( ) ;
        
        newAuthor.name = getString(name);
        newBook.title = getString(title);
        
        // Se recupera la posicion del indice segun la primera letra, en el catalogo
        // del autor al cual se le quiere anexar un nuevo libro
        oldAuthor = catalog[(int)
                    newAuthor.name.charAt(0)].indexOf(newAuthor);
        
        // Si no se encontro el autor al usar indexOf, agrega el libro y el nuevo
        // autor al catalogo
        if (oldAuthor == -1){ 
            //Se agrega a la lista de libros
            newAuthor.books.add(newBook);
            //Y se agrega al catalogo segun el indice que le corresponde
            // (la primera letra del nombre)
            catalog[(int) newAuthor.name.charAt(0)].add(newAuthor);
        }
        // Si sí se encontró, se recupera la posicion 
        else ( (Author) catalog [ (int)
                newAuthor.name.charAt(0)].get(oldAuthor)).
                books.add( newBook);
    }
    
    // Método para registrar un préstamo
    public void checkOutBook(String namePatron, String nameAuthor, String nameBook) {
        /* 
        Se recibe informacion del libro en la terminal a solicitar, solicitando
        nuevamente si no se encuentra cada dato en la lista
        */

        Patron patron = new Patron (), patronRef; // = new Patron();
        Author author = new Author (), authorRef = new Author();
        Book book = new Book();
        int patronIndex, bookIndex = -1, authorIndex = -1; 
        //Si los indices mantienen en -1 se vuelve a solicitar al usuario
        
        // Recibe nombre de usuario
        patron.name = getString(namePatron);
        
        // Recibe nombre de autor
        while (authorIndex == -1) {
            // Comprueba que exista en el catalogo
//            author.name = getString("Introduzca el nombre del autor:");
            author.name = getString(nameAuthor);
            authorIndex = catalog [ (int)
                        author.name.charAt(0)].indexOf(author);

            if (authorIndex == -1){
                System.out.println(strErrorAuthor);
                throw new IllegalArgumentException(strErrorAuthor);
            }
        }

        
        // Recibe nombre de titulo
        while (bookIndex == -1) {
//            book.title = getString("Introduzca el título del libro: ");
            book.title = getString(nameBook);
            // Se hace uso del indice del autor calculado previamente para el respectivo acceso
            authorRef = (Author) catalog[(int)
                        author.name.charAt(0)].get(authorIndex);
            bookIndex = authorRef.books.indexOf(book);

            if (bookIndex == -1){
                System.out.println(strErrorBook);
                throw new IllegalArgumentException(strErrorBook);
            }
            
        }
        
        Book bookRef = (Book) authorRef.books.get(bookIndex);
        CheckedOutBook bookToCheckOut = new CheckedOutBook();
        bookToCheckOut.author = authorRef;
        bookToCheckOut.book = bookRef;
        
        patronIndex = people[(int)
                        patron.name.charAt(0)].indexOf(patron);
        if(patronIndex == -1) { // Un usuaraio nuevo en la biblioteca
            // Agrega la persona a la lista de la posición de su primera letra
            // del nombre a la LinkedList people
            patron.books.add(bookToCheckOut);
            people[(int) patron.name.charAt(0)].add(patron); // Crea el perfil
            bookRef.patron = (Patron) people [(int)
                    patron.name.charAt(0)].get(0); // ANTES: getFirst
        }
        else{
            patronRef = (Patron) people[(int)
                    patron.name.charAt(0)].get(patronIndex);
            patronRef.books.add(bookToCheckOut);
            bookRef.patron = patronRef;
        }
        
    }

    // Método para devolver un libro
    public void returnBook(String namePatron, String nameAuthor, String bookTitle) {
        Patron patron = new Patron();
        Book book = new Book();
        Author author = new Author(), authorRef = new Author();

        int patronIndex = -1, bookIndex = -1, authorIndex = -1;

        // Se pide y verifica el nombre del usuario que solicita devolverlo
        patron.name = getString(namePatron);
        patronIndex = people[(int) patron.name.charAt(0)].indexOf(patron);
        
        if (patronIndex == -1) {
            System.out.println(strErrorUserNotFound);
            throw new IllegalArgumentException(strErrorUserNotFound);
        }

        // Recibe nombre de autor
        author.name = getString(nameAuthor);
        authorIndex = catalog[(int) author.name.charAt(0)].indexOf(author);

        if (authorIndex == -1) {
            System.out.println(strErrorAuthorNotFound);
            throw new IllegalArgumentException(strErrorAuthorNotFound);
        }

        // Recibe nombre de título
        book.title = getString(bookTitle);
        // Se hace uso del índice del autor calculado previamente para el respectivo acceso
        authorRef = (Author) catalog[(int) author.name.charAt(0)].get(authorIndex);
        bookIndex = authorRef.books.indexOf(book);

        if (bookIndex == -1) {
            System.out.println(strErrorBookNotFound);
            throw new IllegalArgumentException(strErrorBookNotFound);
        }
        /*
        while (patronIndex == -1){
            patron.name = getString("Introduzca el nombre del usuario:");
            patronIndex = people[(int)
                        patron.name.charAt(0)].indexOf(patron);

            if (patronIndex == -1)
                System.out.println("Nombre del usuario mal escrito");
        }


        if (patronIndex == -1) {
            System.out.println("Nombre del usuario no encontrado.");
            throw new IllegalArgumentException("Nombre del usuario no encontrado.");
        }
        
        /// Recibe nombre de autor
        while (authorIndex == -1) {
            // Comprueba que exista en el catalogo
            author.name = getString("Introduzca el nombre del autor:");
            authorIndex = catalog [ (int)
                        author.name.charAt(0)].indexOf(author);

            if (authorIndex == -1)
                System.out.println("Nombre de autor mal escrito");
        }

        // Recibe nombre de titulo
        while (bookIndex == -1) {
            book.title = getString("Introduzca el título del libro: ");
            // Se hace uso del indice del autor calculado previamente para el respectivo acceso
            authorRef = (Author) catalog[(int)
                        author.name.charAt(0)].get(authorIndex);
            bookIndex = authorRef.books.indexOf(book);

            if (bookIndex == -1)
                System.out.println("Título mal escrito");
        }
        */
        
        // Eliminamos el libro de la lista
        CheckedOutBook checkedOutBook = new CheckedOutBook();
        checkedOutBook.author = authorRef;
        checkedOutBook.book = (Book) authorRef.books.get(bookIndex);
        ((Book)authorRef.books.get(bookIndex)).patron = null;
        ((Patron)people[(int)patron.name.charAt(0)].get(patronIndex)).
                books.delete(checkedOutBook);
    }
    public void run() {
        while( true ) {
            char option = getString ( "\n Introduzca una de las siguientes" +
                    "opciones: \n" +
                    "1. Incluir un libro en el catálogo\n" +
                    "2. Registrar el préstamo de un libro\n"+
                    "3. Registrar la devolución de un libro\n4. Status\n5. Salir\n" +
                    "Su opción: ").charAt(0);
            switch (option) {
//                case '1': includeBook();  break;
//                case '2': checkOutBook(); break;
//                case '3': returnBook();   break;
                case '4': status();       break;
                case '5': return;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
                    break;
            }
        }

    }
    public static void main(String args[]) {
//        (new Library()).run();
    }

}
