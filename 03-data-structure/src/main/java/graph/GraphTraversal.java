package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphTraversal {

    public List<String> dfsRecursive(Graph g, String vertex) {
        Map<String, Boolean> visited = new HashMap<>();
        List<String> result = new ArrayList<>();
        dfsRecurs(g, vertex, result, visited);

        return result;
    }

    private void dfsRecurs(Graph g,
                           String vertex,
                           List<String> list,
                           Map<String, Boolean> visited) {

        boolean isVisited = visited.getOrDefault(vertex, false);
        if (isVisited) return;

        visited.put(vertex, true);
        list.add(vertex);

        for (String s : g.adjacencyList.get(vertex)) {
            dfsRecurs(g, s, list, visited);
        }
    }







}
