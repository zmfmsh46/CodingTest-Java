import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = String.format("%0"+n+"d", Long.parseLong(Long.toBinaryString(arr1[i] | arr2[i]))).replaceAll("1", "#").replaceAll("0", " ");
        }
        return answer;
    }
}