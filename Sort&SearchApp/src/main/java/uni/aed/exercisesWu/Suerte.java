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
import uni.aed.linkedListADT.LinkedListTDA;
import uni.aed.list.ListaEnlazada;
import uni.aed.list.Nodo;

public class Suerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListTDA<String> suertes = new LinkedListTDA<String>();

        System.out.println("Ingrese el número N de suertes:");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese suerte " + (i + 1) + ":");
            suertes.add(sc.nextLine());
        }

        String respuesta;
        Random rand = new Random();

        do {
            System.out.println("¿Desea desplegar una suerte? (si/no):");
            respuesta = sc.nextLine().trim().toLowerCase();

            if ("si".equals(respuesta)) {
                int indiceAleatorio = rand.nextInt(n);
                System.out.println("Tu suerte es: " + suertes.get(indiceAleatorio));
            }

        } while (!"no".equals(respuesta));

        System.out.println("Gracias por jugar!");
    }
}

