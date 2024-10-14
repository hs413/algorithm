## 회문 (palindrome)

# python
word = input('단어 입력: ')
if word == word[:: -1]:
    print('회문')
else:
    print('No')

# two pointer
left = 0 
right = len(word) - 1

isPalindrome = True
while left < right:
    if word[left] == word[right]:
        left += 1
        right -= 1
        continue
    else:
        isPalindrome = False
        break

print(isPalindrome)

## split
email = 'alexalgoedu@gmail.com'
splitEmail = email.split('@')
print(splitEmail)

## join
word = "abcdefg"

joinWord = "-".join(word)
print(joinWord)
# a-b-c-d-e-f-g

numbers = ["1", "2", "3"]
joinWord = "".join(numbers)

print(joinWord)
#123

## strip