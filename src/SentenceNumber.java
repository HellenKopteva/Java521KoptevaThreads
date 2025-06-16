import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SentenceNumber extends Thread{
    private Path path;

    public SentenceNumber(Path path) {
        this.path = path;
    }

    @Override
    public void run() {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(this.path);
            int sentencesCounter = 0;
            String terminalSymbol = ".?!";
            for (String line : lines){
                for (int i = 0; i < line.length(); i++ ){
                    if (terminalSymbol.indexOf(line.charAt(i)) != -1) {
                        sentencesCounter++;
                    }
                }
            }
            System.out.println(sentencesCounter + " sentences are in file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
