import java.math.BigDecimal;
import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        BigDecimal a, b;
        //기울기 구하기 : x값의 증가량 / y값의 증가량
        a = div(dots[0][0],dots[0][1],dots[1][0],dots[1][1]);
        b = div(dots[2][0],dots[2][1],dots[3][0],dots[3][1]);
        if(Objects.equals(a, b))
            answer = 1;
        a = div(dots[0][0],dots[0][1],dots[2][0],dots[2][1]);
        b = div(dots[1][0],dots[1][1],dots[3][0],dots[3][1]);
        if(Objects.equals(a, b))
            answer = 1;
        a = div(dots[0][0],dots[0][1],dots[3][0],dots[3][1]);
        b = div(dots[1][0],dots[1][1],dots[2][0],dots[2][1]);
        if(Objects.equals(a, b))
            answer = 1;
        return answer;
    }
    private static BigDecimal div(int aForX, int aForY, int bForX, int bForY){
        BigDecimal result;
        BigDecimal a = new BigDecimal(aForX - bForX);
        BigDecimal b = new BigDecimal(aForY - bForY);
        try {
            result = a.divide(b);
        } catch (Exception e) {
            result = a.divide(b, 10, BigDecimal.ROUND_DOWN);
        }
        return result;
    }
}