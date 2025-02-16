import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 
        int K = Integer.parseInt(st.nextToken()); 
        int X = Integer.parseInt(st.nextToken()); 
        
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph.get(A).add(B);
        }
        
        int[] distance = new int[N + 1];
        Arrays.fill(distance, -1);
        distance[X] = 0; 
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(X);
        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph.get(current)) {
                if (distance[next] == -1) {
                  
                    distance[next] = distance[current] + 1;
                    queue.offer(next);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (distance[i] == K) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(result);
            for (int city : result) {
                System.out.println(city);
            }
        }
    }
}
