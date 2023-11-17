class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (String str : dic) {
            int count = 0;
            for (String sp : spell) {
                if(str.indexOf(sp) != -1){
                    count++;
                } else {
                    break;
                }
            }
            if(str.length() == count && str.length() == spell.length){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}