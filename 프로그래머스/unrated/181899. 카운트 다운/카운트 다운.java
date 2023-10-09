import java.util.ArrayList;

class Solution {
    public int[] solution(int start, int end_num) {
        
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = start; i >= end_num; i--) {
            result.add(i);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}