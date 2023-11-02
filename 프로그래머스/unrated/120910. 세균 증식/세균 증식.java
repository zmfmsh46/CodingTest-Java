class Solution {
    public int solution(int n, int t) {
        //int answer = n * (int) Math.pow(2,t);
        //비트연산으로 한칸씩 밀면 2를 곱한거랑 같은거니까 t만큼 밀어주면 정답이 나옴
        
        int answer = n << t;
        return answer;
    }
}