def binary_search(l, r, target, cnt):
    c = int((l + r) / 2)

    if target == c:
        return cnt
    elif target < c:
        r = c
        # return binary_search(l, c, target, cnt + 1)
    elif target > c:
        l = c
        # return binary_search(c, r, target, cnt + 1)

T = int(input())


for tc in range(1, T + 1):
    P, A, B = map(int, input().split())

    cntA = binary_search(1, P, A, 0)
    cntB = binary_search(1, P, B, 0)

    print(cntA)
    print(cntB)

    ans = 0 if cntA == cntB else 'A' if cntA < cntB else 'B'
    print(ans)


