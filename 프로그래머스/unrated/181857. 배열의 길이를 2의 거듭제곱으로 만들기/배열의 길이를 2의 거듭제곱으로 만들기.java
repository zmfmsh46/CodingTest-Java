import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        int n = (int) (Math.log(arr.length) / Math.log(2));
        int exponent = arr.length % Math.pow(2,n) == 0 ? n : n+1;
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));

        while (answer.size() < Math.pow(2,exponent)){
            answer.add(0);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}