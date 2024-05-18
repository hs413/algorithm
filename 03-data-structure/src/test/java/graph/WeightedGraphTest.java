package graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class WeightedGraphTest {
    WeightedGraph g;

    @BeforeEach
    public void before() {
        g = new WeightedGraph();
    }

    @Test
    public void test() {
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");

        g.addEdge("A", "B", 10);
        g.addEdge("A", "C", 20);

        assertThat(g.adjacencyList.get("A").get(0).vertex).isEqualTo("B");
        assertThat(g.adjacencyList.get("A").get(0).weight).isEqualTo(10);

        assertThat(g.adjacencyList.get("B").get(0).vertex).isEqualTo("A");
        assertThat(g.adjacencyList.get("B").get(0).weight).isEqualTo(10);

        assertThat(g.adjacencyList.get("A").get(1).vertex).isEqualTo("C");
        assertThat(g.adjacencyList.get("A").get(1).weight).isEqualTo(20);

        assertThat(g.adjacencyList.get("C").get(0).vertex).isEqualTo("A");
        assertThat(g.adjacencyList.get("C").get(0).weight).isEqualTo(20);
    }
}