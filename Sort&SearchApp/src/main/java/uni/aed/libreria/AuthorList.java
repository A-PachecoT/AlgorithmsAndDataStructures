/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.libreria;

import uni.aed.linkedListADT.LinkedListTDA;

/**
 *
 * @author AndreP
 */
public class AuthorList extends LinkedListTDA<Author>{
    public AuthorList( ) {
        super( ) ;    // Se usa el constructor de LinkedList
    }
    public void display( ) {
        //this.imprimir();    // Se reduce el código drásticamente al utilizar el 
                            //iterador en el método inscrito en LinkedListTDA
        for (int i=0; i < size(); i++){
            get(i).display();
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < size(); i++) {
            output += (((Author)get(i)).toString()) + ("\n");
        }
        return output;
    }
}
