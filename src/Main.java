import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("text.txt")) {
            for (char i = 'A', j = 'a'; i <= 'Z' && j <= 'z'; i++, j++) {
                writer.write(i + " " + j + "\n");
            }
            for (int i = 0; i < 10; i++) {
                writer.write(i + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        int count = 1;
        try(FileReader reader = new FileReader("text.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                System.out.println(count + ": " + scanner.nextLine());
                count++;
            }
        } catch (IOException ioe) {
            System.out.println("The specified file does not exist");
        }

    }
}