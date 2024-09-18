import java.util.Scanner;

public class Bacteriana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String dna = scanner.nextLine().trim();  // DNA da bactéria
            String sequencia = scanner.nextLine().trim();  // Sequência de resistência

            // Verifica se a sequência está presente no DNA
            if (dna.contains(sequencia)) {
                System.out.println("Resistente");
            } else {
                System.out.println("Nao resistente");
            }
        }

        scanner.close();
    }
}
