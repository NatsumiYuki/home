import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tradutor{

    public static void main(String[] args) {
        // Mapeia os países para suas respectivas mensagens
        Map<String, String> messages = new HashMap<>();
        messages.put("brasil", "Feliz Natal!");
        messages.put("alemanha", "Frohliche Weihnachten!");
        messages.put("austria", "Frohe Weihnacht!");
        messages.put("coreia", "Chuk Sung Tan!");
        messages.put("espanha", "Feliz Navidad!");
        messages.put("grecia", "Kala Christougena!");
        messages.put("estados-unidos", "Merry Christmas!");
        messages.put("inglaterra", "Merry Christmas!");
        messages.put("australia", "Merry Christmas!");
        messages.put("portugal", "Feliz Natal!");
        messages.put("suecia", "God Jul!");
        messages.put("turquia", "Mutlu Noeller");
        messages.put("argentina", "Feliz Navidad!");
        messages.put("chile", "Feliz Navidad!");
        messages.put("mexico", "Feliz Navidad!");
        messages.put("antardida", "Merry Christmas!");
        messages.put("canada", "Merry Christmas!");
        messages.put("irlanda", "Nollaig Shona Dhuit!");
        messages.put("belgica", "Zalig Kerstfeest!");
        messages.put("italia", "Buon Natale!");
        messages.put("libia", "Buon Natale!");
        messages.put("siria", "Milad Mubarak!");
        messages.put("marrocos", "Milad Mubarak!");
        messages.put("japao", "Merii Kurisumasu!");

        Scanner scanner = new Scanner(System.in);
        
        // Lê os nomes dos países até o final do input
        while (scanner.hasNextLine()) {
            String country = scanner.nextLine().trim().toLowerCase();
            // Verifica se a mensagem existe no mapa
            if (messages.containsKey(country)) {
                System.out.println(messages.get(country));
            } else {
                System.out.println("--- NOT FOUND ---");
            }
        }
        
        scanner.close();
    }
}
