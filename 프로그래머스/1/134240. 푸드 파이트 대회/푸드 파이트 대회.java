class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                stringBuilder.append(i);
            }
        }

        answer = stringBuilder.toString() + "0" + stringBuilder.reverse();
        return answer;
    }
}