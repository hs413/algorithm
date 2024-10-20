# N개의 수로 된 수열 A[1], A[2], …, A[N] 이 있다. 
# 이 수열의 i번째 수부터 j번째 수까지의 합 
# A[i] + A[i+1] + … + A[j-1] + A[j]가 M이 되는 경우의 수를 구하는 프로그램을 작성하시오.

# 첫째 줄에 N(1 ≤ N ≤ 10,000), M(1 ≤ M ≤ 300,000,000)이 주어진다.
# 다음 줄에는 A[1], A[2], …, A[N]이 공백으로 분리되어 주어진다. 각각의 A[x]는 30,000을 넘지 않는 자연수이다.

# 4 2
# 1 1 1 1

# 3

# 10 5
# 1 2 3 4 2 5 3 1 1 2

# 3

import sys
input = sys.stdin.readline

N, M = map(int, input().split())
nums = list(map(int, input().split()))

s = e = 0
tmp = 0
result = 0

while True:
    if tmp < M:
        if e >= N:
            break
        else:
            tmp += nums[e]
            e += 1
    elif tmp > M:
        tmp -= nums[s]
        s += 1
    else:
        result += 1
        tmp -= nums[s]
        s += 1

print(result)

