package patterns;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static patterns.FrequencyCounter.same;
import static patterns.FrequencyCounter.validAnagram;
import static org.assertj.core.api.Assertions.*;

public class FrequencyCounterTest {
    @Test
    @DisplayName("FrequencyCounter 기본 예제 테스트")
    public void basicTest() {
        List<Integer> arr1 = List.of(1,2,3);
        List<Integer> arr2 = List.of(1,4,9);
        boolean result = same(arr1, arr2);

        assertThat(result).isTrue();
    }

    @Test
    public void validAnagramTest() {
        assertThat(validAnagram("" ,"")).isTrue();
        assertThat(validAnagram("aaz","zza")).isFalse();
        assertThat(validAnagram("anagram","nagaram")).isTrue();
        assertThat(validAnagram("rat","car")).isFalse();
        assertThat(validAnagram("awesome","awesom")).isFalse();
        assertThat(validAnagram("amanaplanacanalpanama","acanalmanplanpamana")).isFalse();
        assertThat(validAnagram("qwerty","qeywrt")).isTrue();
        assertThat(validAnagram("texttwisttime","timetwisttext")).isTrue();
    }
}
