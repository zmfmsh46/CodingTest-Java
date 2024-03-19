class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count_p = 0;
        int count_y = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'p') {
                count_p++;
            } else if (c == 'y') {
                count_y++;
            }
        }

        answer = count_p == count_y;

        return answer;
    }
}