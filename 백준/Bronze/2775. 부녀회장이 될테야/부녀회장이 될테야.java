import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[][] dp = new int[15][15];

        for (int i = 0; i <= 14; i++) {
            dp[0][i] = i; // 0층 i호에는 i명
            dp[i][1] = 1; // i층 1호에는 1명
        }

     
        for (int k = 1; k <= 14; k++) { // 층
            for (int n = 2; n <= 14; n++) { // 호
                dp[k][n] = dp[k][n - 1] + dp[k - 1][n];
            }
        }

        for (int t = 0; t < T; t++) {
            int k = sc.nextInt(); // 층
            int n = sc.nextInt(); // 호
            System.out.println(dp[k][n]);
        }

        sc.close();
    }
}
