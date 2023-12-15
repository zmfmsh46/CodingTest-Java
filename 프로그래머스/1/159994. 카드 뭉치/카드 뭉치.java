import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> queue_card1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue_card2 = new LinkedList<>(Arrays.asList(cards2));
        String[] collection_word = new String[goal.length];

        for (int i = 0; i < goal.length; i++) {
            if (queue_card1.contains(goal[i])) {
                collection_word[i] = queue_card1.poll();
            } else {
                collection_word[i] = queue_card2.poll();
            }
        }

        answer = Arrays.equals(goal, collection_word) ? "Yes" : "No";
        return answer;
    }
}