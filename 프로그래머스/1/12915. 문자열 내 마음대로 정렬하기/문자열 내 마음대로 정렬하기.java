import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
    
        String[] answer = new String[strings.length];

        ArrayList<String> arrayList = new ArrayList<>();
        for (String string : strings) {
            arrayList.add(string.charAt(n) + string);
        }

        Collections.sort(arrayList);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i).substring(1);
        }
        
        return answer;
    }
}