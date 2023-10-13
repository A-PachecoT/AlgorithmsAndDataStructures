package uni.aed.circularlinkedlist;

public class CircularLinkedList {
    Nodo head; 
    
    public CircularLinkedList() {
        head = null;
    }

    // Método para agregar un nuevo nodo con un valor dado AL FINAL de la lista circular.
    public void add(int data) { 
        Nodo newNodo = new Nodo(data); // Creamos un nuevo nodo con el dato proporcionado.

        // Si la lista está vacía, establecemos el nuevo nodo como el inicio y lo conectamos a sí mismo.
        if (head == null) {
            head = newNodo;
            head.next = head;
            return;
        }

        Nodo current = head; // Inicializamos un nodo actual para recorrer la lista.

        // Recorremos la lista hasta llegar al último nodo.
        while (current.next != head) {
            current = current.next;
        }

        // Conectamos el último nodo al nuevo nodo y hacemos que el nuevo nodo apunte al inicio.
        current.next = newNodo;
        newNodo.next = head;
    }

    // Método para eliminar un nodo con un valor dado de la lista circular.
    public void remove(int data) {
        if (head == null) {
            return; // Si la lista está vacía, no se puede eliminar nada.
        }

        // Si el nodo a eliminar es el inicio de la lista, ajustamos el inicio y el final de la lista.
        if (head.data == data) {
            Nodo current = head;

            // Recorremos la lista para encontrar el último nodo.
            while (current.next != head) {
                current = current.next;
            }

            head = head.next; // Establecemos el siguiente nodo como el nuevo inicio.
            current.next = head; // Hacemos que el último nodo apunte al nuevo inicio.
            return;
        }

        Nodo current = head;

        // Buscamos el nodo que precede al nodo a eliminar.
        while (current.next != head && current.next.data != data) {
            current = current.next;
        }

        if (current.next != head) {
            current.next = current.next.next; // Eliminamos el nodo ajustando los enlaces.
        }
    }

    // Método para imprimir todos los valores de la lista circular.
    public void printList() {
        if (head == null) {
            return; // Si la lista está vacía, no hay nada que imprimir.
        }

        Nodo current = head;
        
        // Utilizamos un bucle do-while para recorrer y mostrar los nodos de la lista.
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head); // Continuamos hasta que volvamos al inicio.
    }
    
    // Método para returnar una String con el contenido de la lista.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (head == null) {
            sb.append("");
        } else {
            Nodo current = head;
            do {
                if(current.next != null) // Evitamos imprimir el sufijo - al final
                    sb.append(current.data).append(" - ");
                current = current.next;
            } while (current != head);
        }
        return sb.toString();
    }
    
    public void clearList(){
        head = null;
    }
}
