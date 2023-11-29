import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder answer = new StringBuilder();
        String[] letterList = letter.split(" ");
        Map<String, Character> morseList = new HashMap<>();
        for(int i = 0; i< morse.length; i++){
            morseList.put(morse[i], (char) (i + 97));
        }

        for(int i = 0; i < letterList.length; i++){
            answer.append(morseList.get(letterList[i]));
        }
        return answer.toString();
    }
}