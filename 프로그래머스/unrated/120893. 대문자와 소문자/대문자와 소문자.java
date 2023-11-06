class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = ch[i] >= 'A' && ch[i] <= 'Z' ? Character.toLowerCase(ch[i]) : Character.toUpperCase(ch[i]);
        }

        answer = String.valueOf(ch);
        return answer;
    }
}