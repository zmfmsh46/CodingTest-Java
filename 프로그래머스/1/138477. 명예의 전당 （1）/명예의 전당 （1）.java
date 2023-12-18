import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < score.length; i++) {
            stack.push(score[i]);
            stack.sort(Collections.reverseOrder());
            if (stack.size() < k + 1) {
                answer[i] = stack.peek();
            } else {
                stack.pop();
                answer[i] = stack.peek();
            }
        }
        return answer;
    }
}