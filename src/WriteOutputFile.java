import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


public class WriteOutputFile {
    public void writeOutput(String filePath, Map<String, Integer> matchCounts) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(String.format("%-20s %s%n", "Predefined word", "Match count"));
            for (Map.Entry<String, Integer> entry : matchCounts.entrySet()) {
                writer.write(String.format("%-20s %d%n", entry.getKey(), entry.getValue()));
            }
        }
    }
}
