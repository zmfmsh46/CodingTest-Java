import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String strList = my_string.replaceAll("[^0-9]","");
        ArrayList<Integer> sortedStr = new ArrayList<>();

        for (Character c : strList.toCharArray()) {
            sortedStr.add(Character.getNumericValue(c));
        }
        Collections.sort(sortedStr);
        
        return sortedStr.stream().mapToInt(Integer::intValue).toArray();
    }
}