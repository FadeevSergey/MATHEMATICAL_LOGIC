import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String expression = reader.readLine().replaceAll("\\s", "");
            Parser parser = new Parser(expression);
            parser.startParse();
            parser.getRoot().getStringRepresentation();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
