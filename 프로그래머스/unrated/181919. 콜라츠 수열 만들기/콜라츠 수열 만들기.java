import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while (n>1){
            result.add(n);
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }

        result.add(n);
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}