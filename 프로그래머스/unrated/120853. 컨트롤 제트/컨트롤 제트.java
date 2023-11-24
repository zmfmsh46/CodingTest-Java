class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str_list = s.split(" ");

        for (int i = str_list.length - 1; i >= 0; i--) {
            if (str_list[i].equals("Z")) {
                i--;
            } else {
                answer += Integer.parseInt(str_list[i]);
            }
        }
        
        return answer;
    }
}