class Solution {
    public int solution(int n) {
        int num = 1;
        while (n >= factorial(num)) {
            num++;
        }
        return num-1;
    }
    private int factorial(int number) {
        int result = number--;
        while (number > 1) {
            result *= number;
            number--;
        }

        return result;
    }
}

