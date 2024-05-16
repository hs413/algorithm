package patterns;

import java.util.List;
import java.util.Objects;

/**
 * 여러 개의 포인터를 사용해서 탐색하는 기법
 * */
public class MultiplePointer {
    /**
     * 합 해서 0이 되는 값을 배열(리스트) 형태로 반환
     * */
    public static List<Integer> sumZero(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while(left < right) {
            int sum = list.get(left) + list.get(right);

            if (sum == 0) return List.of(list.get(left), list.get(right));

            if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }

        return null;
    }

    /**
     * 배열의 고유 값을 반환 하는 함수
     * 내 풀이
     * */
    public static int countUniqueValues(List<Integer> list) {
        if (list.isEmpty()) return 0;

        int p1 = 0;
        int p2 = 1;
        int result = 1;
        while (p1 < list.size() && p2 < list.size()) {
            if (list.get(p1) == list.get(p2)) {
                p2++;
                continue;
            }

            p1 = p2;
            p2++;
            result++;
        }

        return result;
    }
    // 다른 풀이
    public static int countUniqueValues2(List<Integer> list) {
        if (list.isEmpty()) return 0;

        int i = 0;
        for (int j = 1; j < list.size(); j++) {
            if (!Objects.equals(list.get(i), list.get(j))) {
                i++;
//                list.get(i) = list.get(j);
            }
        }
        return i + 1;
    }
}
