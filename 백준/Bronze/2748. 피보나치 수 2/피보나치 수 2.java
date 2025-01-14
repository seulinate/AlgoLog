import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        long[] fib = new long[n + 1];

        fib[0] = 0; 
        if (n > 0) {
            fib[1] = 1;
        }

        //DP를 적용한 부분
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println(fib[n]);
        
        sc.close();
    }
}
