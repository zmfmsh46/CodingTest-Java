class Solution {
    public int[] solution(int[] array) {
        int buffer_max = 0;
        int buffer_index = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] > buffer_max) {
                buffer_max = array[index];
                buffer_index = index;
            }
        }
        int[] answer = {buffer_max, buffer_index};
        return answer;
    }
}