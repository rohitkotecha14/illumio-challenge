import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadInputFile {
    public List<String> readLines(String filePath){
        List<String> lines = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine()) != null){
                lines.add(line.toLowerCase());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        return lines;
    }
}
