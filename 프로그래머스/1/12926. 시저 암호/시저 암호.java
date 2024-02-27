class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                stringBuilder.append(c);
            } else {
                if (65 <= c && c <= 90) {
                    if (c + n > 90) {
                        stringBuilder.append((char) ((c + n) % 90 + 64));
                    } else {
                        stringBuilder.append((char) (c + n));
                    }
                } else if (97 <= c && c <= 122) {
                    if (c + n > 122) {
                        stringBuilder.append((char) ((c + n) % 122 + 96));
                    } else {
                        stringBuilder.append((char) (c + n));
                    }
                }
            }
        }
        
        answer = stringBuilder.toString();
        
        return answer;
    }
}