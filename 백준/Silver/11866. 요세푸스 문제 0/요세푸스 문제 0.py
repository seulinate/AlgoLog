import sys
from collections import deque
# 1. 문제의 Input을 받습니다.
n, k = map(int, sys.stdin.readline().split())
# 2. 1~N 까지의 사람들을 queue에 넣습니다.
que = deque([i for i in range(1, n+1)])

ans = []

# 3. N명의 사람이 모두 제외될 떄 까지 탐색합니다.
while que:
    for _ in range(k-1):
        # 4. K-1번쨰 사람까지 queue에서 제외하고 바로 다시 queue에 삽입합니다.
        que.append(que.popleft())
    # 5. K번째 사람은 queue에서 제외하고 , 정답 배열에 넣습니다.
    ans.append(que.popleft())

# 6. 문제의 출력 형식에 맞게 정답을 출력합니다.
print('<',end= '')
for i in range(0, len(ans)-1):
    print(ans[i],end=', ')
print(ans[-1],end='>')
