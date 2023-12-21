class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sounds = {"aya", "ye", "woo", "ma"};
        for (String word : babbling) {
            word = replaceKeyword(word, sounds);
            if (word.matches("^[0-9]*$") && !isContinuty(word)) {
                answer++;
            }
        }
        return answer;
    }
    
    private String replaceKeyword(String word, String[] sounds) {
        for (int i = 0; i < sounds.length; i++) {
            word = word.replace(sounds[i], String.valueOf(i));
        }

        return word;
    }

    private boolean isContinuty(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }

        return false;
    }
}