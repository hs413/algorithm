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

}
