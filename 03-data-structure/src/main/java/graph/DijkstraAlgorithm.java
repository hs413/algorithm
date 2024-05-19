package graph;

import java.util.*;

import static graph.WeightedGraph.Node;
import static java.lang.Integer.MAX_VALUE;

/**
 * Dijkstra Algorithm v2 (v1 리팩터링)
 * - 그래프에서 두 정점 사이의 최단 거리를 찾기 위한 알고리즘
 * */
public class DijkstraAlgorithm {
    /**
     * distance: 노드간 소요 거리를 저장할 객체, 노드를 지날 때마다 거리를 더함
     * queue: 거리(가중치)가 짧은 노드를 먼저 실행하기 위한 우선순위 큐
     * previous: 해당 노드에 도달하기 위한 최단 거리의 직전 노드를 가지는 객체
     * g: 거리를 탐색할 가중치 그래프
     * */
    public final Map<String, Integer> distance = new HashMap<>();
    public final Queue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
    public final Map<String, String> previous = new HashMap<>();
    public WeightedGraph g;

    public List<String> dijkstra(WeightedGraph g, String start, String end) {
        this.g = g;
        this.distance.put(start, 0);
        this.queue.add(new Node(start, 0));
        this.previous.put(start, "");
        this.init(start);
        this.pathSearch(end);
        return pathGenerate(end);
    }

    /**
     * 현재 까지 거리 + 다음 노드 까지 거리 < 기존 거리(초기값 = MAX_VALUE)
     * - distance 객체에 거리 수정
     * - previous 객체에 최단 거리 노드 수정
     * - (우선순위)queue에 노드 추가
     * */
    private void pathSearch(String end) {
        while(!this.queue.isEmpty()) {
            String node = queue.poll().vertex;

            if (node.equals(end)) return;

            if (distance.getOrDefault(node, MAX_VALUE) == MAX_VALUE) continue;

            for (Node nextNode : g.adjacencyList.get(node)) {
                // 현재 까지 거리 + 다음 노드 까지 거리
                int candidate = distance.get(node) + nextNode.weight;
                String nextVertex = nextNode.vertex;

                if (candidate < distance.get(nextVertex)) {
                    distance.put(nextVertex, candidate);
                    previous.put(nextVertex, node);
                    queue.add(new Node(nextVertex, candidate));
                }
            }
        }
    }

    /**
     * previous 마지막 노드부터 최단 거리 노드를 차례대로 stack에 입력
     * stack을 사용해 path에 노드를 순서대로 입력할 수 있다.
     * */
    private List<String> pathGenerate(String smallest) {
        Stack<String> stack = new Stack<>();

        // 시작노드의 smallest는 빈 값이므로 시작노드에 도달하면 종료
        while(!smallest.isEmpty()) {
            stack.add(smallest);
            String temp = smallest;
            smallest = this.previous.get(smallest);
            this.previous.remove(temp);
        }

        List<String> path = new ArrayList<>();

        while(!stack.isEmpty()) {
            path.add(stack.pop());
        }

        return path;
    }

    /**
     * 초기값 세팅
     * - 시작 노드를 제외한 노드들의 거리와 가중치를 최대 값으로 설정
     * */
    private void init(String start) {
        for (String key : this.g.adjacencyList.keySet()) {
            if (key.equals(start)) continue;

            this.distance.put(key, MAX_VALUE);
            this.queue.add(new Node(key, MAX_VALUE));
            this.previous.put(key, "");
        }
    }
}
