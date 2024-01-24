import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] calculate = new String[n];
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            calculate[i] = String.format("%0"+n+"d", Long.parseLong(Long.toBinaryString(arr1[i] | arr2[i])));
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < calculate[i].length(); j++) {
                sb = calculate[i].charAt(j) == '1' ? sb.append("#") : sb.append(" ");
            }
            answer[i] = sb.toString();
        }

        return answer;
    }
}