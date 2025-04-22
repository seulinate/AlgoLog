import java.io.*;
import java.util.*;

public class Main {

    public static int solution(int N, int M, int[] apples) {
        int move = 0;
        int left = 1;    
        int right = M;    
        for (int apple : apples) {
            if (apple < left) {
                move += left - apple;
                right -= (left - apple);
                left = apple;
            } else if (apple > right) {
                move += apple - right;
                left += (apple - right);
                right = apple;
            }
        }

        return move;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        int J = Integer.parseInt(br.readLine());
        int[] apples = new int[J];


        for (int i = 0; i < J; i++) {
            apples[i] = Integer.parseInt(br.readLine());
        }
        int result = solution(N, M, apples);
        System.out.println(result);
    }
}