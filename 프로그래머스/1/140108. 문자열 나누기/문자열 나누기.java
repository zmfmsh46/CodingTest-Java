class Solution {
    public int solution(String s) {
        int answer = 0;
        String part_s = s;
        while (!part_s.isEmpty()) {
            int cursor_index = 0;
            char designated_ch = part_s.charAt(0);
            int designated_ch_count = 1, undesignated_ch_count = 0;
            for (int i = 1; i < part_s.length(); i ++) {
                if (designated_ch == part_s.charAt(i)) {
                    designated_ch_count++;
                } else {
                    undesignated_ch_count++;
                }
                if (designated_ch_count == undesignated_ch_count) {
                    cursor_index = i;
                    break;
                }
            }

            if (cursor_index != 0) {
                part_s = part_s.substring(cursor_index + 1);
            } else {
                part_s = "";
            }
            answer++;
        }
        return answer;
    }
}