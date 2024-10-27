import sys
input = sys.stdin.readline

N = int(input())
words = set([input().rstrip() for _ in range(N)])

sortedWords = sorted(words, key=lambda x: (len(x), x))

for word in sortedWords:
    print(word)

