import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] knight = new int[number];
        for (int i = 0; i < number; i++) {
            if (divisor(i + 1) > limit) {
                knight[i] = power;
            } else {
                knight[i] = divisor(i + 1);
            }
        }
        return Arrays.stream(knight).sum();
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