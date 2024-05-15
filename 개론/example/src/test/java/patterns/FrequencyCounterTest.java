package patterns;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static algorithm.patterns.FrequencyCounter.same;

public class FrequencyCounterTest {
    @Test
    @DisplayName("FrequencyCounter 기본 예제 테스트")
    public void basicTest() {
        List<Integer> arr1 = List.of(1,2,3);
        List<Integer> arr2 = List.of(1,4,9);
        boolean result = same(arr1, arr2);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void validAnagramTest() {






    }
}
