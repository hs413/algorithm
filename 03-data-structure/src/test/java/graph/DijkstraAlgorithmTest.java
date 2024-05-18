package graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
class DijkstraAlgorithmTest {
    DijkstraAlgorithm algorithm;
    WeightedGraph g;

    @BeforeEach
    public void before() {
        algorithm = new DijkstraAlgorithm();
        g = new WeightedGraph();

        this.g.addVertex("A");
        this.g.addVertex("B");
        this.g.addVertex("C");
        this.g.addVertex("D");
        this.g.addVertex("E");
        this.g.addVertex("F");

        this.g.addEdge("A", "B", 4);
        this.g.addEdge("A", "C", 2);
        this.g.addEdge("B", "E", 3);
        this.g.addEdge("C", "D", 2);
        this.g.addEdge("C", "F", 4);
        this.g.addEdge("D", "E", 3);
        this.g.addEdge("D", "F", 1);
        this.g.addEdge("E", "F", 1);
    }

    @Test
    public void test() {
        List<String> result = algorithm.dijkstra(g, "A", "E");
        assertThat(result).containsSequence("A", "C", "D", "F", "E");
    }
}