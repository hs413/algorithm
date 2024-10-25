## 재귀

# def recursionFunc(depth):
#     if depth == 990:
#         return
    
#     print(f"안녕 난 {depth}번째 재귀함수야~")
#     recursionFunc(depth + 1)

# recursionFunc(1)


## 오버플로우 방지
# import sys
# sys.setrecursionlimit(10**9)


# def func:
    # 종료조건

    # .. before

    # 재귀

    # .. after

# def find(depth):
    
#     if depth == 3:
#         print("찾았다!!")
#         return

#     print(f"내려가는중.. 깊이: {depth}")

#     find(depth + 1)

#     print(depth)


## 메모이제이션
N = int(input())
memo = [0, 1]

for _ in range(N - 1):
    memo.append(memo(-1) + memo[-2])

print(memo(N))