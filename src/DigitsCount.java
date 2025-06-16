import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DigitsCount extends Thread{
    private Path path;

    public DigitsCount(Path path) {
        this.path = path;
    }

    @Override
    public void run() {
        try {
            List<String> lines = Files.readAllLines(this.path);
            int digitsCounter = 0;
            for (String line : lines){
                for (int i = 0; i < line.length(); i++ ){
                    if (Character.isDigit(line.charAt(i))) {
                        digitsCounter++;
                    }
                }
            }
            System.out.println(digitsCounter + " digits are in file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }
}
