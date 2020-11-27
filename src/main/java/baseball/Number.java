package baseball;

import utils.RandomUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Number.java
 * 각 자리수가 1~9로 이루어진 3자리 숫자를 생성하고, 저장하는 기능을 가진 클래스
 */
public class Number {
    private static final int NUMBER_LENGTH = 3;
    private static final int MAX_DIGIT = 9;
    private static final int MIN_DIGIT = 1;

    private List<Integer> numbers;

    private Number(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static Number generate() {
        List<Integer> numbers = new ArrayList<>();
        Set<Integer> duplicated = new HashSet<>();                      // 중복 체크용 Set

        for (int i = 0; i < NUMBER_LENGTH; i++) {
            int num;

            do {
                num = RandomUtils.nextInt(MIN_DIGIT, MAX_DIGIT);
            } while (duplicated.contains(num));

            numbers.add(num);
            duplicated.add(num);
        }

        return new Number(numbers);
    }
}
