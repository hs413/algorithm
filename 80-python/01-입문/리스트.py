gems = [3, 3, 1, 2, 3, 2, 2, 3, 3, 1]


for gem in gems:
    if gem == 1:
        print(True)
        break
    
## 집계
dic = {}

for gem in gems:
    dic[gem] = dic.get(gem, 0) + 1

print(dic)   

gems_info = {}

for gem in gems:
    # 키 있는지 검사한다
    if gem in gems_info: gems_info[gem]+=1
    else: gems_info[gem] = 1

for k, v in gems_info.items():
    print(k, '은 ', v, '개')

## list comprehension
nums = []
for num in range(5):
    nums.append(num)

print(nums)

nums = [num for num in range(5)]

print(nums)

nums = [num for num in range(5) if num % 2 == 0]

print(nums)

## 1 ~ 100 까지 들어있는 리스트
nums = []

for num in range(1, 101):
    nums.append(num)
#print(nums)

## list slicing
nums = [3, 5, 1, 4, 2]

## 리스트의 일부를 복사(새로운 객체 생성)
sliced_num = nums[2:4]
print(nums, sliced_num)
# [3, 5, 1, 4, 2] [1, 4]

## 리스트의 일부를 수정
nums[2:4] = [1, 2, 3, 4, 5] 
# 2번 인덱스부터 3번 인덱스까지를 [1, 2, 3, 4, 5]로 수정
print(nums)
# [3, 5, 1, 2, 3, 4, 5, 2]


nums = [3, 5, 1, 4, 2]

## copy
copied_nums = nums[:]
print(copied_nums)
# [3, 5, 1, 4, 2]


## reverse
reversed_nums = nums[::-1]
print(reversed_nums)
# [2, 4, 1, 5, 3]

## append
nums = [3, 5, 1, 4, 2]
nums.append(6)
print(nums) # [3, 5, 1, 4, 2, 6]

## pop
nums = [3, 5, 1, 4, 2]

num = nums.pop(3)
print(nums, num)
# [3, 5, 1, 2] 4

print(nums.pop())
# 2

## sort
nums = [3, 5, 1, 4, 2]

nums.sort()
print(nums)
# [1, 2, 3, 4, 5]

nums.sort(reverse=True)
print(nums)
# [5, 4, 3, 2, 1]

nums.sort(key = lambda x: -x)
print(nums)
# [5, 4, 3, 2, 1]

## count
nums = [3, 5, 1, 4, 2]
print(nums.count(5)) # 2

## index
nums = [3, 5, 1, 4, 2]
print(nums.index(1)) # 2
# print(nums.index(9)) # ValueError

## insert
nums = [3, 5, 1, 4, 2]
nums.insert(1, 9) # 1번 인덱스 자리에 9 추가
print(nums)
# [3, 9, 5, 1, 4, 2]

## extend
nums = [3, 5, 1, 4, 2]
nums.extend([7, 6, 8])
print(nums)
# [3, 5, 1, 4, 2, 7, 6, 8]

nums = [3, 5, 1, 4, 2]
nums += [7, 6, 8]
print(nums)
# [3, 5, 1, 4, 2, 7, 6, 8]

