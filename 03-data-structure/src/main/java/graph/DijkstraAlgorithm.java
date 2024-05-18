package graph;

import java.util.*;

import static graph.WeightedGraph.*;

/**
 * 그래프에서 두 정점 사이의 최단 거리를 찾기 위한 알고리즘
 * */
public class DijkstraAlgorithm {

    public List<String> dijkstra(WeightedGraph g, String start, String end) {
        /**
         * 노드간 소요 거리를 저장할 객체
         * 노드를 지날 때마다 거리를 더한다
         * */
        Map<String, Integer> distance = new HashMap<>();

        // 거리(가중치)가 짧은 노드를 먼저 실행하기 위한 우선순위 큐
        Queue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));

        // 해당 노드에 도달하기 위한 최단 거리의 직전 노드
        Map<String, String> previous = new HashMap<>();

        // 초기 세팅
        for (String key : g.adjacencyList.keySet()) {
            int distanceValue = Integer.MAX_VALUE;
            int weight = Integer.MAX_VALUE;

            if (key.equals(start)) {
                distanceValue = 0;
                weight = 0;
            }

            // 시작 노드를 제외한 노드들의 거리와 가중치를 최대 값으로 설정
            distance.put(key, distanceValue);
            Node newNode = new Node(key, weight);
            queue.add(newNode);
            previous.put(key, "");
        }
        // 반한 리스트
        List<String> path = new ArrayList<>();

        while(!queue.isEmpty()) {
            // 가중치가 가장 작은 노드(vertex)
            String smallest = queue.poll().vertex;

            // 가중치가 가장 작은 노드가 마지막 노드면
            if (smallest.equals(end)) {
                // node를 차례대로 출력하기 위해 값을 저장할 임시 stack
                Stack<String> stack = new Stack<>();

                /**
                 * 시작 노드의 previous 값은 빈 값이며
                 * previous의 마지막 노드부터 이전 노드(최단 거리 노드)를 차례대로 stack에 쌓는다
                 * */
                while(!smallest.isEmpty()) {
                    stack.add(smallest);
                    String temp = smallest;
                    smallest = previous.get(smallest);
                    previous.remove(temp);
                }

                // stack에 있는 노드를 path(반환 값)에 추가한다.
                while(!stack.isEmpty()) {
                    path.add(stack.pop());
                }
                return path;
            }

            // 가중치가 가장 짧은 노드가 있거나, 노드의 거리가 최대 값이 아닐 때
            if (!smallest.isEmpty() || distance.get(smallest) != Integer.MAX_VALUE) {
                for (Node nextNode : g.adjacencyList.get(smallest)) {
                    // distance 객체에 있는 거리 값과 가중치를 더한 값
                    int candidate = distance.get(smallest) + nextNode.weight;
                    String nextVertex = nextNode.vertex;

                    /**
                     * 저장된 다음 노드로의 거리 보다 거리 합(candidate)이 더 작으면 값을 업데이트 한다.
                     * 다음 노드로의 거리 최초 비교 값은 최대 값
                     * */
                    if (candidate < distance.get(nextVertex)) {
                        distance.put(nextVertex, candidate);
                        previous.put(nextVertex, smallest);
                        queue.add(new Node(nextVertex, candidate));
                    }
                }
            }

        }

        return path;
    }
}
