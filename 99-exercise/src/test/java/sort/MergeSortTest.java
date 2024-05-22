package sort;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;
import static sort.MergeSort.merge;
import static sort.MergeSort.sort;

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

    @Test
    public void sortTest() {
        assertThat(sort(new Integer[]{4, 20, 12, 10, 7, 9})).containsSequence(4, 7, 9, 10, 12, 20);
        assertThat(sort(new Integer[]{0, -10, 7, 4})).containsSequence(-10, 0, 4, 7);
        assertThat(sort(new Integer[]{1, 2, 3})).containsSequence(1, 2, 3);
        assertThat(sort(new Integer[]{})).containsSequence();

        assertThat(sort(new Integer[]{4, 3, 5, 3, 43, 232, 4, 34, 232, 32, 4, 35, 34, 23, 2, 453, 546, 75, 67, 4342, 32})).containsSequence(2, 3, 3, 4, 4, 4, 5, 23, 32, 32, 34, 34, 35, 43, 67, 75, 232, 232, 453, 546, 4342);
    }
}