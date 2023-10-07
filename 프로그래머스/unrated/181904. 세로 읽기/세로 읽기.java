class Solution {
    public String solution(String my_string, int m, int c) {
        int row = my_string.length() % m == 0 ? my_string.length() / m : (my_string.length() / m) + 1;
        int index;
        StringBuffer result =new StringBuffer();

        for(int i = 0; i< row; i++)
        {
            index = (c + m * i) - 1;
            if(index < my_string.length()) {
                result.append(my_string.charAt(index));
            }
        }
        
        return result.toString();
    }
}