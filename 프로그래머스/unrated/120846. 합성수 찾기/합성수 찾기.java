class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (isCompositeNumber(i)) {
                answer++;
            }
        }
        return answer;
    }
    
    private boolean isCompositeNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count >= 3;
    }
}