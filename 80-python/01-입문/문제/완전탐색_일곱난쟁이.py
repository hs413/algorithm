# 아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 
# 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.

# 일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.

# 20
# 7         
# 23            
# 19            
# 10            
# 15            
# 25            
# 8         
# 13            

# 7
# 8
# 10
# 13
# 19
# 20
# 23

import sys
input = sys.stdin.readline

nums = [int(input()) for _ in range(9)] 
# nums = [20, 25, 8, 7, 23, 19, 10, 15, 13]
sum_num = sum(nums)

i = 0
j = 0
flag = False

for i in range(8):
    for j in range(i+1, 9):
        if sum_num - nums[i] - nums[j] == 100:
            flag = True
            break
    if flag:
        break

result = []

for k in range(9):
    if k != i and k != j:
        result.append(nums[k])

result.sort()

for num in result:
    print(num)

