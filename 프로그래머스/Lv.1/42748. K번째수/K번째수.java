import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] buffer = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            System.out.println(Arrays.toString(buffer));
            Arrays.sort(buffer);
            answer[i] = buffer[commands[i][2] - 1];
        }
        return answer;
    }
}