package trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxBinaryHeapTest {
    MaxBinaryHeap heap;

    @BeforeEach
    public void before() {
        this.heap = new MaxBinaryHeap();
    }

    @Test
    public void insert() {
        this.heap.addValues(new Integer[]{ 41, 39, 33, 18, 27, 12 });
        this.heap.insert(55);

        assertThat(this.heap.values).containsSequence(55, 39, 41, 18, 27, 12, 33);
    }

    @Test
    public void extractMax() {
        this.heap.addValues(new Integer[]{ 55, 39, 41, 18, 27, 12, 33 });
        this.heap.extractMax();

        assertThat(this.heap.values).containsSequence(41, 39, 33, 18, 27, 12);
    }
}