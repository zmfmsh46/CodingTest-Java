class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            if (divisor(i) % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
    
    public int divisor(int number) {
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                count++;
            } else if (number % i == 0) {
                count += 2;
            }
        }

        return count;
    }
}