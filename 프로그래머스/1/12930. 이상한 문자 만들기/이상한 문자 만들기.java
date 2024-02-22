class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ",-1);

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(Character.toUpperCase(word.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(word.charAt(i)));
                }
            }

            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        answer = sb.toString();
        
        return answer;
    }
}