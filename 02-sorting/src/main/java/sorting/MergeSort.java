package sorting;

import java.util.Arrays;

/**
 * 병합 정렬 O(n log n)
 * - 분할 정복 방식
 * - 배열을 1개의 요소만 가지는 작은 배열로 분할한 다음 배열의 요소를 비교하며 병합하는 방식
 * - 병합한 배열은 정렬되어 있는 상태
 * */
public class MergeSort {

    /**
     * 병합을 먼저 구현
     * input: 정렬된 배열 2개
     * */
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int idx = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr2[j] <= arr1[i]) {
                result[idx] = arr2[j];
                j++;
            } else {
                result[idx] = arr1[i];
                i++;
            }
            idx++;
        }

        while (i < arr1.length) {
            result[idx] = arr1[i];
            i++;
            idx++;
        }

        while (j < arr2.length) {
            result[idx] = arr2[j];
            j++;
            idx++;
        }

        return result;
    }


    /**
     * 병합 정렬
     * hint: 재귀 호출을 사용해 구현한다
     * */
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;

        int middle = arr.length / 2;

        int[] arr1 = Arrays.copyOfRange(arr,0, middle);
        int[] arr2 = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(mergeSort(arr1), mergeSort(arr2));
    }
}
