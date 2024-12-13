import java.io.*;

public class passagerreading {
    public static void main(String[] args) {
        String pathFile = "\"C:\\Users\\MARIE ESSO\\Desktop\\passager.txt\"/fichier.txt";
        try (BufferedReader reader = new BufferedReader(new
                FileReader(pathFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " +
                    e.getMessage());
        }
    }


}

