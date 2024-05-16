package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 *  기수 정렬
 * */
public class RadixSort {

    /**
     * 자릿수에 해당하는 숫자 가져오는 함수
     * */
    public static int getDigit(int num, int i) {
        return (int) Math.floor(Math.abs(num) / Math.pow(10, i)) % 10;
    }

    /**
     * 자릿수 확인 함수
     * */
    public static int digitCount(int num) {
        if (num == 0) return 1;
        return (int) Math.floor(Math.log10(Math.abs(num))) + 1;
    }

    /**
     * 가장 큰 자릿수 확인 함수
     * */
    public static int mostDigits(int[] nums) {
        int maxDigits = 0;
        for (int i = 0 ; i < nums.length; i++) {
            maxDigits = Math.max(maxDigits, digitCount(nums[i]));
        }
        return maxDigits;
    }

    public static void radixSort(int[] arr) {
        int maxDigit = mostDigits(arr);
        List<List<Integer>> bucket = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            bucket.add(new ArrayList<>());
        }

        for (int i = 0; i < maxDigit; i++) {
            for (int j = 0; j < arr.length; j++) {
                int num = arr[j];
                int digit = getDigit(num, i);

                bucket.get(digit).add(num);
            }

            int idx = 0;
            for (List<Integer> list : bucket) {
                for (Integer num : list) {
                    arr[idx] = num;
                    idx++;
                }
                list.clear();
            }
        }
    }
}
