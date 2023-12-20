class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        StringBuilder stringBuilder = new StringBuilder();
        String hamburger = "1231";

        for (int id : ingredient) {
            stringBuilder.append(id);
        }

        int idx = stringBuilder.indexOf(hamburger);
        while (idx != -1) {
            if (idx < 2) {
                stringBuilder.delete(0, 4);
                answer++;
                idx = stringBuilder.indexOf(hamburger);
            } else {
                stringBuilder.delete(idx, idx + 4);
                answer++;
                idx = stringBuilder.indexOf(hamburger, idx - 2);
            }
        }
        return answer;
    }
}