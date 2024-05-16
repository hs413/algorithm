package search;

public class Search {

    /**
     * 선형 검색 O(n)
     * -------------------------
     * input: 배열, 값
     * 값이 배열 안에 있는 경우 인덱스를 반환
     * 값이 배열 안에 없는 경우 -1을 반환
     * */
    public static int linearSearch(int[] arr, int num) {
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] == num) return i;
        }
        return -1;
    }

    /**
     * 이진 탐색 O(log n)
     *  - 데이터의 순서가 있어야 하고 정렬 되어 있어야 한다.
     *  - 분할 정복 알고리즘을 사용한다.
     * --------------------------------
     * input: 정렬된 배열, 값
     * 포인터의 중간 값을 탐색
     * - 값이 작으면 좌측 포인터를 이동
     * - 값이 크면 우측 포인터를 이동
     * 값이 없는 경우 -1 반환
     * */
    public static int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;

        if (arr[left] == num) return left;
        if (arr[right] == num) return right;

        int middle = (right + left) / 2;

        while (arr[middle] != num && left <= right) {
            if (num < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

            middle = (right + left) / 2;
        }
        if (arr[middle] == num) return middle;
        return -1;
    }
}
