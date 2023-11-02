class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int n : array) {
            String str = String.valueOf(n);
            while (str.indexOf("7") != -1) {
                str = str.substring(str.indexOf("7")+1);
                answer++;
            }
        }
        
        return answer;
    }
}