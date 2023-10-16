import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        ArrayList<String> result = new ArrayList<>();

        for (String str : strArr) {
            if(str.indexOf("ad") == -1)
                result.add(str);
        }
        
        answer = result.toArray(new String[result.size()]);
        
        return answer;
    }
}