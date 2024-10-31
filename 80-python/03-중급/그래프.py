### 인접 행렬로 구조화
V = int(input())
E = int(input())

# 1. 빈판 만들기
# 정점 개수 V개에 맞추어 V * V 크기의 0으로 가득찬 2차원 리스트를 만든다.
adj_matrix = [[0] * V for _ in range(V)]

# 2. 간선 정보 입력받기
# s, e로 입력받아 s에서 e로 이동할 수 있음을 나타낸다.
for _ in range(E):
    s, e = map(int, input().split())
    adj_matrix[s][e] = 1

print(adj_matrix)
# 입력
# 7
# 7
# 0 1
# 1 2
# 0 4
# 4 1
# 4 5
# 3 6
# 6 5

# 출력
# [[0, 1, 0, 0, 1, 0, 0], 
#  [0, 0, 1, 0, 0, 0, 0], 
#  [0, 0, 0, 0, 0, 0, 0], 
#  [0, 0, 0, 0, 0, 0, 1], 
#  [0, 1, 0, 0, 0, 1, 0], 
#  [0, 0, 0, 0, 0, 0, 0], 
#  [0, 0, 0, 0, 0, 1, 0]]


### 인접 리스트로 구조화
V = int(input())
E = int(input())

# 1. 빈판 만들기
# 정점 개수 V개에 맞추어 V개의 빈 리스트가 들어있는 2차원 리스트를 제작한다.
adj_lst = [[] for _ in range(V)]

# 2. 간선 정보 입력받기
# s, e로 입력받아 s에서 e로 이동할 수 있음을 나타낸다.
for _ in range(E):
    s, e = map(int, input().split())
    adj_lst[s].append(e)

print(adj_lst)


# 입력
# 7
# 7
# 0 1
# 1 2
# 0 4
# 4 1
# 4 5
# 3 6
# 6 5

# 출력
# [[1, 4], [2], [], [6], [1, 5], [], [5]]

### 완전 탐색
# 1. 임의의 정점을 방문한다.
# 2. 방문한 정점은 다시 방문하지 않도록 기록지에 표시한다.
# 3. 해당 정점에서 갈 수 있는 모든 정점을 탐색한다(with 인접행렬, 인접리스트)
# 4. 탐색한 정점들을 방문 예정지에 담는다.
# 5. 방문 예정지에서 정점을 하나 뽑아서 방문한다.
# 위 과정을 반복한다.

### 깊이 우선 탐색 DFS 
# 방문 예정지로 스택을 사용

### 인접 행렬 + 스택
V, E = map(int, input().split())

# 그래프 구조화

# 1. 빈 판 만들기
adj_matrix = [[0]* (V+1) for _ in range(V+1)]

# 2. 간선정보 입력받기
for _ in range(E):
    s, e = map(int, input().split())
    adj_matrix[s][e] = 1
    adj_matrix[e][s] = 1

##################################################

# 세팅
stack = [1]                     # 방문예정지(스택)
visited = set()                 # 방문기록지(집합)
trail = []                      # 궤적을 담아줄 리스트

##################################################

while stack:
    cur = stack.pop()
    if cur not in visited:
        trail.append(cur)
    visited.add(cur)

    for nxt in range(V + 1):
        if adj_matrix[cur][nxt] and nxt not in visited:
            stack.append(nxt)
        
    print(trail)

### 인접 리스트 + 스택
V, E = map(int, input().split())

# 그래프 구조화

# 1. 빈 판 만들기
adj_lst = [[] for _ in range(V+1)]

# 2. 간선정보 입력받기
for _ in range(E):
    s, e = map(int, input().split())
    adj_lst[s].append(e)
    adj_lst[e].append(s)

##################################################

# 세팅
stack = [1]             # 방문예정지(스택)
visited = set()         # 방문기록지(집합)
trail = []              # 궤적을 담아줄 리스트

##################################################

while stack:                        # 스택이 빌 때까지
    cur = stack.pop()               # 방문과
    if cur not in visited:
        trail.append(cur)
    visited.add(cur)

    for nxt in adj_lst[cur]:        # 탐색 반복
        if nxt not in visited:
            stack.append(nxt)

## 입력
# 7 8
# 1 2
# 1 3
# 2 4
# 2 5
# 4 6
# 5 6
# 6 7
# 3 7

## 출력
# [1, 3, 7, 6, 5, 2, 4]