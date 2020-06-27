import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Nodes.Node;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputExpression = reader.readLine().replaceAll("\\s","");

            CommonTokenStream tokens = new CommonTokenStream(
                    new ExpressionLexer(CharStreams.fromString(inputExpression)));
            Node tree = new ExpressionParser(tokens).expression().node;
            tree.getStringRepresentation();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}