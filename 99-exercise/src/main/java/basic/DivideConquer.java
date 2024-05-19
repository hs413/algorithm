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

}
