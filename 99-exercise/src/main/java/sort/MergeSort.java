package sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Method: merge
 * Description: 두 개의 배열을 정렬하여 병합하는 메서드
 * Input
 * - 배열 2개
 * Output
 * - 정렬된 배열
 * 제약조건
 * - 시간 및 공간 복잡도 O(n + m)
 * - 전달된 매개변수 수정X
 * - 이전과 마찬가지로 이 함수는 기본적으로 숫자를 오름차순으로 정렬
 * - 세 번째 인수로 비교 함수를 전달하면 해당 비교 함수를 사용
 * - helper를 사용하여 정렬을 구현할 것이므로 helper자체는 정렬에 의존해서는 안됨
 * Ex)
 * - 숫자
 * - arr1 = [1,3,4,5];
 * - arr2 = [2,4,6,8];
 * - merge(arr1,arr2) // [1,2,3,4,4,5,6,8]
 * <p>
 * - 문자열
 * - names = ["Bob", "Ethel", "Christine"]
 * - otherNames = ["M", "Colt", "Allison", "SuperLongNameOMG"]
 * - Comparator(str1, str2) {
 * return str1.length - str2.length;
 * }
 * merge(names, otherNames, Comparator);
 * // ["M", "Bob", "Colt", "Ethel", "Allison", "Christine", "SuperLongNameOMG"]
 */
public class MergeSort {

    public static Integer[] merge(Integer[] arr1, Integer[] arr2) {
        Integer[] result = new Integer[arr1.length + arr2.length];
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[i + j] = arr1[i];
                i++;
            } else {
                result[i + j] = arr2[j];
                j++;
            }
        }

        while (i < arr1.length) {
            result[i + j] = arr1[i];
            i++;
        }

        while (j < arr2.length) {
            result[i + j] = arr2[j];
            j++;
        }

        return result;
    }

    public static List<String> merge(String[] arr1, String[] arr2, Comparator<String> comparator) {
        List<String> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            String str1 = arr1[i];
            String str2 = arr2[j];

            if (comparator.compare(str1, str2) < 0) {
                list.add(str1);
                i++;
            } else {
                list.add(str2);
                j++;
            }
        }

        while (i < arr1.length) {
            list.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            list.add(arr2[j]);
            j++;
        }

        return list;
    }

    public static Integer[] sort(Integer[] arr) {
        int length = arr.length;
        if (length <= 1) return arr;

        int middle = length / 2;

        Integer[] arr1 = new Integer[middle];
        Integer[] arr2 = new Integer[length - middle];

        for (int i = 0; i < middle; i++) {
            arr1[i] = arr[i];
        }

        for (int j = 0, i = middle; i < length; j++, i++) {
            arr2[j] = arr[i];
        }

        return merge(sort(arr1), sort(arr2));
    }
}
