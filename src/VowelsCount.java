import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class VowelsCount extends Thread{
    private Path path;

    public VowelsCount(Path path) {
        this.path = path;
    }

    @Override
    public void run() {
        try {
            List<String> lines = Files.readAllLines(this.path);
            int vowelsCounter = 0;
            String terminalSymbol = "а, е, и, о, у, э, ю, я, e, u, i, o, a";
            for (String line : lines){
                for (int i = 0; i < line.length(); i++ ){
                    if (terminalSymbol.indexOf(line.charAt(i)) != -1) {
                        vowelsCounter++;
                    }
                }
            }
            System.out.println(vowelsCounter + " vowels are in file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
