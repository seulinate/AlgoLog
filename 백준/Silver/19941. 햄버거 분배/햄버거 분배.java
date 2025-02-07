import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        int K = sc.nextInt();  
        sc.nextLine();  
        String table = sc.nextLine();  // 식탁 상태
        
        char[] arr = table.toCharArray();  // 문자열을 배열로 변환
        boolean[] eaten = new boolean[N]; 
        int count = 0;  

        // 모든 위치 탐색 (사람 P 찾기)
        for (int i = 0; i < N; i++) {
            if (arr[i] == 'P') { 
                for (int j = Math.max(0, i - K); j <= Math.min(N - 1, i + K); j++) {
                    if (arr[j] == 'H' && !eaten[j]) { 
                        eaten[j] = true;  
                        count++;
                        break; 
                    }
                }
            }
        }
        System.out.println(count);
    }
}
