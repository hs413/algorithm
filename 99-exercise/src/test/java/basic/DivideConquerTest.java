package basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static basic.DivideConquer.countZeroes;
import static basic.DivideConquer.sortedFrequency;

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
}