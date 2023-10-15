class Solution {
    public String solution(String my_string, String alp) {
        my_string = my_string.replace(alp, Character.toString(alp.charAt(0)-32));
        return my_string;
    }
}