package basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static basic.DivideConquer.countZeroes;

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
}