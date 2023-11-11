class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for (String[] dbId : db) {
            if (dbId[0].equals(id_pw[0])) {
                answer = dbId[1].equals(id_pw[1]) ? "login" : "wrong pw";
            }
        }

        if(answer.equals("")){
            answer = "fail";
        }
        return answer;
    }
}