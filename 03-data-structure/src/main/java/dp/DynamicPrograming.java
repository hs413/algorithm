package dp;

public class DynamicPrograming {
    /**
     * 재귀를 사용한 피보나치 함수
     * O(2^n)
     */
    public static int fib(int n) {
        if (n <= 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }


    /**
     * Memoized을 활용한 동적 프로그래밍 피보나치 함수
     * O(n)
     * */
    public static int fibMemoized(int n) {
//        Map<Integer, Integer> map = new HashMap<>();
        Integer[] map = new Integer[n + 1];
        fib2(map, n);

//        return map.get(n);
        return map[n];
    }

//    private static int fib2(Map<Integer, Integer> map, int n) {
    private static int fib2(Integer[] map, int n) {
//        if (map.containsKey(n)) return map.get(n);
        if (map[n] != null) return map[n];
        if (n <= 2) return 1;

        int result = fib2(map, n - 1) + fib2(map, n - 2);
//        map.put(n, result);
        map[n] = result;
        return result;
    }

}
