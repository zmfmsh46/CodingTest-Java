class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0] * numbers[1];
        int buffer;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                buffer = numbers[i] * numbers[j];
                if (answer < buffer) {
                    answer = buffer;
                }
            }
        }
        return answer;
    }
}