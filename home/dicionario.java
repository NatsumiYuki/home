import java.util.*;
import java.io.*;

public class dicionario{
    public static void main(String[] args) {
        Set<String> palavras = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            // Extrai palavras apenas com letras
            String[] palavrasExtraidas = linha.split("[^a-zA-Z]+");
            for (String palavra : palavrasExtraidas) {
                if (!palavra.isEmpty()) {
                    // Adiciona a palavra em minúsculas ao conjunto
                    palavras.add(palavra.toLowerCase());
                }
            }
        }
        
        scanner.close();

        // Imprime as palavras em ordem alfabética
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
