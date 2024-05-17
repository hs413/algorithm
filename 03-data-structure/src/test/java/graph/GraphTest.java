package graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GraphTest {
    Graph g;

    @BeforeEach
    public void before() {
        g = new Graph();
    }

    @Test
    public void test() {
        g.addVertex("d");
        assertThat(g.adjacencyList.get("d")).hasSize(0);

        g.addEdge("d", "f");
        assertThat(g.adjacencyList.get("d")).hasSize(1);

        g.addEdge("d", "ff");
        assertThat(g.adjacencyList.get("d")).hasSize(2);
        assertThat(g.adjacencyList.get("d").get(0)).isEqualTo("f");

//        g.removeEdge("d", "f");
//        assertThat(g.adjacencyList.get("d")).hasSize(1);

        g.removeVertex("d");
        assertThat(g.adjacencyList.get("f")).hasSize(0);
    }
}