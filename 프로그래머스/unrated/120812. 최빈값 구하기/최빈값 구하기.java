import java.util.*;

class Solution {
    public int solution(int[] array) {
        int mode = 0, count = 0, mode_key = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : array) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int max = Collections.max(hm.values());

        for (int key : hm.keySet()) {
            if (hm.get(key) == max) {
                count++;
                mode_key = key;
            }
        }

        mode = count == 1 ? mode_key : -1;
        return mode;
    }
}