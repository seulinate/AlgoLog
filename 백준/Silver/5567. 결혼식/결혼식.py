import sys
from collections import deque

# 1. 문제의 input을 인접 그래프 형태로 받습니다.
n = int(sys.stdin.readline())
m = int(sys.stdin.readline())
graph = [[] for _ in range(n+1)]
for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

# 2. BFS 탐색헤 활용할 방문 배열을 선언합니다.
visited = [0 for _ in range (n+1)]

# 3. BFS 탐색을 구현합니다.
def bfs(start):
    que = deque([start]) # 3-1. queue를 만들고, 시작 정점을 추가합니다.

    while que:
        now = que.popleft() # 3-2. queue의 가장 앞 원소를 탐색합니다.
        for x in graph[now]: # 3-3. 해당 정점과 연결된 정점들을 탐색합니다.
            if visited[x] == 0: # 3-4. 방문된 정점이 아니라면, 방문표기(거리+1)을 하고 queue에 추가합니다.
                que.append(x)
                visited[x] = visited[now] + 1


bfs(1)
ans = 0
# 4. BFS 탐색을 통해 구한 거리를 기반으로 정답을 구합니다.
for i in range(2, n+1):
    if 0 < visited[i] < 3:
        ans += 1
print(ans)