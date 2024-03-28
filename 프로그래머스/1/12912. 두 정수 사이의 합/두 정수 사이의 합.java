class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long max_num = Math.max(a, b);
        long min_num = Math.min(a, b);

        //등차수열 공식
        answer = (max_num - min_num + 1) * (min_num + max_num) / 2;
        return answer;
    }
}