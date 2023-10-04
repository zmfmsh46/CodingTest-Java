class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        StringBuilder stringBuilder 
            = new StringBuilder(my_string.substring(s,e+1)).reverse();
        answer = my_string.substring(0,s) + stringBuilder +my_string.substring(e+1);
        
        return answer;
    }
}