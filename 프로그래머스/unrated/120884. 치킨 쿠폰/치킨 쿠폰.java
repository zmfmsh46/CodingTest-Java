class Solution {
    public int solution(int chicken) {
        int answer = serviceChicken(chicken, 0);
        return answer;
    }
    static int serviceChicken(int coupon, int chickenCount){
        while (coupon >= 10) {
            chickenCount += coupon / 10;
            coupon = (coupon % 10) + (coupon / 10);
            return  serviceChicken(coupon, chickenCount);
        }
        return chickenCount;
    }
}