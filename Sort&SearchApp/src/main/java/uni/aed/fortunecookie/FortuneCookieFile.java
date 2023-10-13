package uni.aed.fortunecookie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import uni.aed.linkedListADT.LinkedListTDA;

public class FortuneCookieFile {
    private LinkedListTDA<String> lista; // Una lista enlazada que almacenará los mensajes de la suerte.

    public FortuneCookieFile() {
        lista = new LinkedListTDA<>(); // Inicializamos la lista enlazada al crear un objeto de esta clase.
        loadFortunesFromFile("src\\main\\java\\uni\\aed\\FortuneCookie/fortunes.txt"); // Cargamos los mensajes desde un archivo.
    }

    public LinkedListTDA<String> getLista() {
        return lista; // Método para obtener la lista de mensajes de la suerte.
    }   

    // Método privado para cargar los mensajes desde un archivo.
    private void loadFortunesFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lista.add(line); // Agregamos cada línea del archivo a la lista de mensajes.
            }
        } catch (IOException e) {
            System.out.println("Error al cargar mensajes de la suerte desde el archivo: " + e.getMessage());
        }
    }
}
