class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        StringBuffer answer = new StringBuffer();
        answer.append(my_string.substring(0,s));
        answer.append(overwrite_string);
        answer.append(my_string.substring(overwrite_string.length()+s));

        return answer.toString();
    }
}