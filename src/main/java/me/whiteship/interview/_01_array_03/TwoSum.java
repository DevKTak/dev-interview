package me.whiteship.interview._01_array_03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.solution3(new int[]{2, 3, 5, 7}, 10)));
    }

    /**
     * 3개의 합
     */
    private int[] solution3(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int findNum = target - numbers[i] - numbers[j];

                if (map.containsKey(findNum) && map.get(findNum) != i && map.get(findNum) != j) {
                    return new int[] {i, j, map.get(findNum)};
                }
            }
        }

        return null;
    }

    /**
     * TODO 숫자로 구성된 배열 numbers와 target 숫자 하나가 주어졌을 때 numbers 배열에 들어있는 두 수를 더해 target 숫자를 만들 수 있는 인덱스 두개를 찾는 함수를 작성하라.
     *  예) numbers = [2, 3, 5, 7] target = 8, 8을 만들 수 있는 3과 5의 인덱스인 1, 2를 리턴해야 한다.
     *  예) numbers = [1, 2, 6, 8] target = 9, 9를 만들 수 있는 1과 8의 인덱스인 0, 3을 리턴해야 한다.
     *
     * numbers 배열에 중복되는 숫자는 없으며 target 숫자를 만들 수 있는 조합은 하나 뿐이라고 가정해도 좋다.
     * @param numbers
     * @param target
     * @return
     */
    private int[] solution(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (target - numbers[i] == numbers[j]) {
                  return new int[]{i, j};
                }
            }
        }

        return null;
    }

    private int[] solution2(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int subVal = target - numbers[i];

            if (map.containsKey(subVal) && map.get(subVal) != i) {
                return new int[] {map.get(subVal), i};
            }
            map.put(numbers[i], i);
        }

        return null;
    }

}
