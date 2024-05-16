# Big O

**알고리즘에서 수행되는 연산의 개수를 극단적으로 단순화하여 표기한 것**

### 필요성

- 코드(알고리즘)의 성능을 평가하기 위해 사용
- 코드를 분류하거나 비교 하는 기준

## 시간 복잡도

알고리즘의 수행 시간을 의미한다.

### 코드의 평가 대상

좋은 코드 여부를 평가할 때 일반적으로 시간(속도), 메모리, 가독성 3 가지의 항목을 평가 한다.

**일반적인 시간 비교의 문제점**

- 환경에 따라 측정 값이 달라짐
- 빠른 알고리즘에서는 측정 값이 정확하지 않을 수 있음

### Big O 표기법

- O(1) - 상수, 수행 시간이 항상 일정하다.
- O(n) - 선형, 수행 시간이 n의 수 만큼 선형적으로 증가한다.
- O(n^2) - 제곱, 수행 시간이 n^2 만큼 지수적으로 증가한다.

## 공간 복잡도

알고리즘이 사용하는 메모리 공간을 의미한다.

입력 데이터의 크기는 상관하지 않는다.

- O(1) - boolean, 숫자 등은 불변 공간이다.
- O(n) - 문자열, 객체 등은 n의 공간을 차지한다.

## [문제 해결 접근법](README2.md)

## 문제 해결 패턴

### [Frequency Counters](src/main/java/patterns/FrequencyCounter.java) - [Test](src/test/java/patterns/FrequencyCounterTest.java)

### [Multiple Pointer](src/main/java/patterns/MultiplePointer.java) - [Test](src/test/java/patterns/MultiplePointerTest.java)

### [Sliding Window](src/main/java/patterns/SlidingWindow.java) - [Test](src/test/java/patterns/SlidingWindowTest.java)

### [Divide And Conquer](src/main/java/patterns/DivideConquer.java)

## 재귀 / 검색
### [재귀](src/main/java/recursion/Recursion.java) - [Test](src/test/java/recursion/RecursionTest.java)

### [검색](src/main/java/search/Search.java) - [Test](src/test/java/search/searchTest.java)

