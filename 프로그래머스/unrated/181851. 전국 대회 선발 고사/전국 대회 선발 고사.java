import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> player_list = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i] == true) {
                player_list.put(rank[i], i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>(player_list.keySet());
        Collections.sort(result);

        answer = player_list.get(result.get(0)) * 10000 + player_list.get(result.get(1)) * 100 + player_list.get(result.get(2));
        
        return answer;
    }
}