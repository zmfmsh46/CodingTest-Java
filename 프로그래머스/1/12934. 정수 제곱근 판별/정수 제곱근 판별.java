class Solution {
    public long solution(long n) {
        long answer = 0;
        double square_root = Math.sqrt(n);
        long square_root_ceil = (long) Math.ceil(square_root);
        if (Math.pow(square_root_ceil, 2) == n) {
            answer = (long) Math.pow(square_root_ceil + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}