class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String bf = t.substring(i, i + p.length());
            answer = Long.parseLong(bf) <= Long.parseLong(p) ? answer + 1 : answer;
        }
        return answer;
    }
}