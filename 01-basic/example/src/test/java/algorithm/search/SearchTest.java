package algorithm.search;

import org.junit.jupiter.api.Test;

import static algorithm.search.Search.*;
import static org.assertj.core.api.Assertions.*;


class SearchTest {
    @Test
    public void linearSearchTest() {
        assertThat(linearSearch(new int[] {10, 15, 20, 25, 30}, 15))
                .isEqualTo(1); // 1
        assertThat(linearSearch(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, 4))
                .isEqualTo(5); // 5
        assertThat(linearSearch(new int[] {100}, 100))
                .isEqualTo(0);
        assertThat(linearSearch(new int[] {1,2,3,4,5}, 6))
                .isEqualTo(-1);
        assertThat(linearSearch(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, 10))
                .isEqualTo(-1);
        assertThat(linearSearch(new int[] {100}, 200))
                .isEqualTo(-1);
    }

    @Test
    public void binarySearchTest() {
        assertThat(binarySearch(new int []{1,2,3,4,5},2))
                .isEqualTo(1);

        assertThat(binarySearch(new int []{1,2,3,4,5},3))
                .isEqualTo(2);

        assertThat(binarySearch(new int []{1,2,3,4,5},5))
                .isEqualTo(4);

        assertThat(binarySearch(new int []{1,2,3,4,5},6))
                .isEqualTo(-1);

        assertThat(binarySearch(new int []{
                5, 6, 10, 13, 14, 18, 30, 34, 35, 37,
                40, 44, 64, 79, 84, 86, 95, 96, 98, 99
        }, 10)).isEqualTo(2);

        assertThat(binarySearch(new int []{
                5, 6, 10, 13, 14, 18, 30, 34, 35, 37,
                40, 44, 64, 79, 84, 86, 95, 96, 98, 99
        },  95)).isEqualTo(16);
        assertThat(binarySearch(new int []{
                5, 6, 10, 13, 14, 18, 30, 34, 35, 37,
                40, 44, 64, 79, 84, 86, 95, 96, 98, 99
        },  100)).isEqualTo(-1);
    }
}