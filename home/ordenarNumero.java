import java.util.*;

public class ordenarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valores = sc.nextInt();

        // Listas para armazenar os números pares e ímpares
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        int numero;
        for (int i = 0; i < valores; i++) {
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                par.add(numero);
            } else {
                impar.add(numero);
            }
        }
        
        // Ordenar a lista de pares em ordem crescente
        Collections.sort(par);

        // Ordenar a lista de ímpares em ordem decrescente
        Collections.sort(impar, Comparator.reverseOrder());

        // Imprimir a lista de pares
        for (int num : par) {
            System.out.println(num);
        }

        // Imprimir a lista de ímpares
        for (int num : impar) {
            System.out.println(num);
        }

        // Fechar o scanner
        sc.close();
    }
}
