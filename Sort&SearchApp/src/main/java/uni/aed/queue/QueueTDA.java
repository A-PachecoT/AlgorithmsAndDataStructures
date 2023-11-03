/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uni.aed.queue;

/**
 *
 * @author AndreP
 */
public interface QueueTDA<E> {
    public void add(E element); //enqueue
    public E offer(E element); //dequeue
    public E delete();
    public E get(); //peek
    public void clear();
    public boolean isEmpty();
    public int size();
    public void offer(E element, int priority); //enqueue
    public void imprimir();
}
