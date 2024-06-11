import java.util.*;

class Solution {
    
    // 이동 방향을 나타내는 배열 (동, 남, 서, 북)
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        // 방문 여부 및 최단 거리를 저장하는 배열
        int[][] visited = new int[maps.length][maps[0].length];
        
        // BFS를 사용하여 최단 경로를 탐색
        bfs(maps, visited);
        // 목적지에 도달할 수 있는 경우 최단 거리를 저장
        answer = visited[maps.length-1][maps[0].length-1];
        
        // 목적지에 도달할 수 없는 경우 -1 반환
        if(answer == 0){
            answer = -1;
        }
        
        return answer;
    }
    
    public void bfs(int[][] maps, int[][] visited){
        // 시작점 설정
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        
        while(!queue.isEmpty()){
            int[] current = queue.remove();
            int cX = current[0];
            int cY = current[1];
            
            for(int i = 0; i < 4; i++){
                int nX = cX + dx[i];
                int nY = cY + dy[i];
                
                // 맵의 범위를 벗어나는 경우 무시
                if(nX < 0 || nX > maps.length-1 || nY < 0 || nY > maps[0].length-1)
                    continue;
                
                // 방문하지 않았고, 갈 수 있는 길인 경우
                if(visited[nX][nY] == 0 && maps[nX][nY] == 1){
                    // 현재 위치에서 한 칸 이동한 거리를 저장
                    visited[nX][nY] = visited[cX][cY] + 1;
                    queue.add(new int[]{nX, nY});
                }
            }
        }
    }
}
