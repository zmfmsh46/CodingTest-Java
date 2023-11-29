class Solution {
    public int solution(int balls, int share) {
        long answer = 1l;

        /*큰 수의 팩토리얼 계산을 할 경우 수가 너무 커져서 오버플로우 발생.
        한번에 곱한 후 나누는 것이 아니라 아래와 같이 단계별로 계산하는 방법을 사용.
        28/3 와 같은 경우 무한 소수이기 때문에 부동소수점 문제가 발생하지만,
        n개의 연속된 정수에는 항상 n의 배수가 포함되기 때문에 항상 정수 값이 나와서 부동소수점 문제를 피할 수 있음.*/

        for (int i = 1; i <= share; i++) {
            answer = answer * balls-- / i;
        }
        
        return (int) answer;
    }
}