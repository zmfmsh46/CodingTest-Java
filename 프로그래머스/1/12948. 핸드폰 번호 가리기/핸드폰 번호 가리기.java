class Solution {
    public String solution(String phone_number) {
        String temp = phone_number.substring(phone_number.length() - 4);
        StringBuffer answer = new StringBuffer("*".repeat(phone_number.length()-4));
        answer.append(temp);
        return answer.toString();
    }
}