import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] board = new int[5][5];
    static Set<String> unique = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 숫자판 입력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        
        // 모든 칸에서 탐색을 시작
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, 0, "");
            }
        }

        // 결과 출력
        System.out.println(unique.size());
    }

    // 숫자를 조합하기 위한 DFS 함수
    public static void dfs(int x, int y, int depth, String number) {
        if (depth == 6) {
            unique.add(number);
            return;
        }
        
        // 4방향으로 이동하면서 확인
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            
            // 숫자판을 벗어나지 않는 범위에서 탐색
            if (nextX >= 0 && nextY >= 0 && nextX < 5 && nextY < 5) {
                dfs(nextX, nextY, depth + 1, number + board[x][y]);
            }
        }
    }
}
