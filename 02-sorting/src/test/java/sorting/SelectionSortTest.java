package sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SelectionSortTest {
    @Test
    public void selectionSortTest() {
        int[] arr = {44,22,11,5,2,6,133,5,33};
        SelectionSort.selectionSort(arr);

        assertThat(arr).containsSequence(2,5,5,6,11,22,33,44,133);

    }
}