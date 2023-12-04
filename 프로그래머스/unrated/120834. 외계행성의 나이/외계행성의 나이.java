import java.util.*;

class Solution {
    public String solution(int age) {
        Map<Integer, Character> map = new HashMap<>();
        String[] ageSplit = String.valueOf(age).split("");
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            map.put(i, (char) (97+i));
        }

        for (String oneAge : ageSplit) {
            answer.append(map.get(Integer.valueOf(oneAge)));
        }
        
        return answer.toString();
    }
}