import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] result = {};

        if (n == 1) {
            result = IntStream.rangeClosed(0,slicer[1]).map(i -> num_list[i]).toArray();
        } else if (n == 2) {
            result = IntStream.rangeClosed(slicer[0], num_list.length -1).map(i -> num_list[i]).toArray();
        } else if (n == 3) {
            result = IntStream.rangeClosed(slicer[0], slicer[1]).map(i -> num_list[i]).toArray();
        } else if (n == 4){
            int index = 0;
            result = IntStream.rangeClosed(0, slicer[1]).filter(i-> (i * slicer[2]) <= slicer[1] - slicer[0] ).map(i -> num_list[slicer[0] + i * slicer[2]]).toArray();
        }
        
        return result;
    }
}