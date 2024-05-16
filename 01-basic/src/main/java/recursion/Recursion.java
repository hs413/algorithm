package recursion;

/**
 * 메서드(함수)가 자기 자신을 호출하는 것
 * - 종료 조건이 없거나 잘못되는 경우 주의
 * */
public class Recursion {

    // 반복문을 사용한 factorial
    public static int factorialFor(int num) {
        int total = 1;
        for (int i = num; i > 0; i--) {
            total *= i;
        }
        return total;
    }

    public static int factorial(int num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }

    /**
     * power 함수 작성
     * Math.pow()의 기능을 모방
     * */
    public static int power(int num, int pow) {
        if (pow == 0) return 1;
        return num * power(num, pow - 1);
    }
}
