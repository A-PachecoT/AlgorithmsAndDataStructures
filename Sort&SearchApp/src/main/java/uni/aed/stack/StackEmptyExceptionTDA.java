/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.stack;

/**
 *
 * @author AndreP
 */
public class StackEmptyExceptionTDA  extends RuntimeException{

    public StackEmptyExceptionTDA() {
        this("La Pila está vacía");
    }

    public StackEmptyExceptionTDA(String message) {
        super(message);
    }
    
}
