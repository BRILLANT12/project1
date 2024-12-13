import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class passagerwriting {
    public static void main(String[] args) {
        String filePath = "\"C:\\Users\\MARIE ESSO\\Desktop\\passager.txt\"/fichier.txt";
        try (BufferedWriter writer = new BufferedWriter(new
                FileWriter(filePath, true)))
        {
            writer.write("adresse;nom;contact;identifiant;passeport");
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " +
                    e.getMessage());
        }
    }
}
