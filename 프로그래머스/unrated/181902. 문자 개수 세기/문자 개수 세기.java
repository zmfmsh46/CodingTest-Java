import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int alphabat = 65; alphabat <= 122; alphabat++) {
            int count = 0;
            if(alphabat <= 90 || alphabat >= 97){
                for(int i = 0; i < my_string.length(); i++)
                {
                    if(my_string.charAt(i) == alphabat)
                        count++;
                }
                result.add(count);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

/*class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 'a')
                answer[c - 'a' + 26]++;
            else
                answer[c - 'A']++;
        }
        return answer;
    }
}*/
