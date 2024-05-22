package sort;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;
import static sort.MergeSort.merge;

class MergeSortTest {
    @Test
    public void mergeTest() {
        assertThat(merge(new Integer[]{1, 3, 4, 5}, new Integer[]{2, 4, 6, 8}))
                .containsSequence(1, 2, 3, 4, 4, 5, 6, 8);

        assertThat(merge(new Integer[]{-2, -1, 0, 4, 5, 6}, new Integer[]{-3, -2, -1, 2, 3, 5, 7, 8}))
                .containsSequence(-3, -2, -2, -1, -1, 0, 2, 3, 4, 5, 5, 6, 7, 8);

        assertThat(merge(new Integer[]{3, 4, 5}, new Integer[]{1, 2}))
                .containsSequence(1, 2, 3, 4, 5);

        assertThat(merge(
                new String[]{"Bob", "Ethel", "Christine"},
                new String[]{"M", "Colt", "Allison", "SuperLongNameOMG"},
                Comparator.comparingInt(String::length)))
                .containsSequence("M", "Bob", "Colt", "Ethel", "Allison", "Christine", "SuperLongNameOMG");

    }

}