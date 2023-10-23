import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if (arr1.length > arr2.length) {
            answer = 1;

        } else if (arr1.length < arr2.length) {
            answer = -1;

        } else {
            int arr1_sum = Arrays.stream(arr1).sum();
            int arr2_sum = Arrays.stream(arr2).sum();
            if (arr1_sum > arr2_sum) {
                answer = 1;
            } else if (arr1_sum < arr2_sum) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        
        return answer;
    }
}