# 누적합 알고리즘
# 10 2
# 3 -2 -4 -9 0 3 7 13 8 -3

# 10 5
# 3 -2 -4 -9 0 3 7 13 8 -3

import sys
input = sys.stdin.readline

N, K = map(int, input().split())
nums = list(map(int, input().split()))

maxNum = -float('INF')

## slice
for i in range(N):
    tmp = sum(nums[i:i+K])
    maxNum = max(maxNum, tmp)

print(maxNum)

## 2중 반복문
for i in range(N - K):
    tmp = 0
    for j in range(i, i + K):
        tmp = nums[j]

    maxNum = max(maxNum, tmp)

print(maxNum)

## 슬라이딩 윈도우
maxNum = sum(nums[:K])

for i in range(K, N):
    tmp = sum(nums[i, i + K])
    maxNum = max(maxNum, tmp)
    
maxNum = sum(nums[:K])

## 누적합
from itertools import accumulate

nums = [3, 5, 1, 4, 2]
acc = [0] + list(accumulate(nums))
print(acc)