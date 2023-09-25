class Solution {
    public String solution(String code) {
        
        int mode =0;
        String result= "";

        for( int i = 0; i<code.length(); i++)
        {
            if(mode == 0)
            {
                if(String.valueOf(code.charAt(i)).equals("1"))
                {
                    mode = 1;
                }
                else{
                    result = i%2 == 0 ? result + code.charAt(i) : result;
                }

            }else if(mode == 1)
            {
                if(String.valueOf(code.charAt(i)).equals("1"))
                {
                    mode = 0;
                }
                else{
                    result = i%2 == 1 ? result + code.charAt(i) : result;
                }
            }
        }


        result = result.equals("") ? result + "EMPTY" : result;
        
        
        return result;
    }
}