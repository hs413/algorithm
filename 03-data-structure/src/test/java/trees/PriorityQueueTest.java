package trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class PriorityQueueTest {
    PriorityQueue pQueue;

    @BeforeEach
    public void before() {
        this.pQueue = new PriorityQueue();
    }

    @Test
    public void enqueue() {
        this.pQueue.enqueue(1, 1);
        this.pQueue.enqueue(2, 4);
        this.pQueue.enqueue(5, 5);
        this.pQueue.enqueue(2, 2);
        this.pQueue.enqueue(2, 3);

        assertThat(this.pQueue.getValues()).containsSequence(1, 2, 5, 4, 3);
    }

    @Test
    public void dequeue() {
        this.pQueue.enqueue(1, 1);
        this.pQueue.enqueue(4, 4);
        this.pQueue.enqueue(5, 5);
        this.pQueue.enqueue(2, 2);
        this.pQueue.enqueue(3, 3);

        assertThat(this.pQueue.dequeue()).isEqualTo(1);
        assertThat(this.pQueue.dequeue()).isEqualTo(2);
        assertThat(this.pQueue.dequeue()).isEqualTo(3);
        assertThat(this.pQueue.dequeue()).isEqualTo(4);
        assertThat(this.pQueue.dequeue()).isEqualTo(5);
    }
}