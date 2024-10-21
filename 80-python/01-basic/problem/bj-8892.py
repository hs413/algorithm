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
            elif isPalindrome(word2):
                print(word2)
                found = True
                break
        
        if found:
            break
    
    if not found:
        print(0)
