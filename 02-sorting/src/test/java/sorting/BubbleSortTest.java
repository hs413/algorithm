package sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    public void bubbleSortTest() {
        int[] arr = {44,22,11,5,2,6,133,5,33};
        BubbleSort.bubbleSort(arr);

        assertThat(arr).containsSequence(2,5,5,6,11,22,33,44,133);

    }
}