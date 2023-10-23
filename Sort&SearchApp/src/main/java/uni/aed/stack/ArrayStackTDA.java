
package uni.aed.stack;

/**
 *
 * @author AndreP
 */
public class ArrayStackTDA<E> implements StackTDA<E> {
    private static final int DEFINED_SIZE = 25;
    private E [] elements;
    private int counter;
    
    public ArrayStackTDA () {
        this ( DEFINED_SIZE) ;
    }
    public ArrayStackTDA (int size){
        if(size <=0){
            throw new IllegalArgumentException("Initial capacity of the array has to be a positive integer.");
        }
        this.elements = (E[])new Object[size];
        this.counter = 0;
    }

    @Override
    public void push(E elemento) {
        if(counter == elements.length)
            expand();
        elements[counter++] = elemento;
    }

    @Override
    public E pop() throws StackEmptyExceptionTDA {
        if(isEmpty())
            throw new StackEmptyExceptionTDA();
        else{
            counter--;
            E element = elements[counter];
            elements[counter] = null;
            return element;
        }
    }

    @Override
    public E peek() throws StackEmptyExceptionTDA{
        if(isEmpty())
            throw new StackEmptyExceptionTDA();
        else
            return (E)elements[counter-1];
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void clear() {
        for(int i = 0; i < counter; i++)
            elements[i] = null;
        counter = 0;
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;   
    }
    
    private void expand(){
        int new_size = (int) 1.5 * elements.length;
        E[] temp_array = (E[])new Object[new_size];
        for(int i = 0; i < counter; i++)
            temp_array[i] = elements[i];
        elements = temp_array;
    }
    public String toString(){
        StringBuilder strBuilder = new StringBuilder("");
        for(int i = 0; i < counter; i++)
            strBuilder.append(elements[i].toString() + "\n");
        return strBuilder.toString();
    }
}
