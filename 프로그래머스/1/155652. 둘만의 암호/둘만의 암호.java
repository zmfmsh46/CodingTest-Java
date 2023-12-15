class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Character c : s.toCharArray()) {
            int asciicode = c;
            for (int i = 0; i < index; i++) {
                asciicode++;
                asciicode = asciicode % 123 < 97 ? asciicode % 123 + 97 : asciicode % 123;
                if (skip.contains(String.valueOf((char) asciicode))) {
                    i--;
                }
            }
            stringBuilder.append((char) asciicode);
        }
        return stringBuilder.toString();
    }
}