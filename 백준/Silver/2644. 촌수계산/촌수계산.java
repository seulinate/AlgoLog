import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int personA = sc.nextInt();  
        int personB = sc.nextInt();  
        int m = sc.nextInt();  

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int parent = sc.nextInt();
            int child = sc.nextInt();
            graph.get(parent).add(child);
            graph.get(child).add(parent);  
        }

       
        int result = bfs(graph, n, personA, personB);
        System.out.println(result);

        sc.close();
    }


    private static int bfs(List<List<Integer>> graph, int n, int start, int target) {
        boolean[] visited = new boolean[n + 1];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {start, 0}); 

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int node = current[0];
            int distance = current[1];

            if (node == target) {
                return distance;
            }
            visited[node] = true;

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    queue.add(new int[] {neighbor, distance + 1});
                }
            }
        }
        return -1;
    }
}
