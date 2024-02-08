

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n, m);
        answer[1] = lcd(n, m);
        
        return answer;
    }
    public int gcd(int a, int b) {
        //b가 0이 될때까지 나머지 연산
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        
        return a;
    }

    public int lcd(int a, int b) {
        // 두수를 곱한 값에 최대공약수를 나누면 최소공배수가 나온다.
        return a * b / gcd(a, b);
    }
}