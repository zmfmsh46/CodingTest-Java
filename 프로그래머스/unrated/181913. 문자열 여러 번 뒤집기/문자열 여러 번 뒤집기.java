class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder stringBuilder = new StringBuilder(my_string);
        char buffer;

        for(int[] query : queries)
        {
            int i = query[0], j = query[1];
            while (i<j)
            {
                buffer = stringBuilder.charAt(i);
                stringBuilder.setCharAt(i++,stringBuilder.charAt(j));
                stringBuilder.setCharAt(j--,buffer);
            }
        }

        return stringBuilder.toString();
    }
}