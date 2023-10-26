class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = cal_date(date1, date2, 0);
        return answer;
    }
    
    private int cal_date(int[] a, int[] b, int count) {
        while (count < a.length) {
            if (a[count] > b[count]) {
                return 0;
            } else if (a[count] == b[count]) {
                return cal_date(a, b, ++count);
            } else {
                return 1;
            }
        }
        return 0;
    }
}