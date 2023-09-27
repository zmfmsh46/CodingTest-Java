class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int buffer;

        for (int[] query : queries)
        {
            buffer = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = buffer;
        }
        
        return arr;
    }
}