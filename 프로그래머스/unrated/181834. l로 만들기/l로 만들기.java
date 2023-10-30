class Solution {
    public String solution(String myString) {
        StringBuffer answer = new StringBuffer();

        for (Character c : myString.toCharArray()) {
            
            if (c < 'l') {
                answer.append("l");
            } else {
                answer.append(c);
            } 
        }
        
        return answer.toString();
    }
}