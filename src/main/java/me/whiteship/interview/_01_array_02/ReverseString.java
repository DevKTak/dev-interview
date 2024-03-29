package me.whiteship.interview._01_array_02;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.solution("Hello".toCharArray()));
    }

    /**
     * TODO 주어진 문자열을 거꾸로 뒤집은 문자열을 만드는 함수를 작성하라.
     *  예) hello => olleh
     *  예) happy new year => reay wen yppah
     *
     * @param message
     * @return
     */
    private char[] solution1(char[] message) {
        char[] resultArr = new char[message.length];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = message[resultArr.length - i - 1];
        }
        return resultArr;
    }

    /**
     * TODO 주어진 문자열을 거꾸로 뒤집은 문자열을 만드는 함수를 작성하라.
     *  예) hello => olleh
     *  예) happy new year => reay wen yppah
     *
     * @param message
     * @return
     */
    private char[] solution(char[] message) {
        StringBuilder sb = new StringBuilder();

        for (char v : message) {
            sb.append(v);
        }

        return sb.reverse().toString().toCharArray();
    }
}
