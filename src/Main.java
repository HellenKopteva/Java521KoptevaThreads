import java.nio.file.Path;
import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Path path = Paths.get("D:/Java521/Java521KoptevaThreads/src/Data/File.txt");
        WordsNumber wNumber = new WordsNumber(path);
        SentenceNumber sNumber = new SentenceNumber(path);
        LettersCount lNumber = new LettersCount(path);
        DigitsCount dCount = new DigitsCount(path);
        VowelsCount vCount = new VowelsCount(path);
        wNumber.start();
        sNumber.start();
        lNumber.start();
        dCount.start();
        vCount.start();
        wNumber.join();
        sNumber.join();
        lNumber.join();
        dCount.join();
        vCount.join();
    }
}