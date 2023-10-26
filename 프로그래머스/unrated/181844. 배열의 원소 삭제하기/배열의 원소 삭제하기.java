import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        ArrayList<Integer> answer = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        
        for (int n : delete_list) {
            if (answer.contains(n)) {
                answer.remove(answer.indexOf(n));
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}