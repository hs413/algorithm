T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    nums = list(map(int, input().split()))

    # 최소값 최대값
    min = float("INF")
    max = -float("INF")

    for num in nums: 
        if min > num:
            min = num
        if max < num:
            max = num

    # 내장함수 이용
    answer = max(nums) - min(nums)
        
    print(f"#{tc} {max - min}")

 