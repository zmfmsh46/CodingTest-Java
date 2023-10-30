class Solution {
    public int[][] solution(int[][] arr) {
        int index = arr.length > arr[0].length ? arr.length : arr[0].length;
        int[][] answer = new int[index][index];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}