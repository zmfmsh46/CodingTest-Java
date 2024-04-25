import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = (int) Arrays.stream(nums).distinct().count();
        answer = Math.min(count, nums.length / 2);
        return answer;
    }
}