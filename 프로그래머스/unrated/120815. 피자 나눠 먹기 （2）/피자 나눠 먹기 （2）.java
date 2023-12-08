class Solution {
    public int solution(int n) {
        int pizza_count = 1;
        while ((pizza_count * 6) % n != 0) {
            pizza_count++;
        }
        return pizza_count;
    }
}