import sys
input = sys.stdin.readline

T = int(input())

# 처음 코드
# for tc in range(T):
#     x, str = input().rstrip().split()
#     x = int(x) - 1

#     result = []
#     for i in range(0, len(str)):
#         if i != x:
#             result.append(str[i])


#     print("".join(result))


# 개선 코드   
for tc in range(T):
    x, str = input().rstrip().split()
    x = int(x) - 1

    result = [str[i] for i in range(len(str)) if i !=x]

    print("".join(result))


    
# 첫째 줄에 테스트 케이스의 개수 T(1<=T<=1,000)가 주어진다.
#  각 테스트 케이스는 한 줄로 구성되어 있다. 첫 숫자는 창영이가 오타를 낸 위치이고, 두 번째 문자열은 창영이가 친 문자열이다.
#  문자열의 가장 첫 문자는 1번째 문자이고, 문자열의 길이는 80을 넘지 않고, 대문자로만 이루어져 있다. 
# 오타를 낸 위치는 문자열 길이보다 작거나 같다.

# 4
# 4 MISSPELL
# 1 PROGRAMMING
# 7 CONTEST
# 3 BALLOON