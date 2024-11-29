import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookReader {
    public static Scanner read(String filepath) throws FileNotFoundException {
        File file = new File(filepath);
        return new Scanner(file);
    }
}
