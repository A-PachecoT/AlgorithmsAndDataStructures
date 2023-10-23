/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.stack;

/**
 *
 * @author AndreP
 */
public interface StackTDA <E>{
    public void push (E elemento);
    public E pop() throws StackEmptyExceptionTDA;
    public E peek () throws StackEmptyExceptionTDA;;
    public int size ();
    public void clear();
    public boolean isEmpty ();
}
