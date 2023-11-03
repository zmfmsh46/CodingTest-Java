import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        ArrayList<String> answer = new ArrayList<>();

        for (String str : quiz) {
            String[] buffer = str.split(" ");
            if (buffer[1].equals("+")) {
                if (Integer.parseInt(buffer[0]) + Integer.parseInt(buffer[2]) == Integer.parseInt(buffer[4])) {
                    answer.add("O");
                } else
                    answer.add("X");
            } else if(buffer[1].equals("-")){
                if (Integer.parseInt(buffer[0]) - Integer.parseInt(buffer[2]) == Integer.parseInt(buffer[4])) {
                    answer.add("O");
                } else
                    answer.add("X");
            }
        }
        return answer.stream().toArray(String[]::new);
    }
}