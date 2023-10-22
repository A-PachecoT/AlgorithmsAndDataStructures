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
public class BookList extends LinkedListTDA { // Usar LinkedListTDA con tipo Book

    public BookList() {
        super(); // Se usa el constructor de LinkedListTDA
    }

    public void display() {
        //this.imprimir();
        for (int i=0; i < size(); i++){
            System.out.println(get(i).toString());
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < size(); i++) {
            output += (get(i).toString()) + ("\n");
        }
        return output;
    }
}

