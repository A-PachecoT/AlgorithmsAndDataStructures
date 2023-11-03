/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.queue;

/**
 *
 * @author AndreP
 */
public class QueueEmptyExceptionTDA extends RuntimeException{
    public QueueEmptyExceptionTDA(){
        this("Cola vacia");
    }
    public QueueEmptyExceptionTDA(String msg){
        super(msg);  
    }
    
}
