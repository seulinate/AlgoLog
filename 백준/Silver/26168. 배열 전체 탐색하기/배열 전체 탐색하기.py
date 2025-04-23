import sys
# 1. 문제의 input을 받습니다.
n, m = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))

# 2. 이분탐색을 위해 배열을 정렬합니다.
arr.sort()

# 3. 유형 1에 대한 이분탐색을 구현합니다.
def command_1(k):
    low = 0
    high = n - 1
    result = n  # 만약 모든 값이 k보다 작다면 반환될 인덱스

    while low <= high:
        mid = (low + high) // 2
        if arr[mid] >= k:
            result = mid  # k 이상인 값이 나왔으니, result를 갱신
            high = mid - 1  # 더 왼쪽에도 k 이상인 값이 있을 수 있으니 계속 탐색
        else:
            low = mid + 1

    return n - result  # 전체 길이에서 result를 빼면 k 이상인 원소 개수

# 4. 유형 2에 대한 이분탐색을 구현합니다.
def command_2(k):
    low = 0
    high = n - 1
    result = n  # 만약 모든 값이 k보다 작다면 반환될 인덱스

    while low <= high:
        mid = (low + high) // 2
        if arr[mid] > k:
            result = mid  # k 이상인 값이 나왔으니, result를 갱신
            high = mid - 1  # 더 왼쪽에도 k 이상인 값이 있을 수 있으니 계속 탐색
        else:
            low = mid + 1

    return n - result  # 전체 길이에서 result를 빼면 k 이상인 원소 개수

# 5. 유형 3에 대한 이분탐색을 구현합니다.
def command_3(i, j):
    return command_1(i) - command_2(j)

# 6. 질의를 순차적으로 탐색하며 결과를 출력합니다.
for _ in range(m):
    cmd = list(map(int, sys.stdin.readline().split()))
    if cmd[0] == 1:
        print(command_1(cmd[1]))
    elif cmd[0] == 2:
        print(command_2(cmd[1]))
    elif cmd[0] == 3:
        print(command_3(cmd[1], cmd[2]))

