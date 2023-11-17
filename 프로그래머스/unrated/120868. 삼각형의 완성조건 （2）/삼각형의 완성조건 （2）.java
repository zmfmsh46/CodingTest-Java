class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max_line = Math.max(sides[0], sides[1]);
        int min_line = Math.min(sides[0], sides[1]);
        int n = max_line - min_line + 1;
        //주어진 두 변(x,y)중 가장 긴 변이 존재 할경우(x or y) : n > x - y && n < x
        //주어진 두 변(x,y)중 가장 긴 변이 존재 하지 않을 경우(n) : n < x + y
        while (n < max_line || n < max_line + min_line){
            n++;
            answer++;
        }
        return answer;
    }
}