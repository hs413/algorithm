T = int(input())

for tc in range(T):
    N = int(input())
    nums = map(int, input().split())

    # 최소값 최대값
    min = float("INF")
    max = -float("INF")

    for num in nums: 
        if min > num:
            min = num
        if max < num:
            max = num
        
    print(max - min)

 