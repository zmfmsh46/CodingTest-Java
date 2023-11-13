import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int[] line : lines){
            int from = Math.min(line[0],line[1]), to = Math.max(line[0],line[1]);
            for(int i = from; i < to; i++){
                hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
            }
        }

        for(int key : hashMap.keySet()){
            if(hashMap.get(key) >= 2){
                answer++;
            }
        }
        return answer;
    }
}