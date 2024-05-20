package basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static basic.DivideConquer.countZeroes;
import static basic.DivideConquer.sortedFrequency;
import static basic.DivideConquer.findRotatedIndex;

class DivideConquerTest {
    @Test
    public void countZeroesTest() {
        assertThat(countZeroes(new int[] { 1,1,1,1,0,0 })).isEqualTo(2);
        assertThat(countZeroes(new int[] { 1,0,0,0,0 })).isEqualTo(4);
        assertThat(countZeroes(new int[] { 0,0,0 })).isEqualTo(3);
        assertThat(countZeroes(new int[] { 1,1,1,1 })).isEqualTo(0);
        assertThat(countZeroes(new int[] { 1,1,1,1,1 })).isEqualTo(0);
        assertThat(countZeroes(new int[] { 1,1,1,1,1,0 })).isEqualTo(1);
        assertThat(countZeroes(new int[] { 1,1,0,0,0,0,0 })).isEqualTo(5);
        assertThat(countZeroes(new int[] { 1,1,1,1,1,1,1,0 })).isEqualTo(1);
    }

    @Test
    public void sortedFrequencyTest() {
        assertThat(sortedFrequency(new int[] {1,1,2,2,2,2,3},2)).isEqualTo(4);
        assertThat(sortedFrequency(new int[] {1,1,2,2,2,2,3},3)).isEqualTo(1);
        assertThat(sortedFrequency(new int[] {1,1,2,2,2,2,3},1)).isEqualTo(2);
        assertThat(sortedFrequency(new int[] {1,1,2,2,2,2,3},4)).isEqualTo(-1);
    }


    @Test
    public void findRotatedIndexTest() {
        assertThat(findRotatedIndex(new int[]{3,4,1,2},4)).isEqualTo(1);
        assertThat(findRotatedIndex(new int[]{6, 7, 8, 9, 1, 2, 3, 4}, 8)).isEqualTo(2);
        assertThat(findRotatedIndex(new int[]{6, 7, 8, 9, 1, 2, 3, 4}, 3)).isEqualTo(6);
        assertThat(findRotatedIndex(new int[]{37,44,66,102,10,22},14)).isEqualTo(-1);
        assertThat(findRotatedIndex(new int[]{6, 7, 8, 9, 1, 2, 3, 4}, 12)).isEqualTo(-1);
        assertThat(findRotatedIndex(new int[]{11,12,13,14,15,16,3,5,7,9}, 16)).isEqualTo(5);
        assertThat(findRotatedIndex(new int[]{11,12,13,0,1,2,3,5,7,9}, 0)).isEqualTo(3);
    }
}