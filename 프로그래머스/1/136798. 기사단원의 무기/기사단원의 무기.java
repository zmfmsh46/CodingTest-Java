import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 0; i < number; i++) {
            if (divisor(i + 1) > limit) {
                answer += power;
            } else {
                answer += divisor(i + 1);
            }
        }
        return answer;
    }
    
    private int divisor(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) count++;
            else if (num % i == 0) count += 2;
        }

        return count;
    }
}