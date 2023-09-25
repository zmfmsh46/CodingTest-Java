class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        StringBuffer stringBuffer1 = new StringBuffer("");
        StringBuffer stringBuffer2 = new StringBuffer("");

        for (int num : num_list)
        {
            if(num%2 == 0)
            {
                stringBuffer2.append(num);
            }else {
                stringBuffer1.append(num);
            }
        }

        answer = Integer.parseInt(stringBuffer1.toString()) + Integer.parseInt(stringBuffer2.toString());
        
        return answer;
    }
}