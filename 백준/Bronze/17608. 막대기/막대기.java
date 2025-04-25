import java.io.*;
import java.util.*;

public class Main {
    public static int solution(int[] sticks) {
        int count = 0;
        int maxHeight = 0;

        for (int i = sticks.length - 1; i >= 0; i--) {
            if (sticks[i] > maxHeight) {
                count++;
                maxHeight = sticks[i];
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] sticks = new int[N];

        for (int i = 0; i < N; i++) {
            sticks[i] = Integer.parseInt(br.readLine());
        }

        int visibleCount = solution(sticks);
        System.out.println(visibleCount);
    }
}
