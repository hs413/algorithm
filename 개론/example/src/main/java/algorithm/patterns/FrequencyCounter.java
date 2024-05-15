package algorithm.patterns;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FrequencyCounter {
    /**
     * 문제: 두 번째 배열에 첫 번째 배열의 제곱 값이 모두 들어 있는지 확인하는 함수를 작성
     *
     * O(n^2) 반복문 중첩을 사용한 해결
     *  - 반복문 중첩은 웬만하면 사용 X
     * */
    public static boolean sameFor(List<Integer> arr1, List<Integer> arr2) {
        if (arr1.size() != arr2.size()) return false;

        for (Integer integer : arr1) {
            int correctIndex = arr2.indexOf((int) Math.pow(integer, 2));
            if (correctIndex == -1) return false;

//            arr2.remove(correctIndex);
        }
        return true;
    }

    /**
     * 문제: 두 번째 배열에 첫 번째 배열의 제곱 값이 모두 들어 있는지 확인하는 함수를 작성
     *
     * O(n) FrequencyCounter
     * */
    public static boolean same(List<Integer> arr1, List<Integer> arr2) {
        if (arr1.size() != arr2.size()) return false;

        Map<Integer, Integer> counter1 = new HashMap<>();
        Map<Integer, Integer> counter2 = new HashMap<>();

        for (int val : arr1) {
            counter1.put(val, counter1.getOrDefault(val, 0) + 1);
        }

        for (int val : arr2) {
            counter2.put(val, counter2.getOrDefault(val, 0) + 1);
        }

        for (int key : counter1.keySet()) {
            int powKey = (int) Math.pow(key, 2);
            if (!counter2.containsKey(powKey)) return false;

            if (!counter2.get(powKey).equals(counter1.get(key))) return false;
        }

        return true;
    }

    /**
     * 두 개의 문자열이 주어졌을 때,
     * 두 번째 문자열이 첫 번째 문자열의 애너그램인지 확인하는 함수를 작성합니다.
     * 애너그램은 다른 글자의 글자를 재배열하여 형성된 단어, 구 또는 이름입니다.
     * (예시: cinema -> iceman)
     */
    public static boolean validAnagram(String str1, String str2) {



        return true;
    }
}
