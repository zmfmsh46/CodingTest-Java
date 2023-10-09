class Solution {
    public int solution(int[] arr, int idx) {
        int result = 0;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                result = i;
                break;
            } else {
                result = -1;
            }
        }
        
        return result;
    }
}