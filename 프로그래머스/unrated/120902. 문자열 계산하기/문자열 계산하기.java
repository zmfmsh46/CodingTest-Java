class Solution {
    public int solution(String my_string) {
        String[] strArray = my_string.split(" ");
        int index = 1;
        int answer = Integer.parseInt(strArray[0]);
        while (index < strArray.length) {
            int operator = strArray[index].equals("+") == true ? 1 : -1;
            answer += operator*Integer.parseInt(strArray[index + 1]);
            index += 2;
        }
        
        return answer;
    }
}