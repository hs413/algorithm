import sys
input = sys.stdin.readline
from collections import Counter

N = int(input())
list = [input().rstrip() for _ in range(N)]
dic = dict(Counter(list)) # 딕셔너리로 만들고 싶은 경우

result = sorted(dic.items(), key=lambda x: (-x[1], x[0]))
print(result[0][0])