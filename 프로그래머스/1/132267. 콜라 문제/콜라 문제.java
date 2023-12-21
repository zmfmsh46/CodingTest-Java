class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int get_cola = n / a * b;
            answer += get_cola;
            n = n % a + get_cola;
        }
        return answer;
    }
}