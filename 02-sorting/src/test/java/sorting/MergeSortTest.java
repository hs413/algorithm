package sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortTest {
    @Test
    public void mergeTest() {
        int[] arr1 = {5, 11, 22, 44};
        int[] arr2 = {2, 5, 6, 33, 133};
        int[] arr = MergeSort.merge(arr1, arr2);

        assertThat(arr).containsSequence(2,5,5,6,11,22,33,44,133);
    }

    @Test
    public void mergeSortTest() {
        int[] arr = {44,22,11,5,2,6,133,5,33};
        int[] result = MergeSort.mergeSort(arr);

        assertThat(result).containsSequence(2,5,5,6,11,22,33,44,133);
    }
}