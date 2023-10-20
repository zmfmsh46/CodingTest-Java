import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String myStr) {
        String[] myStr_split = myStr.replaceAll("a", " ").replaceAll("b", " ").replaceAll("c", " ").split("\\s+");
        
        ArrayList<String> answer = new ArrayList<>(Arrays.asList(myStr_split));
        
        answer.removeAll(Arrays.asList("", null));
        
        if(answer.isEmpty())
        {
            answer.add("EMPTY");
        }
            
        
        return answer.toArray(String[]::new);
    }
}