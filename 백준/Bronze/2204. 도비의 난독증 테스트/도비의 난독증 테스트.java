import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break; 

            sc.nextLine(); 
            String[] originalWords = new String[n]; 
            String[] lowerCaseWords = new String[n]; 

            for (int i = 0; i < n; i++) {
                originalWords[i] = sc.nextLine();
                lowerCaseWords[i] = originalWords[i].toLowerCase(); 
            }

            int index = 0;
            for (int i = 1; i < n; i++) {
                if (lowerCaseWords[i].compareTo(lowerCaseWords[index]) < 0) {
                    index = i; 
                }
            }
            System.out.println(originalWords[index]);
        }
        sc.close();
    }
}
