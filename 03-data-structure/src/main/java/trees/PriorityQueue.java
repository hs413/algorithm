package trees;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriorityQueue {
    public final List<Node> values = new ArrayList<>();

    public PriorityQueue() {
    }

    public int[] getValues() {
        return this.values.stream().mapToInt(v-> v.priority).toArray();
    }

    public void enqueue(Integer val, Integer priority) {
        Node newNode = new Node(val, priority);
        this.values.add(newNode);
        bubbleUp(val);
    }

    private void bubbleUp(Integer val) {
        int idx = this.values.size() - 1;
        Node current = this.values.get(idx);

        while(idx > 0) {
            int parentIdx = (idx - 1) / 2;
            Node parent = values.get(parentIdx);

            if (current.priority >= parent.priority) break;

            values.set(idx, parent);
            values.set(parentIdx, current);
            idx = parentIdx;
        }
    }

    public Integer dequeue() {
        Node min = this.values.get(0);
        int endIdx = this.values.size() - 1;
        Node end = this.values.get(endIdx);
        this.values.remove(endIdx);

        if (!this.values.isEmpty()) {
            this.values.set(0, end);
            this.sinkDown();
        }

        return min.value;
    }

    private void sinkDown() {
        int idx = 0;
        Node current = this.values.get(idx);
        int length = this.values.size();


        while(true) {
            int leftIdx = idx * 2 + 1;
            int rightIdx = idx * 2 + 2;
            Node left = null;
            Node right;
            Integer swap = null;

            if (leftIdx < length) {
                left = this.values.get(leftIdx);

                if (left.priority < current.priority) {
                    swap = leftIdx;
                }
            }

            if (rightIdx < length) {
                right = this.values.get(rightIdx);

                if ((swap == null && right.priority < current.priority) ||
                        (swap != null && right.priority < left.priority)) {
                    swap = rightIdx;
                }
            }

            if (swap == null) break;

            this.values.set(idx, this.values.get(swap));
            this.values.set(swap, current);
            idx = swap;
        }
    }

    static class Node {
        Integer value;
        Integer priority;
        LocalDateTime insertTime;

        public Node(Integer value, Integer priority) {
            this.value = value;
            this.priority = priority;
            this.insertTime = LocalDateTime.now();
        }
    }
}
