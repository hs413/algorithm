package patterns;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static patterns.SlidingWindow.*;

class SlidingWindowTest {
    @Test
    public void basicTest() {
        Integer result = maxSubArraySum(new int[] {1, 4, 3, 5, 5, 5, 9, 1}, 2);

        Assertions.assertThat(result).isEqualTo(14);

    }
}