import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            hm.put(players[i],i);
        }
        for(String calling : callings){
            int index = hm.get(calling);
            if(index > 0){
                String temp = players[index - 1];
                players[index -1] = players[index];
                players[index] = temp;
                
                hm.put(players[index-1], index - 1);
                hm.put(players[index], index);
            }
        }
        return players;
    }
}