# 선형

## [단일 연결 리스트](../src/main/java/linear/SinglyLinkedList.java) - [Test](../src/test/java/linear/SinglyLinkedListTest.java)
- 인덱스가 없음
  - 순차적으로 데이터에 접근
  - 랜덤 엑세스 불가능
- 삽입과 삭제가 용이하다

### 시간 복잡도

- 삽입 - O(1)
- 삭제 - O(1) or O(n)
- 검색 - O(n)
- 조회 - O(n)

## [이중 연결 리스트](../src/main/java/linear/DoublyLinkedList.java) - [Test](../src/test/java/linear/DoublyLinkedListTest.java)

- 단일 연결 리스트에서 이전 노드를 가리키는 포인터가 추가된 연결 리스트
- 포인터가 늘어나기 때문에 메모리가 더 많이 사용된다.

### 시간 복잡도

- 삽입 - O(1)
- 삭제 - O(1)
- 검색 - O(n)
- 조회 - O(n)
- 검색은 n / 2로 찾을 수 있지만 O(n)으로 표기한다

## 스택 & 큐
- 스택 : LIFO
- 큐 : FIFO
- 따로 구현하진 않음

### 시간 복잡도

- 삽입 - O(1)
- 삭제 - O(1)
- 검색 - O(n)
- 조회 - O(n)