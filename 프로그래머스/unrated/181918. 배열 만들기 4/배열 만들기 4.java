import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
       for(int i = 0; i<arr.length; i++)
        {
            if(stk.isEmpty())
                stk.add(arr[i]);
            else {
                for(int j = stk.size()-1; j>-1; j--)
                {
                    if(stk.get(j) >= arr[i])
                        stk.remove(j);
                }
                stk.add(arr[i]);
            }
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}