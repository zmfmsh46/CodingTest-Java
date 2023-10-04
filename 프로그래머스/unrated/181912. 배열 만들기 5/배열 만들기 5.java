import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(String str : intStrs){
            if(Integer.valueOf(str.substring(s,s+l)) > k)
            {
                result.add(Integer.valueOf(str.substring(s,s+l)));
            }
                           
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}