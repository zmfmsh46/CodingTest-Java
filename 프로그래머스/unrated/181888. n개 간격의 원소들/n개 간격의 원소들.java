class Solution {
    public int[] solution(int[] num_list, int n) {
        int arr_length = num_list.length % n == 0 ? num_list.length / n : (num_list.length / n) + 1;
        int[] answer = new int[arr_length];
        

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i*n];
        }
        return answer;
    }
}