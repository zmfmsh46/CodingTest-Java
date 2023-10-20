class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replaceAll("A", "b");
        myString = myString.replaceAll("B", "a");
        int answer = myString.toUpperCase().indexOf(pat) != -1 ? 1 : 0;
        return answer;
    }
}