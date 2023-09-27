class Solution {
    public int solution(int n, String control) {
        for (Character c : control.toCharArray())
        {
            if (c == 'w')
                n++;
            else if (c == 's')
                n--;
            else if (c == 'd')
                n += 10;
            else if (c == 'a')
                n -= 10;
            else
            {
                System.out.println("InputError > control : " + control);
            }
        }
        
        return n;
    }
}