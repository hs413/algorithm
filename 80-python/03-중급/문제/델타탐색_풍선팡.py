T = int(input())

for tc in range(T):
    N, M = map(int,(input().split()))

    matrix = [list(map(int, input().split())) for _ in range(N)]
    print(matrix)   


    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]

    max_num = 0

    for r in range(N):
        for c in range(M):

            tmp = matrix[r][c]
            for i in range(4):
                nr, nc = r + dr[i], c + dc[i]
                if 0 <= nr < N and 0 <= nc < M:
                    tmp += matrix[nr][nc]

            max_num = max(max_num, tmp)

    print(f'#{tc} {max_num}')


