class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (true)
        {
            if(n%2 ==1){
                answer += n;
            }
            else if(n%2 == 0)
            {
                answer += n*n;
            }
            n -= 2;

            if(n<1)
                break;

        }
        
        return answer;
    }
}