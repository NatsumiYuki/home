import java.util.*;

public class Frequencies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            Map<Integer, Integer> frequencies = new HashMap<>();
            for (char ch : input.toCharArray())
                frequencies.put((int) ch, frequencies.getOrDefault((int) ch, 0) + 1);

            Set<Map.Entry<Integer, Integer>> sortedValues = new TreeSet<>(Map.Entry.comparingByValue());
            sortedValues.addAll(frequencies.entrySet());

            sortedValues.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        }

        sc.close();
    }
}