
import java.util.*;

public class Main {
    static int R, C;
    static char[][] map, newMap;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine();
        
        map = new char[R][C];
        newMap = new char[R][C];
        
        for (int i = 0; i < R; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
                newMap[i][j] = map[i][j];
            }
        }
        
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'X' && willSink(i, j)) {
                    newMap[i][j] = '.';
                }
            }
        }
        int minX = R, maxX = 0, minY = C, maxY = 0;
        boolean hasLand = false;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (newMap[i][j] == 'X') {
                    hasLand = true;
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        if (!hasLand) return;
        for (int i = minX; i <= maxX; i++) {
            for (int j = minY; j <= maxY; j++) {
                System.out.print(newMap[i][j]);
            }
            System.out.println();
        }
    }
    static boolean willSink(int x, int y) {
        int seaCount = 0;
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d], ny = y + dy[d];
            if (nx < 0 || ny < 0 || nx >= R || ny >= C || map[nx][ny] == '.') {
                seaCount++;
            }
        }
        return seaCount >= 3;
    }
}
