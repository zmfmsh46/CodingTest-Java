import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < picture.length; i++) {
            stringBuffer.delete(0,stringBuffer.length());
            for (int j = 0; j < picture[i].length(); j++) {
                stringBuffer.append(String.valueOf(picture[i].charAt(j)).repeat(k));
            }
            List<String> a = new ArrayList<>();
            for (int r = 0; r < k; r++) {
                a.add(stringBuffer.toString());
            }
            answer.addAll(a);
        }
        
        return answer.stream().toArray(String[]::new);
    }
}