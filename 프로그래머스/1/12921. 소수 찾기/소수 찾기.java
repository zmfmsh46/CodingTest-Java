class Solution {
    public int solution(int n) {
        int answer = eratos(n);
        
        return answer;
    }
    
    private int eratos(int n) {

        int count = 0;
        boolean[] list = new boolean[n + 1];
        list[0] = false;
        list[1] = false;
        for (int i = 2; i < list.length; i++) {
            list[i] = true;
        }

        for (int i = 2; i * i < list.length; i++) {
            if (list[i]) {
                for (int j = i * i; j < list.length; j += i) {
                    list[j] = false;
                }
            }
        }

        for (int i = 2; i < list.length; i++) {
            if (list[i]) {
                count++;
            }
        }

        return count;
    }
}