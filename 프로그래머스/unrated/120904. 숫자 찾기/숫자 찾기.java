class Solution {
    public int solution(int num, int k) {
        int index = String.valueOf(num).indexOf(String.valueOf(k));
        int answer = index == -1 ? -1 : index+1;
        return answer;
    }
}