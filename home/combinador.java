import java.util.Scanner;

public class combinador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o inteiro

        for (int i = 0; i < N; i++) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(combinarStrings(str1, str2));
        }

        scanner.close();
    }

    private static String combinarStrings(String str1, String str2) {
        StringBuilder resultado = new StringBuilder();
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);
        
        // Alternando letras
        for (int i = 0; i < minLen; i++) {
            resultado.append(str1.charAt(i));
            resultado.append(str2.charAt(i));
        }
        
        // Adicionando letras restantes da string mais longa
        if (len1 > minLen) {
            resultado.append(str1.substring(minLen));
        } else {
            resultado.append(str2.substring(minLen));
        }
        
        return resultado.toString();
    }
}
