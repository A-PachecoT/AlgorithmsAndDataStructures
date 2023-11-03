/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.queue;

/**
 *
 * @author AndreP
 */
public class ArrayQueueTDA <E> implements QueueTDA<E> {
    private static final int DEFINED_SIZE = 25;
    private E[] queue;
    private int counter;
    private int front;  // Index that points to the top of the queue
    private int back;   // Index that points to the back of the queue
    
    public ArrayQueueTDA(int size) {
        if(size <= 0)
            throw new IllegalArgumentException("Capacidad mayor a cero");
        queue =(E[]) new Object[size];
        counter = 0;
    }
    
    @Override
    public void add(E element) {
        if(counter == queue.length)
            expand_size();
        queue[back] = element;
        back= (back+1) % queue.length;
        counter++;
    }
    
    // Doubles the size of the array
    private void expand_size() {
        E[] newQueue = (E[]) new Object[(int) (1.5 * queue.length)];
        for (int i = 0; i < counter; i++) {
            newQueue[i] = queue[(front + i) % queue.length];
        }
        queue = newQueue;
        front = 0;
        back = counter;
    }
    
    @Override
    public E offer(E element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public E delete() {
        if(isEmpty())
            throw new QueueEmptyExceptionTDA();
        E item = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        counter--;
        return item;
    }
    
    @Override
    public E get() {
        if (isEmpty())
            throw new QueueEmptyExceptionTDA();

        return queue[front];
    }

    @Override
    public void clear() {
        for (int i = 0; i < counter; i++) {
            //queue[(front + i) % queue.length] = null;
            queue[i] = null;
        }
        counter = 0;
        front = 0;
        back = queue.length - 1;
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
        int current = front;
        for(int i = 0; i < counter; i++){
            result = result + "\n" + queue[current].toString();
            current = (current + 1) % queue.length; // Wrap around if necessary
        }
        return result;
    }
    public void imprimir(){
        int current = front;
        for(int i = 0; i < counter; i++){
            System.out.println(queue[current]);
            current = (current + 1) % queue.length;
        }
    }
}
