class Solution {
    public String solution(String rsp) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Character c : rsp.toCharArray()) {
            if (c.equals('2')) {
                stringBuilder.append(0);
            } else if (c.equals('0')) {
                stringBuilder.append(5);
            } else if (c.equals('5')) {
                stringBuilder.append(2);
            }
        }
        return stringBuilder.toString();
    }
}