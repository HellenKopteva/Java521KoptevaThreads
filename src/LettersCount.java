import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LettersCount extends Thread{
    private Path path;

    public LettersCount(Path path) {
        this.path = path;
    }

    @Override
    public void run() {
        try {
            List<String> lines = Files.readAllLines(this.path);
            int lettersCount = 0;
            for (String line : lines){
                for (int i = 0; i < line.length(); i++ ){
                    if (Character.isLetter(line.charAt(i))) {
                        lettersCount++;
                    }
                }
            }
            System.out.println(lettersCount + " letters are in the file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
