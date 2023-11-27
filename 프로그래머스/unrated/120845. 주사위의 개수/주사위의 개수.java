class Solution {
    public int solution(int[] box, int n) {
        int[] answer = {0, 0, 0};

        for (int i = 0; i < box.length; i++) {
            if (box[i] >= n) {
                answer[i] = box[i] / n;
            }
        }
        return answer[0] * answer[1] * answer[2];
    }
}