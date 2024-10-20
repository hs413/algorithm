import sys
input = sys.stdin.readline

N = int(input())
result = set()


for _ in range(N):
    name, status  = input().rstrip().split()

    if status == 'enter':
        result.add(name)
    else:
        result.discard(name)


for name in sorted(result, reverse=True):
    print(name)

