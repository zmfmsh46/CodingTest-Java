class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = cal_date(date1, date2, 0);
        return answer;
    }
    
    private int cal_date(int[] a, int[] b, int index) {
        while (index < a.length) {
            if (a[index] > b[index]) {
                return 0;
            } else if (a[index] == b[index]) {
                return cal_date(a, b, ++index);
            } else {
                return 1;
            }
        }
        return 0;
    }
}