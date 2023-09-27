import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
      
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int[] query : queries)
        {
            int count = 0;
            int buffer = Arrays.stream(arr).max().getAsInt();
            for(int i = query[0]; i <= query[1]; i++)
            {
                if(arr[i] > query[2])
                {
                    buffer = Math.min(arr[i], buffer);
                    count++;
                }
            }
            if(count == 0)
            {
                buffer = -1;
            }
            arrayList.add(buffer);
        }
        
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}