import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> set = new HashSet<String>(List.of(report));
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Iterator<String> iterSet = set.iterator();
        Iterator<String> iterSet2 = set.iterator();
        ArrayList<String> confirmed_list = new ArrayList<>();

        while (iterSet.hasNext()) {
            String[] str = iterSet.next().split(" ");
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
            if (map.get(str[1]) >= k) {
                confirmed_list.add(str[1]);
            }
        }

        while (iterSet2.hasNext()) {
            String[] str = iterSet2.next().split(" ");
            if (confirmed_list.contains(str[1])) {
                map2.put(str[0], map2.getOrDefault(str[0], 0) + 1);
            }
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = map2.getOrDefault(id_list[i], 0);
        }
        return answer;
    }
}