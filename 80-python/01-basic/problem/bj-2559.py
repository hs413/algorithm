# 10 2
# 3 -2 -4 -9 0 3 7 13 8 -3

# 10 5
# 3 -2 -4 -9 0 3 7 13 8 -3

import sys
input = sys.stdin.readline

N, K = map(int, input().split())
nums = list(map(int, input().split()))

tmp = maxNum = sum(nums[:K])

for i in range(K, N):
    tmp = tmp - nums[i - K] + nums[i]
    maxNum = max(maxNum, tmp)

print(maxNum)