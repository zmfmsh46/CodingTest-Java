class Solution {
    public String solution(String myString) {
        StringBuffer stringBuffer = new StringBuffer();
        
        for (Character c : myString.toCharArray()) {
            if (c == 'a' || c == 'A') {
                stringBuffer.append("A");
            } else{
                stringBuffer.append(c.toString().toLowerCase());
            }
        }
        return stringBuffer.toString();
    }
}