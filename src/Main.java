import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hash hash = new Hash();
        try {
            Scanner keywordScanner = BookReader.read("assets/chaves.txt");
            String keyWordLine = keywordScanner.nextLine();
            String[] words = keyWordLine.split(" ");
            for (String word : words) {
                hash.insert(StringUtils.cleanWord(word));
            }

            Scanner textScanner = BookReader.read("assets/texto.txt");
            int lineNumber = 1;
            while (textScanner.hasNext()) {
                String line = textScanner.nextLine();
                for (String word : line.split(" ")) {
                    if (word.isBlank()) continue;
                    KeyWord keyWord = hash.find(StringUtils.cleanWord(word));
                    if (keyWord == null) continue;
                    keyWord.insertOccurrences(lineNumber);
                }
                lineNumber += 1;
            }
            hash.print();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
