# 문제 해결 접근법

다음과 같이 단계별로 진행
1. 문제 이해
2. 구체적 예시
3. 세부 분석
4. 문제 해결 또는 단순화
5. 재검토 및 리팩터

## 1단계 - 문제 이해
1. 문제를 자신의 방식으로 다시 설명할 수 있는지
2. 문제가 어떤 입력을 받게 되는지
3. 문제가 어떤 출력을 내야 하는지
4. 문제 해결에 필요한 충분한 정보가 주어졌는지
5. 변수명을 어떻게 지정할지

```
예시)
문제 : 두 숫자가 주어졌을 때 합을 반환하는 함수를 작성해라

1. 문제를 자신의 방식으로 다시 설명할 수 있는지
 -> 두 개의 숫자를 입력으로 받아 더한 값을 출력(반환)한다.   
 
2. 문제가 어떤 입력을 받게 되는지
 -> 엄청 큰 숫자를 받게 되는 경우?
 -> 정수(int) or 소수(float) or 문자열(String)? 
 
3. 문제가 어떤 출력을 내야 하는지
 -> 정수, 소수, 문자열?
 
4. 문제 해결에 필요한 충분한 정보가 주어졌는지
 -> 숫자가 하나만 입력되면?
 
5. 변수명을 어떻게 지정할지 
 -> 무엇이 중요한지 생각해보기
```

## 2단계 구체적 예시 작성
- 예시는 문제 이해에 도움이 된다.
- 예시는 온정성 검사를 제공
  - 구현한 작업에 대한 테스트 가능
  - 더 많은 정보를 습득할 수 있다.

###  구체젹 예시 작성 단계
- 처음에는 간단한 예시를 만들어 시작
- 점점 어려운 예시를 만들면서 진행
- 입력 값이 빈 값(empty input)인 경우도 고려
- 입력 값이 유효하지 않은 경우도 고려
```
예시)
문제 : 문자열이 주어졌을 때 각각의 문자 수를 반환하는 함수 작성

-- 간단한 예시 --
charCount("aaaa") // {a: 4} // 객체가 반환 되어야 한다.
charCount("hello") // {h:1, e: 1, l: 2, o: 1}

// 전달되지 않은 문자의 포함 여부 확인 
// 이 경우 문제 해결이 더 쉽다
charCount("aaaa") // {a: 4, b: 0, c: 0} // 전달되지 않은 문자 포함

-- 복잡한 예시 --
charCount("Hello 12351 !! ODC")
// 공백, 대소문자, 숫자, 기타문자의 경우 어떻게 처리할 것인가

-- 빈 값 또는 유효하지 않은 입력 예시 --
charCount("")
charCount(null)
```

## 3단계 세부 분석
- 문제 해결을 위한 단계를 명확하게 작성해본다.
  - 아주 세세하게 작성하지 않아도 됨
  - 해결책의 기본 구성 요소만 작성

```
예시)
문제 : 문자열이 주어졌을 때 각각의 문자 수를 반환하는 함수 작성

1. 반환할 객체를 만든다
    
2. 루프를 사용해 문자열의 문자를 하나씩 조회한다.
    - 객체의 key 값으로 해당 하는 영/숫자가
        - 있으면 value 값을 1 증가 시킨다.
        - 없으면 문자를 key 등록하고 value 값을 1로 설정한다.
    - 문자가 영/숫자가 아닌경우 아무일도 하지 않는다.
    
3. 객체를 반환한다.
```

## 4단계 문제 해결 또는 단순화

문제를 바로 해결할 수 없으면 단순화하여 해결한다

- 시간이 많이 소요되는 부분은 우선 넘어가고 나중에 다시 확인해본다

### 단순화
- 단순한 해결책을 먼저 작성 후 가능하다면 어려운 부분을 통합

**해당 섹션의 예제는 [example/src/main/java/algorithm/SolvingApproach.java](example/src/main/java/algorithm/SolvingApproach.java) 에 작
성**

## 5단계 재검토 및 리팩터링

문제 해결 후 작성한 해결법에서 개선 가능한지 확인하는 것이 좋다

### 리팩터링 체크리스트
- 다른 해결 방법이 있는지
- 쉽게 이해할 수 있는지
- 다른 문제에도 적용할 수 있는지
- 성능을 향상시킬 수 있는지
- 다른 사람들의 해결 방법 참고
