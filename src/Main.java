import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String pathFile = "src/listpass.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(pathFile)))
        {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " +
                    e.getMessage());
        }
    }
    Personne personne= new Personne("defense","chloe",6202,"EDSDYUV");
}

