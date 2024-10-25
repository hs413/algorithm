# 2
# 5
# aaba
# ba
# ababa
# bbaa
# baaba
# 3
# abc
# bcd
# cde

import sys
input = sys.stdin.readline

def isPalindrome(word):
    l, r = 0, len(word) - 1

    while l < r:
        if word[l] != word[r]:
            return False
        l += 1
        r -= 1

    return True
    
T = int(input())
for _ in range(T):
    k = int(input())
    words = [input().rstrip() for _ in range(k)]
    found = False

    for i in range(k):
        for j in range(i + 1, k):
            word1 = words[i] + words[j]
            word2 = words[j] + words[i]

            if isPalindrome(word1):
                print(word1)
                found = True
                break
                # exit(0)
            elif isPalindrome(word2):
                print(word2)
                found = True
                break
                # exit(0)
        
        if found:
            break
    
    if not found:
        print(0)


## 순열
from itertools import permutations

T = int(input())

for _ in range(T):
    k = int(input())
    words = [input() for _ in range(k)]

    for w1, w2 in permutations(words, 2):
        p = w1 + w2

        if p == p[::-1]:
            print(p)
            break
    # 반복문이 정상 종료된 경우, break로 종료되지 않은 경우 실행
    else:
        print(0)