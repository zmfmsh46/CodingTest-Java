class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if (a == b && b == c)
        {
            answer = (int) ((a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)) * (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3)));
        } else if ((a==b && b != c) || (b==c && c != a) || (a==c && a != b)) {
            answer = (int) ((a + b + c) * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)));
        }else
            answer = a + b + c;
        
        return answer;
    }
}