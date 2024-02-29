class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <n; i++) {
            if (i % 2 == 0) {

                stringBuilder.append("수");
            } else {
                stringBuilder.append("박");
            }
        }

        answer = stringBuilder.toString();
        return answer;
    }
}