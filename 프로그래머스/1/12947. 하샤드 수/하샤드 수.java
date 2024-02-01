class Solution {
    public boolean solution(int x) {
        boolean answer = false;

        int sum = 0;
        for (char ch : String.valueOf(x).toCharArray()) {
            sum += Character.getNumericValue(ch);
        }
        
        answer = x % sum == 0;
        return answer;
    }
}