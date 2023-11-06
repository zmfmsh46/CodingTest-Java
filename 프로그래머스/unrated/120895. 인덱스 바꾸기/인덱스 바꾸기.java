class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] ch = my_string.toCharArray();
        StringBuilder answer = new StringBuilder();
        
        char buffer = ch[num1];
        ch[num1] = ch[num2];
        ch[num2] = buffer;

        for (Character c : ch) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}