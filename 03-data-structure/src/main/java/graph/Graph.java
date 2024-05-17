package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    Map<String, List<String>> adjacencyList = new HashMap<>();

    public void addVertex(String vertex) {
        List<String> list = this.adjacencyList
                .getOrDefault(vertex, new ArrayList<>());

        this.adjacencyList.put(vertex, list);
    }

    public void addEdge(String v1, String v2) {
        if (!adjacencyList.containsKey(v1)) addVertex(v1);
        if (!adjacencyList.containsKey(v2)) addVertex(v2);

        List<String> v1List = adjacencyList.get(v1);
        v1List.add(v2);
        adjacencyList.put(v1, v1List);

        List<String> v2List = adjacencyList.get(v2);
        v2List.add(v1);
        adjacencyList.put(v2, v2List);

    }

    public void removeEdge(String v1, String v2) {
        adjacencyList.get(v1).removeIf(v -> v.equals(v2));
        adjacencyList.get(v2).removeIf(v -> v.equals(v1));
    }

    public void removeVertex(String vertex) {
        adjacencyList.remove(vertex);
        for (List<String> list : adjacencyList.values()) {
            // removeEdge()를 사용하면 되지만 에러 처리를 제대로 구현하지 않아 아래와 같이 구현
            list.removeIf(v -> v.equals(vertex));
        }
    }
}
