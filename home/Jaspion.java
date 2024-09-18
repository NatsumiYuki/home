package home;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jaspion {

    static String translateLyrics(String songLyric, Map<String, String> dictionary) {
        var translatedLyrics = new StringBuilder();
        for (String word : songLyric.split(" ")) {
            String translation = dictionary.getOrDefault(word, word);
            translatedLyrics.append(translation).append(" ");
        }
        return translatedLyrics.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        
        for (int i = 0; i < testCases; i++) {
            int dictionaryEntries = sc.nextInt();
            int songLines = sc.nextInt(); sc.nextLine(); 

            Map<String, String> dictionary = new HashMap<>(dictionaryEntries);

            for (int j = 0; j < dictionaryEntries; j++) {
                String japaneseWord = sc.nextLine();
                String translation = sc.nextLine();
                dictionary.put(japaneseWord, translation);
            }

            for (int j = 0; j < songLines; j++) {
                String songLyric = sc.nextLine();
                String translatedLyrics = translateLyrics(songLyric, dictionary);
                System.out.println(translatedLyrics);
            }

            if (i < testCases - 1)
                System.out.println();  
        }

        sc.close();
    }
}