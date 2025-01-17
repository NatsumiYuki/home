package home;
import java.util.*;

public class pokemon {

    public static final int pomekonsAvailable = 151;

    public static int numOfNonDuplicatePomekons(String[] collection) {
        String[] exclusiveCollection = new String[collection.length];
        int index = 0;
        for (String pomekon : collection) {
            boolean isUnique = true;
            for (int i = 0; i < index; i++) {
                if (pomekon.equals(exclusiveCollection[i])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique)
                exclusiveCollection[index++] = pomekon;
        }
        return index;
    }

    public static void main(String[] args) {
        String[] allPomekonsCaptured = readPomekons();
        int pomekonsCaught = numOfNonDuplicatePomekons(allPomekonsCaptured);
        System.out.println("Falta(m) " + (pomekonsAvailable - pomekonsCaught) + " pomekon(s).");
    }

    public static String[] readPomekons() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] pomekons = new String[N];
        for (int i = 0; i < N; i++)
            pomekons[i] = sc.nextLine();

        sc.close();
        return pomekons;
    }
}