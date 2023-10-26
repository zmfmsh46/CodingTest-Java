class Solution {
    public String solution(String n_str) {
        int index = 0;
        for (Character n : n_str.toCharArray()) {
            if (n == '0') {
                index++;
            } else {
                break;
            }
        }

        return n_str.substring(index);
    }
}