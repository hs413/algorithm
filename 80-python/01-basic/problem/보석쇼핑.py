## 투포인터
# 같은 방향
# 움직이는 조건
#  r: 종류가 모자를 때
#  l: 종류가 다 있을 때
# 종료 r의 범위를 벗어날 때

from collections import defaultdict

def solution(gems):
    size = len(set(gems))
    answer = [1, len(gems)]

    # 투포인터 세팅
    l = r = 0
    gemInfo = defaultdict(int)
    gemInfo[gems[0]] += 1

    # 포인터 이동
    while r < len(gems):

    # 종류가 다 있는 경우
        if len(gemInfo) == size:
            if r - 1 < answer[1] - answer[0]:
                answer = [l + 1, r + 1]

            gemInfo[gems[l]] -= 1
            if gemInfo[gems[l]] == 0:
                del gemInfo[gems[l]]
            l += 1

    # 종류가 부족한 경우
        else:
            r += 1

            if r == len(gems):
                break

            gemInfo[gems[r]] += 1

    return answer
