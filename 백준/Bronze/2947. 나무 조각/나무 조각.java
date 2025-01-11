import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] wood = new int[5];
        for (int i = 0; i < 5; i++) {
            wood[i] = in.nextInt();
        }

        while (true) {
            boolean sorted = true; 
            for (int i = 0; i < 4; i++) { 
                if (wood[i] > wood[i + 1]) {
                    int temp = wood[i];
                    wood[i] = wood[i + 1];
                    wood[i + 1] = temp;
                    
                    for (int j = 0; j < 5; j++) {
                        System.out.print(wood[j] + " ");
                    }
                    System.out.println();
                    sorted = false;
                }
            }
            if (sorted) break;
        }
    }
}
