class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuffer stringBuffer = new StringBuffer();
        
        for (int n : index_list)
        {
            stringBuffer.append(my_string.charAt(n));
        }
        
        return stringBuffer.toString();
    }
}