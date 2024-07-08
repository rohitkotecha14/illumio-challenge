import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MatchCounter {

    public Map<String, Integer> countMatches(List<String> lines, List<String> predefinedWords) {
        Map<String, Integer> match_counts = new HashMap<>(); // store match counts

//      set of predefined words (case-insensitive)
        Set<String> wordSet = predefinedWords.stream().map(String :: toLowerCase).collect(Collectors.toSet());

        for (String line : lines) {
            String[] words = line.split("[^\\w']+");

            for (String word : words) {
                if(wordSet.contains(word)) {
                    match_counts.put(word, match_counts.getOrDefault(word, 0) + 1);
                }
            }
        }

        return match_counts;
    }

}
