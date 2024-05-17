package graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class graphTraversalTest {
    Graph g;
    GraphTraversal traversal;

    @BeforeEach
    public void before() {
        this.g = new Graph();
        this.traversal = new GraphTraversal();
        this.g.addVertex("A");
        this.g.addVertex("B");
        this.g.addVertex("C");
        this.g.addVertex("D");
        this.g.addVertex("E");
        this.g.addVertex("F");

        this.g.addEdge("A", "B");
        this.g.addEdge("A", "C");
        this.g.addEdge("B", "D");
        this.g.addEdge("C", "E");
        this.g.addEdge("D", "E");
        this.g.addEdge("D", "F");
        this.g.addEdge("E", "F");
    }

    @Test
    public void dfsRecursive() {
        /**
         * A -> B, C
         * B -> A, D
         * C -> A, E
         * D -> B, E, F
         * E -> C, D, F
         * F -> D, E
         * */
        List<String> result = traversal.dfsRecursive(g, "A");
        assertThat(result).containsSequence("A", "B", "D", "E", "C", "F");
    }

    @Test
    public void dfsIterative() {
        /**
         * A -> B, C
         * B -> A, D
         * C -> A, E
         * D -> B, E, F
         * E -> C, D, F
         * F -> D, E
         * */
        List<String> result = traversal.dfsIterative(g, "A");
        assertThat(result).containsSequence("A", "C", "E", "F", "D", "B");
//        assertThat(result).containsSequence("A", "B", "D", "E", "C", "F");
    }
}