# 달팽이의 크기 N은 1 이상 10 이하의 정수이다. (1 ≤ N ≤ 10)
# [입력]
# 가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
# 각 테스트 케이스에는 N이 주어진다.


# [출력]
# 각 줄은 '#t'로 시작하고, 다음 줄부터 빈칸을 사이에 두고 달팽이 숫자를 출력한다.
# (t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

# 입력
# 2    
# 3   
# 4     

# 출력
# #1
# 1 2 3
# 8 9 4
# 7 6 5
# #2
# 1 2 3 4
# 12 13 14 5
# 11 16 15 6
# 10 9 8 7

T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    
    matrix = [[0] * N for _ in range(N)]

    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]

    nd = {
        3: 1,
        1: 2,
        2: 0,
        0: 3
    }

    num = 1
    r, c = 1, 0
    d = 0

    while num <= N ** 2:
        nr, nc = r + dr[d], c + dc[d]
    
        if 0 <= nr < N and 0 <= nc < N and matrix[nr][nc] == 0:
            r, c = nr, nc
            matrix[r][c] = num
            num += 1
        else:
            d = nd[d]


    print(f'#{tc}')
    for row in matrix:
        print(*row)



