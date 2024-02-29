class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] charArray = s.toCharArray();
        int exponent = 0;
        
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (48 <= s.charAt(i) && s.charAt(i) <= 57) {
                answer += (int) (Character.getNumericValue(s.charAt(i)) * Math.pow(10, exponent));
            } else if (s.charAt(i) == '-') {
                answer *= -1;
            }
            exponent++;
        }
        
        return answer;
    }
}