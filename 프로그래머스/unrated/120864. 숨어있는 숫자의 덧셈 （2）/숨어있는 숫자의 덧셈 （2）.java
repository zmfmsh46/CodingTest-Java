import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(Character c : my_string.toCharArray()){
            if(c < 48 || c > 57){
                my_string = my_string.replace(c, ' ');
            }
        }
        ArrayList<String> string_array = new ArrayList<>(List.of(my_string.split(" ")));
        string_array.removeAll(Arrays.asList("", null));

        for (String s : string_array) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}