package uni.aed.fortunecookie;

import java.util.Random;
import uni.aed.linkedListADT.LinkedListTDA;

public class FortuneCookieManager {
    LinkedListTDA<String> fortunas; // Lista que almacenará los mensajes de la galleta de la fortuna.

    public FortuneCookieManager() {
        FortuneCookieFile fortuneCookieFile = new FortuneCookieFile(); // Creamos un objeto FortuneCookieFile.
        fortunas = fortuneCookieFile.getLista(); // Obtenemos la lista de mensajes de la suerte desde el archivo.
    }

    // Método para obtener un mensaje aleatorio de la galleta de la fortuna.
    public String nexFortune() {
        Random random = new Random(); // Creamos un objeto Random para generar números aleatorios.
        int index = random.nextInt(fortunas.size()); // Generamos un índice aleatorio dentro del rango de la lista.
        return fortunas.get(index); // Devolvemos el mensaje correspondiente al índice aleatorio.
    }
}
