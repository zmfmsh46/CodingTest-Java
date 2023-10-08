class Solution {
    public String solution(String my_string, int[] indices) {
        char[] result = my_string.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = '\u0000';
        }
        for(int i = 0; i< result.length; i++)
        {
            if(result[i] != '\u0000')
            {
                stringBuffer.append(result[i]);
            }
        }
        return stringBuffer.toString();
    }
}