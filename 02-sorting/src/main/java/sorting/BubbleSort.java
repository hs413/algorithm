package sorting;

/**
 * 버블 정렬 O(n^2)
 * 잘 사용되지 않음
 * 큰 숫자가 하나씩 뒤로 이동
 * */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        // 루프의 마지막 항목은 정렬된 값이기 때문에 항목을 하나씩 줄여 나간다
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 개선 버전
     * 데이터가 한번도 변경되지 않으면 이미 정렬이 완료된 상태이므로 바로 종료한다.
     * if (noSwaps = true) break;
     * */
    public static void bubbleSort2(int[] arr) {
        boolean noSwaps;
        for (int i = arr.length; i > 0; i--) {
            noSwaps = true;
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    noSwaps = false;
                }
            }

            if (noSwaps) break;
        }
    }
}
