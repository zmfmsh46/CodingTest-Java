import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int numerator = numer1 * denom2 + numer2 * denom1;
        int denominator = denom1 * denom2;

        int gdc = GDC(numerator, denominator);
        answer[0] = numerator / gdc;
        answer[1] = denominator / gdc;
        return answer;
    }
    
    private static int GDC(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}