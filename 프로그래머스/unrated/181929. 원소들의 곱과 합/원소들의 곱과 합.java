class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int num_list_Multiple = 1;
        int num_list_Plus = 0;

        for ( int num : num_list)
        {
            num_list_Plus += num;
            num_list_Multiple *= num;
        }

        answer = num_list_Multiple < Math.pow(num_list_Plus, 2) ? 1 : 0;
        
        return answer;
    }
}