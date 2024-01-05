import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                int input = board[i][move - 1];
                if (input != 0) {
                    if (!stack.isEmpty() && stack.peek().equals(input)) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(input);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}