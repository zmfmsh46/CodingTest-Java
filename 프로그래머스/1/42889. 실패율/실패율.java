import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Map<Integer, Double> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int people_count = 0;
            int count = 0;
            for (int stage : stages) {
                if (stage >= i) {
                    people_count++;
                    if (stage == i) {
                        count++;
                    }
                }
            }
            if (people_count != 0) {
                map.put(i, (double) count / people_count);
            } else {
                map.put(i, 0.0);
            }
        }
        List<Double> buffer = new ArrayList<>(map.values());
        Collections.sort(buffer, Collections.reverseOrder());
        for (int i = 0; i < buffer.size(); i++) {
            for (int key : map.keySet()) {
                if (map.get(key).equals(buffer.get(i))) {
                    answer[i] = key;
                    map.remove(key);
                    break;
                }
            }
        }
        return answer;
    }
}