package sorting;

/**
 * 삽입 정렬 O(n^2)
 * - 루프를 돌면서 각 요소를 순서에 맞는 위치에 삽입하여 정렬
 * - 루프가 실행된 부분은 정렬되어 있음
 * - 루프의 두 번째 요소부터 시작 -> 첫 번째 요소는 정렬된 것으로 간주
 * */
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentVal = arr[i];
            int j = i - 1;

            for (; j >= 0 && currentVal < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = currentVal;
        }
    }
}
