import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        int winner = 0; 
        int maxRemainder = -1; 
        for (int i = 1; i <= N; i++) {
            String[] input = br.readLine().split(" ");
            int[] cards = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            
            int maxCurrent = 0;
            for (int a = 0; a < 5; a++) {
                for (int b = a + 1; b < 5; b++) {
                    for (int c = b + 1; c < 5; c++) {
                        int sum = cards[a] + cards[b] + cards[c];
                        int remainder = sum % 10;
                        maxCurrent = Math.max(maxCurrent, remainder);
                    }
                }
            }
            if (maxCurrent > maxRemainder || (maxCurrent == maxRemainder && i > winner)) {
                maxRemainder = maxCurrent;
                winner = i;
            }
        }
        System.out.println(winner);
    }
}
