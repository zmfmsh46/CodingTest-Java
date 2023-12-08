class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if (n <= slice) {
            answer = 1;
        } else {
            answer = n % slice == 0 ? n / slice : n / slice + 1;
        }
        return answer;
    }
}