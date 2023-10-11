class Solution {
    public int solution(int[] num_list) {
        
        int answer = 0;
        
        for(int n = 0; n< num_list.length; n++){
            if(num_list[n] < 0)
            {
                answer = n;
                break;
            } else
            {
                answer = -1;
            }
        }
        
        return answer;
    }
}