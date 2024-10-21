# 9
# 5 12 7 10 9 1 2 3 11
# 13

import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
x = int(input())

nums.sort()

l, r = 0, n - 1
result = 0

while l < r:
    tmp = nums[l] + nums[r]

    if tmp == x:
        result += 1
        l += 1  
        r -= 1
    elif tmp < x:
        l += 1  
    else:
        r -= 1  

print(result)
   
