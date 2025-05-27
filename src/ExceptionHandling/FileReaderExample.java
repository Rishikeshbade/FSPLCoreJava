package ExceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        // Provide the full path to the file, not just the directory
        String path = "C:\\Users\\User\\eclipse-workspace\\FSPLCoreJava\\src\\ExceptionHandling\\you.txt"; // Ensure this file exists

        File file = new File(path);

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found at path: " + path);
        }
    }
}
