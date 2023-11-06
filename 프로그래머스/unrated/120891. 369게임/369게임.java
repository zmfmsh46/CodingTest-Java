class Solution {
    public int solution(int order) {
        int answer = 0;
        int n = 0;

        while (order > 0) {
            n = order % 10;
            if (n != 0 && n % 3 == 0) {
                answer++;
            }
            order /= 10;
        }
        return answer;
    }
}