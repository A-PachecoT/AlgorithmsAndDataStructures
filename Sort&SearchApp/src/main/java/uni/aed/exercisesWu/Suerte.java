/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.exercisesWu;

/**
 *
 * @author AndreP
 */
import java.util.Scanner;
import java.util.Random;
import uni.aed.list.ListaEnlazada;
import uni.aed.list.Nodo;

public class Suerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEnlazada suertes = new ListaEnlazada();

        System.out.println("Ingrese el número N de suertes:");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese suerte " + (i + 1) + ":");
            suertes.addLast(sc.nextLine());
        }

        String respuesta;
        Random rand = new Random();

        do {
            System.out.println("¿Desea desplegar una suerte? (sí/no):");
            respuesta = sc.nextLine().trim().toLowerCase();

            if ("sí".equals(respuesta)) {
                int indiceAleatorio = rand.nextInt(n);
                Nodo actual = suertes.head;
                for (int i = 0; i < indiceAleatorio; i++) {
                    actual = actual.next;
                }
                System.out.println("Tu suerte es: " + actual.data);
            }

        } while (!"no".equals(respuesta));

        System.out.println("Gracias por jugar!");
    }
}

