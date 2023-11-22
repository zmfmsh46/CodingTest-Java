class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int min_X = dots[0][0], max_X = dots[0][0], min_Y = dots[0][1], max_Y = dots[0][1];
        for (int[] dot : dots) {
            if (dot[0] > max_X) {
                max_X = dot[0];
            } else if (dot[0] < min_X) {
                min_X = dot[0];
            }

            if (dot[1] > max_Y) {
                max_Y = dot[1];
            } else if (dot[1] < min_Y) {
                min_Y = dot[1];
            }
        }

        answer = Math.abs((max_X - min_X) * (max_Y - min_Y));
        return answer;
    }
}