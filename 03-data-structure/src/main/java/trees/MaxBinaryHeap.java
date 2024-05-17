package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 노드 인덱스 구하기
 * - 부모 노드 -> 자식 노드
 *   - 2n + 1 - 왼쪽
 *   - 2n + 2 - 오른쪽
 * - 자식 노드 -> 부모 노드
 *   - (n-1) / 2 (내림)
 *   */
public class MaxBinaryHeap {
    public final List<Integer> values = new ArrayList<>();

    public MaxBinaryHeap() {
    }

    public void addValues(Integer[] integers) {
        Collections.addAll(this.values, integers);
    }

    public void insert(Integer val) {
        this.values.add(val);
        bubbleUp(val);
    }

    private void bubbleUp(Integer val) {
        int idx = this.values.size() - 1;

        while(idx > 0) {
            int parentIdx = (idx - 1) / 2;
            int parentValue = values.get(parentIdx);

            if (val < parentValue) break;

            values.set(idx, parentValue);
            values.set(parentIdx, val);
            idx = parentIdx;
        }
    }

    public Integer extractMax() {
        if (this.values.isEmpty()) return null;
        int max = this.values.get(0);
        int endIdx = this.values.size() - 1;
        int end = this.values.get(endIdx);

        this.values.remove(endIdx);
        this.values.set(0, end);

        this.sinkDown();

        return max;
    }

    private void sinkDown() {
        int idx = 0;
        int current = this.values.get(idx);
        int length = this.values.size();


        while(true) {
            int leftIdx = idx * 2 + 1;
            int rightIdx = idx * 2 + 2;
            Integer left = 0;
            Integer right;
            Integer swap = null;

            if (leftIdx < length) {
                left = this.values.get(leftIdx);

                if (left > current) {
                    swap = leftIdx;
                }
            }

            if (rightIdx < length) {
                right = this.values.get(rightIdx);

                if ((swap == null && right > current) || (swap != null && right > left)) {
                    swap = rightIdx;
                }
            }

            if (swap == null) break;

            this.values.set(idx, this.values.get(swap));
            this.values.set(swap, current);
            idx = swap;
        }
    }
}
