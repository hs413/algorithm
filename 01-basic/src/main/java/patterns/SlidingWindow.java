package patterns;

/**
 * 배열이나 문자열같은 데이터를 입력하거나
 * 연속적인 해당 데이터의 하위 집합을 찾는 경우 유용
 * */
public class SlidingWindow {
    // 연속된 합이 가장 큰 수를 반환 하는 함수
    public static Integer maxSubArraySum(int[] arr, int num) {
        if (arr.length < num) return null;

        int maxSum = 0;
        int tempSum = 0;

        for (int i = 0; i < num; i++) {
            maxSum += arr[i];
        }

        tempSum = maxSum;

        for (int i = num; i < arr.length; i++) {
            tempSum = tempSum - arr[i - num] + arr[i];
            maxSum = Math.max(maxSum, tempSum);
        }

        return maxSum;
    }
}
