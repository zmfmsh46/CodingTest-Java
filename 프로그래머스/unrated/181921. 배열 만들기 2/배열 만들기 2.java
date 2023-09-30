import java.util.ArrayList;

class Solution {
    public static int value, index = 0;
    
    public int[] solution(int l, int r) {
        
        int count = String.valueOf(r).length(); //r의 자리수
        int element;
        String binary_num;
        int[] result;
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < Math.pow(2,count); i++) // r이 세자리일때 : 000, 001, 010, 011, 100, 101, 110, 111
        {
            binary_num = String.format("%0"+count+"d",Integer.parseInt(Integer.toBinaryString(i)));
            element = calc_element(binary_num, count-1);

            if(element >= l && element <= r)
                answer.add(element);

            value = 0;
        }
        result = answer.isEmpty() ? new int[]{-1} : answer.stream().mapToInt(Integer::intValue).toArray();
        
        return result;
    }
    
    private static int calc_element(String binary_num, int count){

        value += binary_num.charAt(index++) == '1' ? (5 * (int) Math.pow(10,count)) : 0;

        if(count == 0)
        {
            index = 0;
            return value;
        }
        return calc_element(binary_num, count - 1);
    }
}