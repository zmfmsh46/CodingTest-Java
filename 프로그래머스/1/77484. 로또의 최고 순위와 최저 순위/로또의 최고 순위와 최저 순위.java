import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int answer_count = 0;
        int zero_count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : win_nums) {
            arrayList.add(num);
        }

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero_count++;
            } else {
                if (arrayList.contains(lottos[i])) {
                    answer_count++;
                }
            }
        }

        answer[0] = answer_count + zero_count > 1 ? 7 - answer_count - zero_count : 6;
        answer[1] = answer_count > 1 ? 7 - answer_count : 6;
        return answer;
    }
}