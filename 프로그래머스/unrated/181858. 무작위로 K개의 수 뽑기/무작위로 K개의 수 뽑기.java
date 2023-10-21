import java.util.Stack;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        Stack<Integer> answer = new Stack<>();

        for (int n : arr) {
            if (answer.search(n) == -1) {
                answer.push(n);
                if(answer.size() == k)
                    break;
            }
        }

        while (answer.size() < k) {
            answer.push(-1);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}