package dp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DynamicProgramingTest {

    @Test
    public void fib() {
        assertThat(DynamicPrograming.fib(4)).isEqualTo(3);
        assertThat(DynamicPrograming.fib(5)).isEqualTo(5);
        assertThat(DynamicPrograming.fib(6)).isEqualTo(8);
        assertThat(DynamicPrograming.fib(7)).isEqualTo(13);

        // 시간이 너무 오래 걸림
//        DynamicPrograming.fibMemoized(100);
    }

    @Test
    public void fibMemoized() {
        assertThat(DynamicPrograming.fibMemoized(4)).isEqualTo(3);
        assertThat(DynamicPrograming.fibMemoized(5)).isEqualTo(5);
        assertThat(DynamicPrograming.fibMemoized(6)).isEqualTo(8);
        assertThat(DynamicPrograming.fibMemoized(7)).isEqualTo(13);

        DynamicPrograming.fibMemoized(100);
        // 메모리 오류
//        DynamicPrograming.fibTabulated(10000000);
    }

    @Test
    public void fibTabulated() {
        assertThat(DynamicPrograming.fibTabulated(4)).isEqualTo(3);
        assertThat(DynamicPrograming.fibTabulated(5)).isEqualTo(5);
        assertThat(DynamicPrograming.fibTabulated(6)).isEqualTo(8);
        assertThat(DynamicPrograming.fibTabulated(7)).isEqualTo(13);

        DynamicPrograming.fibTabulated(10000000);
    }
}