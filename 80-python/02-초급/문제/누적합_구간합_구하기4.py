# 5 3
# 5 4 3 2 1
# 1 3
# 2 4
# 5 5

import sys
input = sys.stdin.readline

N, M = map(int, input().split())
nums = list(map(int, input().split()))

acc = [0]
tmp = 0    

for x in range(N):
    tmp += nums[x]
    acc.append(tmp)
    
for _ in range(M):
    i, j = map(int, input().split())
    print(acc[j] - acc[i - 1])




