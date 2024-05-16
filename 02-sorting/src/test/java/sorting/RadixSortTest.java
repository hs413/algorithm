package sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static sorting.RadixSort.*;

class RadixSortTest {
    @Test
    public void getDigitTest() {
        assertThat(getDigit(12345, 0)).isEqualTo(5);
        assertThat(getDigit(12345, 1)).isEqualTo(4);
        assertThat(getDigit(12345, 2)).isEqualTo(3);
        assertThat(getDigit(12345, 3)).isEqualTo(2);
        assertThat(getDigit(12345, 4)).isEqualTo(1);
        assertThat(getDigit(12345, 5)).isEqualTo(0);
    }

    @Test
    public void digitCountTest() {
        assertThat(digitCount(134)).isEqualTo(3);
        assertThat(digitCount(1342)).isEqualTo(4);
        assertThat(digitCount(13)).isEqualTo(2);
        assertThat(digitCount(1)).isEqualTo(1);
        assertThat(digitCount(13423423)).isEqualTo(8);
        assertThat(digitCount(135114)).isEqualTo(6);
    }

    @Test
    public void mostDigitsTest() {
        int[] arr = {44,22,11,5,2,6,133,5,332412,59198284};
        assertThat(mostDigits(arr)).isEqualTo(8);
    }


    @Test
    public void radixSortTest() {
        int[] arr = {4412,22225,1133,5,235,6,133,5,33,5522,6436};
        radixSort(arr);
        assertThat(arr).containsSequence(5, 5, 6, 33, 133, 235, 1133, 4412, 5522, 6436, 22225);
    }
}