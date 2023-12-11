import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> score = new HashMap<>();
        
        for(int i = 0; i < name.length; i++){
            score.put(name[i], yearning[i]);
        }

        for(int i = 0; i< photo.length; i++){
            int sum = 0;
            for(String img_person : photo[i]){
                if (score.containsKey(img_person)){
                    sum += score.get(img_person);
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}