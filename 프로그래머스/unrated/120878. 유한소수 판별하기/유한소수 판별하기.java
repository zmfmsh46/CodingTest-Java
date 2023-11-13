import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer;

        ArrayList<Integer> numerator = Factorization(a);
        ArrayList<Integer> denominator = Factorization(b);

        for (Integer n : numerator) {
            denominator.remove(n);
        }
        denominator.removeAll(List.of(2,5));

        answer = denominator.isEmpty() ? 1 : 2;
        return answer;
    }
    
    private ArrayList<Integer> Factorization(int num) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        //어떤 N이 두 개이상 곱셈(인수)으로 나타낼 수 있을 때 인수 중 한 개 이상은 반드시 √N보다 작거나 같다는 점을 이용.
        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                arrayList.add(i);
                num /= i;
            }
        }

        if (num != 1) {
            arrayList.add(num);
        }

        return arrayList;
    }
}