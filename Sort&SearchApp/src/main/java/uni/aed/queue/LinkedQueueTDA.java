/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.queue;

import uni.aed.linkedListADT.Nodo;

/**
 *
 * @author AndreP
 */
public class LinkedQueueTDA<E> implements QueueTDA<E> {
    private Nodo front;
    private Nodo back;
    private int counter;

    public LinkedQueueTDA(){
        clear();
    }
    
    
    @Override
    public void add(E element) {
        Nodo newNode = new Nodo(element);
        if(isEmpty())
            front = back = newNode;
        else{
            back.setNext(newNode);
            back = newNode;
        }
        counter++;
    }

    @Override
    public E offer(E element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public E delete() {
        E item;
        if(isEmpty())
            throw new QueueEmptyExceptionTDA();
        else{
            item = (E) front.getData();
            front = front.getNext();
            counter--;
        }
        return item;
    }

    @Override
    public E get() {
        if(isEmpty())
            throw new QueueEmptyExceptionTDA();
        else
            return (E) front.getData();
    }

    @Override
    public void clear() {
        front = back = null;
        counter = 0;
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void offer(E element, int priority) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public String toString(){
        String result = "";
        Nodo current = front;
        while(current != null){
            result += current.getData().toString();
            current = current.getNext();
        }
        return result;
    }
    
    @Override
    public void imprimir(){
        System.out.println(this.toString());
    }
}
