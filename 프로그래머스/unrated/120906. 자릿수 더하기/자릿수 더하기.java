class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] n_array = String.valueOf(n).toCharArray();
        for (Character c : n_array) {
            answer += Character.getNumericValue(c);
        }
        
        return answer;
    }
}