import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        HashMap<String, int[]> map = new HashMap<>();
        map.put("*", new int[] {0, 0});
        map.put("0", new int[] {1, 0});
        map.put("#", new int[] {2, 0});
        map.put("7", new int[] {0, 1});
        map.put("8", new int[] {1, 1});
        map.put("9", new int[] {2, 1});
        map.put("4", new int[] {0, 2});
        map.put("5", new int[] {1, 2});
        map.put("6", new int[] {2, 2});
        map.put("1", new int[] {0, 3});
        map.put("2", new int[] {1, 3});
        map.put("3", new int[] {2, 3});

        StringBuilder stringBuilder = new StringBuilder();
        int[] left_hand_location = {0,0};
        int[] right_hand_location = {2,0};
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                stringBuilder.append("L");
                left_hand_location = map.get(String.valueOf(number));
            } else if (number == 3 || number == 6 || number == 9) {
                stringBuilder.append("R");
                right_hand_location = map.get(String.valueOf(number));
            } else {
                int[] number_location = map.get(String.valueOf(number));
                int distance1 = Math.abs(number_location[0] - left_hand_location[0]) + Math.abs(number_location[1] - left_hand_location[1]);
                int distance2 = Math.abs(number_location[0] - right_hand_location[0]) + Math.abs(number_location[1] - right_hand_location[1]);
                if (distance1 < distance2) {
                    stringBuilder.append("L");
                    left_hand_location = number_location;
                } else if (distance1 > distance2) {
                    stringBuilder.append("R");
                    right_hand_location = number_location;
                } else {
                    if (hand.equals("right")) {
                        stringBuilder.append("R");
                        right_hand_location = number_location;
                    } else {
                        stringBuilder.append("L");
                        left_hand_location = number_location;
                    }
                }

            }
        }
        return stringBuilder.toString();
    }
}