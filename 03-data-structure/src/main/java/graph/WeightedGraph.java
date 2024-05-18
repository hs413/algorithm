package graph;

import java.util.*;

/**
 * Dijkstra 알고리즘을 위한 가중치 그래프
 * 정점, 간선 삭제는 구현하지 않음
 * */
public class WeightedGraph {
    Map<String, List<Node>> adjacencyList = new HashMap<>();

    public void addVertex(String vertex) {
        List<Node> list = this.adjacencyList
                .getOrDefault(vertex, new ArrayList<>());

        this.adjacencyList.put(vertex, list);
    }

    public void addEdge(String v1, String v2, Integer weight) {
        if (!adjacencyList.containsKey(v1)) addVertex(v1);
        if (!adjacencyList.containsKey(v2)) addVertex(v2);

        Node v1Node = new Node(v1, weight);
        Node v2Node = new Node(v2, weight);

        List<Node> v1List = adjacencyList.get(v1);
        v1List.add(v2Node);
        adjacencyList.put(v1, v1List);

        List<Node> v2List = adjacencyList.get(v2);
        v2List.add(v1Node);
        adjacencyList.put(v2, v2List);
    }

    static class Node {
        String vertex;
        Integer weight;

        public Node(String vertex, Integer weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
}
