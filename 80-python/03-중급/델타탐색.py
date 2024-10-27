matrix = [[3, 7, 9],
          [4, 2, 6],
          [8, 1, 5]]


r, c = 1, 1

dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]

nr, nc = r + dr[0], c + dc[0]
print(matrix[nr][nc])


nr, nc = r + dr[3], c + dc[3]
print(matrix[nr][nc])

for i in range(4):
    nr, nc = r + dr[i], c + dc[i]
    print(matrix[nr][nc], end=' ')

# 인덱스 에러 방지
print()
r, c = 0, 2

for i in range(4):
    nr, nc = r + dr[i], c + dc[i]

    if 0 <= nr < 3 and 0 <= nc < 3:     # 인덱스 유효성 검사
        print(matrix[nr][nc], end=' ')   