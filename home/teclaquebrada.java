import java.util.*;

public class teclaquebrada{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            Deque<String> partes = new LinkedList<>();
            StringBuilder parteAtual = new StringBuilder();
            boolean isHomeMode = false;

            for (char c : linha.toCharArray()) {
                if (c == '[') {
                    // Adiciona a parte atual ao deque e inicia modo home
                    if (parteAtual.length() > 0) {
                        if (isHomeMode) {
                            partes.addFirst(parteAtual.toString());
                        } else {
                            partes.addLast(parteAtual.toString());
                        }
                        parteAtual.setLength(0); // Limpa a parte atual
                    }
                    isHomeMode = true; // Ativa o modo home
                } else if (c == ']') {
                    // Adiciona a parte atual ao deque e inicia modo end
                    if (parteAtual.length() > 0) {
                        if (isHomeMode) {
                            partes.addFirst(parteAtual.toString());
                        } else {
                            partes.addLast(parteAtual.toString());
                        }
                        parteAtual.setLength(0); // Limpa a parte atual
                    }
                    isHomeMode = false; // Ativa o modo end
                } else {
                    // Adiciona o caractere à parte atual
                    parteAtual.append(c);
                }
            }

            // Adiciona a última parte
            if (parteAtual.length() > 0) {
                if (isHomeMode) {
                    partes.addFirst(parteAtual.toString());
                } else {
                    partes.addLast(parteAtual.toString());
                }
            }

            // Constrói o resultado final
            StringBuilder resultado = new StringBuilder();
            while (!partes.isEmpty()) {
                resultado.append(partes.pollFirst());
            }

            // Imprime o resultado
            System.out.println(resultado.toString());
        }

        scanner.close();
    }
}
