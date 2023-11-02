import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String answer = Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
        return answer;
    }
}