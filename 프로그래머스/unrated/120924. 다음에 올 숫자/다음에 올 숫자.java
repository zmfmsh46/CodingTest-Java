class Solution {
    public int solution(int[] common) {
        int answer = 0;
        boolean arithmetic_sequence = (common[1] - common[0]) == (common[2] - common[1]) ?  true : false;
        int d = arithmetic_sequence == true ? common[1] - common[0] : common[1] / common[0];

        answer = arithmetic_sequence == true ? common[common.length-1] + d : common[common.length-1] * (common[1] / common[0]);
        return answer;
    }
}