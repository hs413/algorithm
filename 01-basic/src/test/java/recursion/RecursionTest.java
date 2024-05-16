package recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static recursion.Recursion.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {
    @Test
    public void factorialTest() {
        assertThat(factorial(4)).isEqualTo(24);
        assertThat(factorial(5)).isEqualTo(120);
    }

    @Test
    public void powerTest() {
        assertThat(power(2, 0)).isEqualTo(1);
        assertThat(power(2, 2)).isEqualTo(4);
        assertThat(power(2, 4)).isEqualTo(16);
    }


// power(2,0) // 1
// power(2,2) // 4
// power(2,4) // 16
}