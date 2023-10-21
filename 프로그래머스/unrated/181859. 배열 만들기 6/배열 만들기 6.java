import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> answer = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (answer.isEmpty()) {
                answer.push(arr[i]);
            } else {
                if (answer.peek() == arr[i]) {
                    answer.pop();
                } else if (answer.peek() != arr[i]) {
                    answer.push(arr[i]);
                }
            }
        }
        
        if(answer.isEmpty())
            answer.push(-1);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}