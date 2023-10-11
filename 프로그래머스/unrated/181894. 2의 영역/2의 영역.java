import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> index_two = new ArrayList<>();

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == 2)
                index_two.add(i);
                
        }

        if(index_two.size() == 0){
            answer.add(-1);
        } else if (index_two.size() == 1) {
            answer.add(2);
        } else if(index_two.size() >= 2) {
            for(int i = index_two.get(0); i <= index_two.get(index_two.size()-1); i++){
                answer.add(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}