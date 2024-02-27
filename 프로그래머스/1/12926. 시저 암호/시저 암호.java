class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        n = n % 26;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                stringBuilder.append(c);
            } else {
                if (Character.isLowerCase(c)) {
                    stringBuilder.append((char) ((c - 'a' + n) % 26 + 'a'));
                } else if (Character.isUpperCase(c)){
                    stringBuilder.append((char) ((c - 'A' + n) % 26 + 'A'));
                }
            }
        }
        
        answer = stringBuilder.toString();
        
        return answer;
    }
}