import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == a[i % a.length]) {answer[0]++;}
            if(answers[i] == b[i % b.length]) {answer[1]++;}
            if(answers[i] == c[i % c.length]) {answer[2]++;}
        }
        int maxScore = Math.max(answer[0], Math.max(answer[1], answer[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == answer[0]) {list.add(1);}
        if(maxScore == answer[1]) {list.add(2);}
        if(maxScore == answer[2]) {list.add(3);}
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}