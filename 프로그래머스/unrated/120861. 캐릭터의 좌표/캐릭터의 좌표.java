import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        int x = 0, y = 0, max_X = board[0] / 2, max_Y = board[1] / 2;

        for (String input : keyinput) {
            if (input.equals("left")) {
                if (x > max_X * -1) {
                    x--;
                }
            } else if (input.equals("right")) {
                if (x < max_X) {
                    x++;
                }
            } else if (input.equals("up")) {
                if (y < max_Y) {
                    y++;
                }
            } else if (input.equals("down")) {
                if (y > max_Y * -1) {
                    y--;
                }
            }
        }

        answer = new int[] {x,y};
        return answer;
    }
}