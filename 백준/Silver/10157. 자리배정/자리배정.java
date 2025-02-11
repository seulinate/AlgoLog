import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int C = sc.nextInt(); 
        int R = sc.nextInt();
        int K = sc.nextInt(); 
        
        if (K > C * R) {
            System.out.println(0);
            return;
        }
       
        // 방향: 위→ 오른쪽→ 아래 → 왼쪽
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int[][] seats = new int[R][C]; 
        int x = 0, y = 0, direction = 0;
        
        for (int num = 1; num <= K; num++) {
            seats[y][x] = num;
            
            if (num == K) { 
                System.out.println((x + 1) + " " + (y + 1));
                return;
            }
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            
            // 경계를 넘거나 이미 차 있으면 방향 전환
            if (nx < 0 || nx >= C || ny < 0 || ny >= R || seats[ny][nx] != 0) {
                direction = (direction + 1) % 4; // 방향 변경
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }
    }
}
