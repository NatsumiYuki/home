import java.util.*;

class Camiseta {
    String nome;
    String cor;
    String tamanho;

    public Camiseta(String nome, String cor, String tamanho) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }
}

public class camisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Camiseta> camisetas = new ArrayList<>();
        boolean primeiroCaso = true;

        while (true) {
            int N = Integer.parseInt(scanner.nextLine().trim());
            if (N == 0) break;

            camisetas.clear(); // Limpa a lista para o próximo caso de teste

            for (int i = 0; i < N; i++) {
                String nome = scanner.nextLine().trim();
                String[] detalhes = scanner.nextLine().trim().split(" ");
                String cor = detalhes[0];
                String tamanho = detalhes[1];
                camisetas.add(new Camiseta(nome, cor, tamanho));
            }

            // Ordena as camisetas
            Collections.sort(camisetas, (a, b) -> {
                int corCompare = a.cor.compareTo(b.cor); // Ordem ascendente pela cor
                if (corCompare != 0) return corCompare;

                int tamanhoCompare = b.tamanho.compareTo(a.tamanho); // Ordem descendente pelo tamanho
                if (tamanhoCompare != 0) return tamanhoCompare;

                return a.nome.compareTo(b.nome); // Ordem ascendente pelo nome
            });

            // Imprime uma linha em branco entre os casos de teste, exceto no primeiro
            if (!primeiroCaso) {
                System.out.println();
            }
            primeiroCaso = false;

            // Imprime as camisetas ordenadas
            for (Camiseta camiseta : camisetas) {
                System.out.printf("%s %s %s%n", camiseta.cor, camiseta.tamanho, camiseta.nome);
            }
        }

        scanner.close();
    }
}

