class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max_num = Math.max(a, b);
        int min_num = Math.min(a, b);

        for (long i = min_num; i <= max_num; i++) {
            answer += i;
        }
        return answer;
    }
}