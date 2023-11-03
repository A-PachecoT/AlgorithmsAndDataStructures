/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.queue;

/**
 *
 * @author AndreP
 */
public class TestQueueTDA {
    public static void main(String[] args) {
        QueueTDA<Integer> q;
        q = new ArrayQueueTDA<Integer>(5);
        q = new LinkedQueueTDA<Integer>();
        
        try {
            for (int i = 0; i < 5; i++) {
                q.add(i * 10); // adds 0, 10, 20, ... 
            }
            q.delete();
            q.add(60);
//            System.out.println("Queue after operations: " + q.toString());
            q.imprimir();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

