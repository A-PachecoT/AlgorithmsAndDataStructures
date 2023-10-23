/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.stack;

import uni.aed.linkedListADT.Nodo;

/**
 *
 * @author AndreP
 */
public class LinkedStackTDA <E> implements StackTDA<E>{
    private Nodo topStack;
    private int counter;

    public LinkedStackTDA() {
        clear();
    }

    @Override
    public void push(E elemento) {
        Nodo newTop = new Nodo(elemento);
        newTop.setNext(topStack);
        topStack = newTop;
        counter++;
        
    }

    @Override
    public E pop() throws StackEmptyExceptionTDA {
        if(isEmpty())
            throw new StackEmptyExceptionTDA();
        counter--;
        E element = (E)topStack.getData();
        topStack = topStack.getNext();
        return element;
    }

    @Override
    public E peek() throws StackEmptyExceptionTDA {
        if(isEmpty())
            throw new StackEmptyExceptionTDA();
        else
            return (E)topStack.getData(); 
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void clear() {
        topStack = null;
        counter = 0;
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }
    
    
    public String toString(){
        StringBuilder strBuilder = new StringBuilder("");
        Nodo current = topStack;
        while(current != null){
            if(current.getData() != null){
                strBuilder.append(current.getData().toString());
                strBuilder.append("\n");
                current = current.getNext();
            }
        }
        return strBuilder.toString();
    }
    
}
