package sorting;

/**
 * 선택 정렬 O(n^2)
 *  - 최소값을 찾은 다음 루프의 첫 번째 항목과 위치를 바꾼다.
 * */
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lowest = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowest]) {
                    lowest = j;
                }
            }

            if (i != lowest) {
                int temp = arr[i];
                arr[i] = arr[lowest];
                arr[lowest] = temp;
            }
        }
    }


}
