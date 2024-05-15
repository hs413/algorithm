package algorithm.patterns;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static algorithm.patterns.MultiplePointer.*;
import static org.assertj.core.api.Assertions.*;


class MultiplePointerTest {
    @Test
    @DisplayName("멀티 포인터 기본 테스트")
    public void basicTest() {
        List<Integer> list = sumZero(List.of(-3, -2, 1, 0, 1, 2, 3));

        assertThat(list.get(0)).isEqualTo(-3);
        assertThat(list.get(1)).isEqualTo(3);
    }

    @Test
    public void countUniqueValuesTest() {
        assertThat(countUniqueValues(List.of(1,1,1,1,1,2)))
                .isEqualTo(2); // 2

        assertThat(countUniqueValues(List.of(1,2,3,4,4,4,7,7,12,12,13)))
                .isEqualTo(7); // 7

        assertThat(countUniqueValues(List.of()))
                .isEqualTo(0); // 0

        assertThat(countUniqueValues(List.of(-2,-1,-1,0,1)))
                .isEqualTo(4); // 4
    }

}