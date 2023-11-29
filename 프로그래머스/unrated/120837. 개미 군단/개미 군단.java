class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] attackDamage = {5,3,1};
        for(int attack : attackDamage){
            answer += hp / attack;
            hp %= attack;
        }
        return answer;
    }
}