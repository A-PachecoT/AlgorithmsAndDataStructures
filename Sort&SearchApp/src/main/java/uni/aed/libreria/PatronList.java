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
public class PatronList extends LinkedListTDA<Patron> { // Usar LinkedListTDA con tipo Patron

    public PatronList() {
        super(); // Se usa el constructor de LinkedListTDA
    }

    public void display() {
        //this.imprimir();
        for (int i=0; i < size(); i++){
            get(i).display();
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < size(); i++) {
            output +=  (get(i).toString()) + ("\n");
        }
        return output;
    }
}
