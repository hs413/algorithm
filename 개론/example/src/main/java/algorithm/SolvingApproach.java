package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제 해결 접근법 예시
 * 문제 : 문자열이 주어졌을 때 각각의 문자 수를 반환
 * */
public class SolvingApproach {
    public static void main(String[] args) {
        Map<String, Integer> result = charCount("HELLOD ODIFI COI 1 ! $ C__");
        return;
    }

    public static Map<String, Integer> charCount(String str) {
        // 1. 반환할 객체를 만든다 -> 객체 대신 Map으로 생성
        Map<String, Integer> result = new HashMap<>();

        // 2. 루프를 사용해 문자열의 문자를 하나씩 조회한다.
        String[] strArr = str.split("");
        for (String s : strArr) {
            String ch = s.toLowerCase();

            // 문자가 영/숫자가 아닌경우 아무일도 하지 않는다.
            if (!ch.matches("[a-z0-9]")) {
                continue;
            }

            result.put(
                    ch,
                    // 객체 key에 해당 하는 영/숫자가
                    // 있으면 value 값을 1 증가 시킨다.
                    // 없으면 문자를 key 등록하고 value 값을 1로 설정한다.
                    result.getOrDefault(ch, 0) + 1
            );
        }

        // 3. 객체를 반환한다.
        return result;
    }
}
