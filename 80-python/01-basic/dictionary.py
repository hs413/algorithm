import sys
input = sys.stdin.readline

## if 문을 사용
# N = int(input())
# dic = { }

# for _ in range(N):
#     bookName = input().rstrip()

#     if bookName not in dic:
#         dic[bookName] = 1
#     else:
#         dic[bookName] += 1

# print(dic)

## defaultdict tkdyd
# from collections import defaultdict
# N = int(input())
# dic = defaultdict(int)

# for _ in range(N):
#     name = input().rstrip()
#     dic[name] += 1 

# print(dic)

## Counter
from collections import Counter
N = int(input())
list = [input().rstrip() for _ in range(N)]
list = Counter(list)
# list = dict(Counter(list)) # 딕셔너리로 만들고 싶은 경우

print(list)

# 5
# top
# top
# top
# top
# kimtop

# sort 함수 
# sorted 함수 사용해보기