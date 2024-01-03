class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        answer = Integer.parseInt(String.valueOf(sb.reverse()), 3);
        return answer;
    }
}