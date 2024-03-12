import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        boolean answer = false;

        Pattern pattern = Pattern.compile("^[0-9]*$");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find() && (s.length() == 4 || s.length() == 6)) {
            answer = true;
        }
        return answer;
    }
}