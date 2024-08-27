import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점의 개수
        int m = sc.nextInt(); // 간선의 개수

        // 그래프 초기화
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 입력
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        // 방문 여부 배열 초기화
        visited = new boolean[n + 1];

        int connectedComponents = 0;
        // 모든 정점을 확인하면서 연결 요소 탐색
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i); // 연결 요소 하나를 탐색
                connectedComponents++;
            }
        }

        // 연결 요소의 개수 출력
        System.out.println(connectedComponents);
    }

    public static void dfs(int node) {
        visited[node] = true;

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
