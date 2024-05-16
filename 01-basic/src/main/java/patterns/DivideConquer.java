package patterns;

/**
 * 분할 정복 패턴
 * 배열이나 문자열 같은 큰 큐모의 데이터셋을 처리
 * O(log n)
 * */
public class DivideConquer {
    public static Integer search(Integer[] array, int val) {
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int middle = (int) Math.floor((double) (min + max) / 2);
            int currentElement = array[middle];

            if (currentElement < val) {
                min = middle + 1;
            } else if (currentElement > val) {
                max = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
