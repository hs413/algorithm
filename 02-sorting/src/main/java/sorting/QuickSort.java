package sorting;

/**
 * 퀵 정렬
 * - 임의의 피벗을 정한 뒤 피벗의 값 보다 작은 값들을 앞으로 이동한다.
 * - 이동이 완료되면 이동한 마지막 값과 피벗의 위치를 바꾼다.
 * - 해당 과정을 반복하며 정렬한다.
 * - 피벗은 중간 값을 선택하는게 좋다
 * - 정렬되어 있는 배열에 최소값을 피벗으로 선택할 경우 O(n^2)의 시간 복잡도를 갖는다
 * */
public class QuickSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static int pivot(int[] arr, int start, int end) {
        int pivot = arr[start];
        int swapIdx = start;

        for (int i = start + 1; i < arr.length; i++) {
            if (pivot > arr[i]) {
                swapIdx++;
                swap(arr, swapIdx, i);
            }
        }
        swap(arr, start, swapIdx);

        return swapIdx;
    }


    public static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(arr, left, right);
            // left
            quickSort(arr, left, pivotIndex - 1);

            // right
            quickSort(arr, pivotIndex + 1, right);
        }

        return arr;
    }
}
