def find_palindrome(N, M, matrix):
    for row in matrix:
        for start in range(N - M + 1):
            word = row[start:start + M]
            if word == word[::-1]: 
                return word

    for col in range(N):
        for start in range(N - M + 1):
            word = ''.join(matrix[row][col] for row in range(start, start + M))
            if word == word[::-1]:  
                return word

T = int(input())  

for tc in range(1, T + 1):
    N, M = map(int, input().split())  
    matrix = [input().strip() for _ in range(N)]

    result = find_palindrome(N, M, matrix)  
    print(f"#{tc} {result}")  