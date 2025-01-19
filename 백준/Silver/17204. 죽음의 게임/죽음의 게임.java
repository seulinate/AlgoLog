import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt(); 
        int K = in.nextInt(); 
        
        int[] targets = new int[N];
        for (int i = 0; i < N; i++) {
            targets[i] = in.nextInt();
        }
        
        System.out.println(findMinimumM(N, K, targets));
    }
    
    public static int findMinimumM(int N, int K, int[] targets) {
        boolean[] visited = new boolean[N]; 
        int current = 0; 
        int steps = 0; 
        
       
        while (!visited[current]) {
            visited[current] = true; 
            steps++;
            
            if (targets[current] == K) {
                return steps;
            }
            
          
            current = targets[current];
        }
        
        return -1;
    }
}
