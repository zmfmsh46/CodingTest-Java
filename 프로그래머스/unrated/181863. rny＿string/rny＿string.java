class Solution {
    public String solution(String rny_string) {
        StringBuffer stringBuffer = new StringBuffer();

        for (Character c : rny_string.toCharArray()) {
            if (c == 'm') {
                stringBuffer.append("rn");
            } else {
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }
}