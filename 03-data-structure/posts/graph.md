# 그래프
- 유한하고 정점과 간선으로 구성된 자료구조

## 기본 개념
- 정점 (Vertex) = 노드
- 간선 (Edge) = 노드를 연결하는 선
- 가중 / 비가중
- 방향 / 무방향
- 인접 행렬
  - 2차원 배열을 사용해 노드의 관계를 표현
  - 연결 = 1, 비연결 = 0으로 표현
  - 공간 복잡도가 높다
- 인접 리스트
  - 배열이나 해시 테이블을 사용해 노드의 관계를 표현
  - 공간 복잡도가 낮다

## [그래프 순회](../src/main/java/graph/GraphTraversal.java) - [Test](../src/test/java/graph/graphTraversalTest.java)
- 시작점을 정해야 한다
- 방문 했던 노드의 정보를 갖고 있어야 한다

- 깊이 우선 탐색
  - 재귀
  - 순환형
- 너비 우선 탐색

## [Dijkstra Algorithm](../src/main/java/graph/DijkstraAlgorithm.java) - [Test](../src/test/java/graph/DijkstraAlgorithmTest.java)
- 그래프의 두 정점 사이에 존재하는 최단 경로를 찾는 알고리즘
