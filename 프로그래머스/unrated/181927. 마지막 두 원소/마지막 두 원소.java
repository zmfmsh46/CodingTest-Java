class Solution {
    public int[] solution(int[] num_list) {

        int num_list_finalIndex = num_list.length - 1; 
        int[] answer = new int[num_list.length + 1];
        int answer_finalIndex = answer.length - 1;

        for(int i = 0; i<answer.length - 1; i++)
        {
            answer[i] = num_list[i];
        }
        if(num_list[num_list_finalIndex] > num_list[num_list_finalIndex -1])
        {
            answer[answer_finalIndex] =  num_list[num_list_finalIndex] - num_list[num_list_finalIndex -1];
        }
        else {
            answer[answer_finalIndex] = num_list[num_list_finalIndex] * 2;
        }


        
        return answer;
    }
}