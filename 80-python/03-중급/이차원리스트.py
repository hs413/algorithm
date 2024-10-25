### 2차원 개념

## 줄바꿈을 통해 더욱 행렬처럼 만들 수 있다.
matrix = [[3, 7, 9],
          [4, 2, 6],
          [8, 1, 5]] 

## 행우선순회
for r in range(3):
    for c in range(3):  
        print(matrix[r][c])

## 열우선순회
for c in range(3):
    for r in range(3):
        print(matrix[r][c])

## 빈 이차원리스트 제작
matrix = [[0] * 4 for _ in range(3)]
# matrix = [[0] * 4] * 3 <- 이렇게 하면 안됨


## 입력받기
# matrix = [list(map(int, input().split())) for _ in range(3)]
# print(matrix)

## 전치
matrix = [[3, 7, 9],
          [4, 2, 6],
          [8, 1, 5]]

transposed = [[0] * 3 for _ in range(3)]

for r in range(3):
    for c in range(3):
        if r == c:
            transposed[r][c] = matrix[r][c]
            continue

        transposed[c][r] = matrix[r][c]

print(transposed)


for r in range(3):
    for c in range(3):
        if c > r:
            matrix[r][c], matrix[c][r] = matrix[c][r], matrix[r][c]

print(matrix)

matrix = [[3, 7, 9],
          [4, 2, 6],
          [8, 1, 5]]

# zip을 통한 전치
transposed = list(map(list, zip(*matrix)))
print(transposed)

