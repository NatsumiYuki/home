package home;
import java.util.Comparator;
import java.util.Scanner;

public class Ordenar{
    static final Comparator<String> BY_LENGTH = Comparator.comparing(String::length);

    static void insertionSort(String[] array) {
        for(int i = 1; i < array.length; i++) {
            String temp = array[i];
            int j = i - 1;
            while ((j >= 0) && (BY_LENGTH.compare(array[j], temp) < 0)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); sc.nextLine(); 

        for(int testCase = 0; testCase < N; testCase++) {
            String input = sc.nextLine();
            String[] words = input.split(" ");
            insertionSort(words);
            System.out.println(String.join(" ", words));
        }

        sc.close();
    }
}