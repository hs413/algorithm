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
    }
}