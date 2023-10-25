import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);

        
        return IntStream.rangeClosed(0,4).map(i -> num_list[i]).toArray();
    }
}