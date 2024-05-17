package graph;

import java.util.*;

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

    public List<String> dfsIterative(Graph g, String vertex) {
        Stack<String> stack = new Stack<>();
        Map<String, Boolean> visited = new HashMap<>();
        List<String> result = new ArrayList<>();

        stack.push(vertex);
        visited.put(vertex, true);

        while (!stack.isEmpty()) {
            String currentVertex = stack.pop();
            result.add(currentVertex);

            for (String s : g.adjacencyList.get(currentVertex)) {
                if (visited.getOrDefault(s, false)) continue;

                visited.put(s, true);
                stack.push(s);
            }
        }

        return result;
    }

    public List<String> bfs(Graph g, String vertex) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(vertex);
        queue.add(vertex);

        while(!queue.isEmpty()) {
            String currentVertex = queue.poll();
            result.add(currentVertex);

            for (String s : g.adjacencyList.get(currentVertex)) {
                if (visited.contains(s)) continue;

                visited.add(s);
                queue.add(s);
            }
        }


        return result;
    }

}
