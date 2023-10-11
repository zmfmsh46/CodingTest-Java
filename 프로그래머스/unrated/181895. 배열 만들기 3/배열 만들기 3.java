import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int[] array : intervals)
        {
            for(int i = array[0]; i <= array[1]; i++)
            {
                answer.add(arr[i]);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}