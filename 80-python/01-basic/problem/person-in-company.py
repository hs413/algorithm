import sys
input = sys.stdin.readline

N = int(input())
set = set()

for _ in range(N):
    name, state = input().rstrip.split()

    if state == 'enter':
        set.add(name)
    else:
        set.discard(name)

for name in sorted(set, reverse=True):
    print(name)