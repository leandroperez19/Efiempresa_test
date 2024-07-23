import java.util.HashMap;
import java.util.Map;

public class Challenge1 {
    public static boolean canWriteNote(String note, String magazine) {
        // Para evitar el chequeo de palabras en Capitalize convertimos los textos a minusculas
        note = note.toLowerCase();
        magazine = magazine.toLowerCase();

        // Convertimos ambos textos a un arreglo donde cada palabra es un valor,
        // usamos el regex para eliminar espacios
        String[] wordsNote = note.split("\\s+");
        String[] wordsMagazine = magazine.split("\\s+");

        // Creamos un map para contar cuantas veces aparece cada palabra en la revista
        Map<String, Integer> magazineWordsFrequency = new HashMap<>();
        for (String word : wordsMagazine)
            magazineWordsFrequency.put(word, magazineWordsFrequency.getOrDefault(word, 0) + 1);

        // Verificamos si hay suficientes palabras en la revista para escribir la nota
        for (String word : wordsNote) {
            // Si la palabra no esta en la revista o ya no quedan suficientes, retornamos false
            if (!magazineWordsFrequency.containsKey(word) || magazineWordsFrequency.get(word) == 0) {
                return false;
            }
            // Si se cumple la condicion de arriba disminuimos la cuenta de esa palabra en el map
            magazineWordsFrequency.put(word, magazineWordsFrequency.get(word) - 1);
        }
        // Si llegamos aqui, significa que todas las palabras de la nota estan en la revista
        return true;
    }

    public static void main(String[] args) {
        String note = "esta es una nota";
        String magazine = "esta es una revista que tiene una nota";
        System.out.println(canWriteNote(note, magazine)); // Deberia retornar true
    }
}
