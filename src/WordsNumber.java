import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WordsNumber extends Thread {
    private Path path;

    public WordsNumber(Path path) {
        this.path = path;
    }

    @Override
    public void run() {
        try {
            List<String> lines = Files.readAllLines(this.path);
            int wordsCounter = 0;
            for (String line : lines){
                String[] words = line.split("\\s+");
                wordsCounter += words.length;
            }
            System.out.println(wordsCounter + " words are in file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
