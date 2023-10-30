class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 0;
        int min_i_index = 0, min_j_index =0, max_i_index = n - 1, max_j_index = n - 1;
        int i = 0, j = 0;
        int direction = 0;

        while (num < Math.pow(n,2)) {
            if (direction % 4 == 0) {
                if(j < max_j_index){
                    answer[i][j++] = ++num;
                }
                else if (j == max_j_index) {
                    answer[i++][j] = ++num;
                    min_i_index++;
                    direction++;
                }
            } else if (direction % 4 == 1) {
                if(i < max_i_index){
                    answer[i++][j] = ++num;
                }
                else if (i == max_i_index) {
                    answer[i][j--] = ++num;
                    max_j_index--;
                    direction++;
                }
            } else if (direction % 4 == 2) {
                if(j > min_j_index){
                    answer[i][j--] = ++num;
                }
                else if (j == min_j_index) {
                    answer[i--][j] = ++num;
                    max_i_index--;
                    direction++;
                }
            } else if (direction % 4 == 3) {
                if(i > min_i_index){
                    answer[i--][j] = ++num;
                }
                else if (i == min_i_index) {
                    answer[i][j++] = ++num;
                    min_j_index++;
                    direction++;
                }
            }
        }
        return answer;
    }
}