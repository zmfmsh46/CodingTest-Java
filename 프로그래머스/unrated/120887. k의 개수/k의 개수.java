class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        for (int n = i; n <= j; n++) {
            String buffer = String.valueOf(n);
            while (buffer.indexOf(String.valueOf(k)) != -1) {
                count++;
                buffer = buffer.substring(buffer.indexOf(String.valueOf(k))+1);
            }
        }
        return count;
    }
}