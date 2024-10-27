# 4 7
# 20 15 10 17

# 5 20
# 4 42 40 26 46

import sys
input = sys.stdin.readline

def getWood(trees, height):
    wood = 0
    for tree in trees:
        if tree > height:
            wood += tree - height

    return wood

N, M = map(int, input().split())
trees = list(map(int, input().split()))

l, r = 0, max(trees)
result = 0

while l <= r:
    mid = (l + r) // 2

    tmp = getWood(trees, mid)

    if tmp >= M:  
        result = mid
        l = mid + 1
    else:
        r = mid - 1

print(result)
