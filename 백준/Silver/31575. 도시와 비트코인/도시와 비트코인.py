import sys
# 1. 문제의 input을 받습니다.
n, m = map(int, sys.stdin.readline().split())
board = []
for _ in range(m):
    board.append(list(map(int, sys.stdin.readline().split())))

# 2. BFS 탐색을 위한 초기값들을 설정합니다.
visited = [[False] * n for _ in range(m)]
# 동쪽, 남쪽 탐색을 위한 방향 배열
dx = [0, 1]
dy = [1, 0]


# 3. BFS 탐색 함수를 구현합니다.
def bfs(x,y):
    queue = [(x, y)]
    visited[x][y] = True
    while queue:
        x, y = queue.pop()
        # 3-1. 현재 정점에서 동쪽, 남쪽으로 이동가능한지 탐색합니다.
        for i in range(2):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < m and 0 <= ny < n and board[nx][ny] == 1 and not visited[nx][ny]: # 지도안에 존재하고, 공터/도로이면서 방문하지 않은 곳인지 확인합니다.
                visited[nx][ny] = True
                queue.append((nx, ny))


# 4. 시작 지점(북서쪽 끝)에서 BFS 탐색을 진행합니다.
bfs(0,0)
# 5. BFS 탐색 이후 남동쪽 끝에 방문이 가능했는지 확인합니다.
if visited[m-1][n-1]:
    print("Yes")
else:
    print("No")

