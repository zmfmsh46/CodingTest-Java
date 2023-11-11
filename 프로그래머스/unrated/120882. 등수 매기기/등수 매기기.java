import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        ArrayList<Float> sortedScore = new ArrayList<>();

        for (int i = 0; i< score.length; i++) {
            sortedScore.add((score[i][0] + score[i][1]) / 2f);
        }
        Collections.sort(sortedScore, Collections.reverseOrder());

        for (int i = 0; i< score.length; i++) {
            answer[i] = sortedScore.indexOf((score[i][0] + score[i][1]) / 2f) + 1;
        }
        return answer;
    }
}