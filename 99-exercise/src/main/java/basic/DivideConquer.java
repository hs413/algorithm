package basic;

public class DivideConquer {

    /**
     * Method: countZeroes
     * Input
     *  - 1과 0으로 구성된 배열
     *  - 1은 0보다 앞에 배치 되어 있다
     * Output
     *  - 배열에 있는 0의 개수를 반환
     * Ex)
     *  - countZeroes([1,1,1,1,0,0]) // 2
     *  - countZeroes([1,0,0,0,0]) // 4
     *  - countZeroes([0,0,0]) // 3
     *  - countZeroes([1,1,1,1]) // 0
     * Time Complexity
     *  - O(log n)
     * */
    public static int countZeroes(int[] arr) {
        if (arr[0] == 0) return arr.length;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] == 0) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return arr.length - start;
    }


    /**
     * Method: sortedFrequency
     * Input
     *  - 정렬된 배열, 숫자
     * Output
     *  - 배열 안에 있는 해당 숫자의 개수
     * Ex)
     *  - sortedFrequency([1,1,2,2,2,2,3],2) // 4
     *  - sortedFrequency([1,1,2,2,2,2,3],3) // 1
     *  - sortedFrequency([1,1,2,2,2,2,3],1) // 2
     *  - sortedFrequency([1,1,2,2,2,2,3],4) // -1
     * Time Complexity
     *  - O(log n)
     * */
    public static int sortedFrequency(int[] arr, int num) {
        int start = 0;
        int start2 = 0;
        int end = arr.length - 1;
        int end2 = end;

        int s = -1;
        int e = end;
        while (start <= end) {
            // 시작 idx 찾기
            int middle = (start + end) / 2;
            if (num <= arr[middle]) {
                end = middle - 1;
                if (arr[middle] == num) {
                    s = middle;
                }
            } else {
                start = middle + 1;
            }

            // 끝 idx 찾기
            int middle2 = (start2 + end2) / 2;
            if (num >= arr[middle2]) {
                start2 = middle2 + 1;
                if (arr[middle2] == num) {
                    e = middle2;
                }
            } else {
                end2 = middle2 - 1;
            }
        }
        if (s == -1) return s;

        return e - s + 1;
    }

    /**
     * Method: findRotatedIndex
     * Input
     *  - 정렬된 숫자에서 중간에 로테이션 되는 배열, 정수
     * Output
     *  - 배열에 있는 정수의 위치(인덱스)
     *  - 값을 찾을 수 없으면 -1을 반환
     * Ex)
     *  - findRotatedIndex([3,4,1,2],4) // 1
     *  - findRotatedIndex([6, 7, 8, 9, 1, 2, 3, 4], 8) // 2
     *  - findRotatedIndex([6, 7, 8, 9, 1, 2, 3, 4], 3) // 6
     *  - findRotatedIndex([37,44,66,102,10,22],14) // -1
     *  - findRotatedIndex([6, 7, 8, 9, 1, 2, 3, 4], 12) // -1
     *  - findRotatedIndex([11,12,13,14,15,16,3,5,7,9], 16) // 5
     *  - findRotatedIndex([11,12,13,0,1,2,3,5,7,9], 0) // 5
     * Time Complexity - O(log n)
     * Space Complexity - O(1)
     * */
    public static int findRotatedIndex(int[] arr, int num) {
        /**
         * 변수
         *   - pivot: 로테이션 위치를 담기 위한 변수
         *   - i: 로테이션 위치를 찾기 위해 위치를 1씩 더하거나 빼주기 위한 변수
         * 로직
         *  - 중간 값이 배열의 첫 번째 값보다 작으면
         *    - 왼쪽 값 보다 작을 때까지 pivot의 위치를 왼쪽으로 이동
         *  - 중간 값이 배열의 첫 번째 값보다 크면
         *    - 오른쪽 값 보다 클 때까지 pivot의 위치를 오른쪽으로 이동
         * */
        int pivot = (arr.length - 1) / 2;
        int i = arr[pivot] > arr[0] ? 1 : -1;

        if (i < 0) {
            while (true) {
                if (arr[pivot] < arr[pivot + i]) break;

                pivot += i;
            }
        } else {
            while (true) {
                if (arr[pivot] > arr[pivot + i]) break;

                pivot += i;
            }
        }

        /**
         * start: 찾는 값이 배열의 첫 번째 값보다 크면 0 부터 시작, 아니면 pivot 위치부터 시작
         * end: 찾는 값이 배열의 첫 번째 값보다 크면 pivot 까지 탐색, 아니면 마지막 인덱스 까지 탐색
         * */
        int start = num > arr[0] ? 0 : pivot;
        int end = num > arr[0] ? pivot : arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (num == arr[middle]) return middle;

            if (num < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return -1;

    }
}
