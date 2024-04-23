import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int buffer;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        queue.add(-1);

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!queue.isEmpty()) {
            buffer = queue.poll();
            if (queue.isEmpty()) {
                break;
            } else {
                if (buffer != queue.peek()) {
                    arrayList.add(buffer);
                }
            }
        }

        answer = arrayList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}