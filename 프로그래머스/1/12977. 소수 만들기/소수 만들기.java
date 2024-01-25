class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int r = j + 1; r < nums.length; r++) {
                    if (isPrime(nums[i] + nums[j] + nums[r])) {
                        count++;
                    }
                }
            }
        }

        answer = count != 0 ? count : answer;

        return answer;
    }
    
    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}