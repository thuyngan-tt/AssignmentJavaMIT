import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {
    public static boolean testMagic(String pathName) throws IOException {
        // Open the file
        pathName = "src\\luna.txt";
        BufferedReader reader = new BufferedReader(new FileReader(pathName));
        String line = reader.readLine();

        boolean isMagic = true;
        int sumLine =0;

        if(line !=null) {
            String[] rows = line.split("\t");
            for (String row : rows) {
                sumLine += Integer.parseInt(row);
            }
        }
        /*
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\t");
            for (String part : parts) {
                System.out.printf ("%-10s", part);
            }
            System.out.println();
        }
        */

        while (line != null) {
            // ... sum each row of numbers
            String[] parts = line.split("\t");
            int sum = 0;
            for (String part : parts) {
                sum += Integer.parseInt(part);
            }
            if (sum != sumLine) {
                // If this is the first row, remember the sum
                isMagic = false;
                break;
            }
            line = reader.readLine();
        }
        reader.close();
        return isMagic;
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }
    }
}
