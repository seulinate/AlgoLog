import java.util.*;

public class Main {
    static int R, C;
    static char[][] map;
    static boolean[][] sink;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine();

        map = new char[R][C];
        sink = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        // 1. 각 땅('X')이 가라앉는지 확인
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'X' && shouldSink(i, j)) {
                    sink[i][j] = true;
                }
            }
        }

        // 2. 가라앉은 곳 '.'으로 변경
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (sink[i][j]) {
                    map[i][j] = '.';
                }
            }
        }

        // 3. 남은 섬들의 최소 영역 찾기
        int minX = R, maxX = 0, minY = C, maxY = 0;
        boolean found = false;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'X') {
                    found = true;
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        // 4. 최소 직사각형 영역 출력
        if (found) {
            for (int i = minX; i <= maxX; i++) {
                for (int j = minY; j <= maxY; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
        }
    }

    // 특정 좌표 (x, y)의 땅이 가라앉는지 확인하는 함수
    static boolean shouldSink(int x, int y) {
        int waterCount = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || ny < 0 || nx >= R || ny >= C || map[nx][ny] == '.') {
                waterCount++;
            }
        }
        return waterCount >= 3;
    }
}
