class Solution {
    public String solution(String myString, String pat) {
        String answer = myString;
        int index = 0;

        while (myString.indexOf(pat) != -1) {
            index = index + myString.indexOf(pat)+pat.length();
            myString = myString.substring(myString.indexOf(pat)+pat.length());
        }
        
        return answer.substring(0,index);
    }
}