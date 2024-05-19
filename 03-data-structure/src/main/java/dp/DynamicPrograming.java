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
}
