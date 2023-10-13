package uni.aed.fortunecookie;

import java.util.Scanner;

public class FortuneCookieMain {
    public static void main(String[] args) {
        FortuneCookieManager fortuneCookieManager = new FortuneCookieManager(); // Creamos un objeto FortuneCookieManager.
        Scanner escaner = new Scanner(System.in); // Creamos un objeto Scanner para la entrada del usuario.
        String rpta;

        System.out.println("****Galletas de la Fortuna****");
        System.out.println(fortuneCookieManager.nexFortune()); // Mostramos un mensaje de la galleta de la fortuna inicial.

        System.out.println("Pulse S para continuar obteniendo galletas de la fortuna, N para salir:");

        while (true) {
            rpta = escaner.next(); // Leemos la respuesta del usuario.

            // Si la respuesta no es "N" (ignorando mayúsculas/minúsculas), mostramos otro mensaje de la galleta de la fortuna.
            if (!rpta.equalsIgnoreCase("N")) {
                System.out.println(fortuneCookieManager.nexFortune());
            } else {
                break; // Si la respuesta es "N", salimos del bucle y terminamos el programa.
            }
        }
    }
}
