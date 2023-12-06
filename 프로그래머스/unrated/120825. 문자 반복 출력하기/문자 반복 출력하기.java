class Solution {
    public String solution(String my_string, int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Character c : my_string.toCharArray()) {
            stringBuilder.append(String.valueOf(c).repeat(n));
        }
        return stringBuilder.toString();
    }
}