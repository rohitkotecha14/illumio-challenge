import java.util.List;
import java.util.Map;



public class Main {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java Main <inputTextFilePath> <predefinedWordsFilePath> <outputFilePath>");
            return;
        }

        String textFilePath = args[0];
        String predefinedWordsFilePath = args[1];
        String outputFilePath = args[2];


        ReadInputFile fileReader = new ReadInputFile();
        MatchCounter matchCounter = new MatchCounter();
        WriteOutputFile fileWriter = new WriteOutputFile();

        try{
            List<String> textLines = fileReader.readLines(textFilePath);
            List<String> words = fileReader.readLines(predefinedWordsFilePath);
            Map<String, Integer> matchCounts = matchCounter.countMatches(textLines, words);
            fileWriter.writeOutput(outputFilePath, matchCounts);
        } catch(Exception e){
                System.out.println(e.getMessage());
        }
    }
}