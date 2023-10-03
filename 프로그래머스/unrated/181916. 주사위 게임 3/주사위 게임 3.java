class Solution {
    public int solution(int a, int b, int c, int d) {
    
        int[] abcd = {a, b, c, d};
        int[] dice = new int[6];
        int p = 0, q = 0;
        int sum;
        String distinct_dice = "";

        for(int n : abcd)
        {
            dice[n-1]++;
            if(!distinct_dice.contains(String.valueOf(n))){
                distinct_dice += String.valueOf(n);
            }
        }

        if(distinct_dice.length() == 1)
        {
            sum = 1111* Integer.valueOf(distinct_dice);
            System.out.println(sum);
            return sum;
        } else if (distinct_dice.length() == 2) {
            for(Character ch : distinct_dice.toCharArray())
            {
                if(dice[Character.getNumericValue(ch) - 1] == 3){
                    p = Character.getNumericValue(ch);
                } else if (dice[Character.getNumericValue(ch) - 1] == 2) {
                    p = Character.getNumericValue(distinct_dice.charAt(0));
                    q = Character.getNumericValue(distinct_dice.charAt(1));
                    sum = (p + q) * (int) Math.abs(p - q);
                    System.out.println(sum);
                    return sum;
                } else if (dice[Character.getNumericValue(ch) - 1] == 1) {
                    q = Character.getNumericValue(ch);
                }
            }
            sum = (int) Math.pow(10 * p + q, 2);
            System.out.println(sum);
            return sum;
        } else if (distinct_dice.length() == 3) {
            sum = 1;
            for(Character ch : distinct_dice.toCharArray())
            {
                if (dice[Character.getNumericValue(ch) - 1] == 1) {
                    sum *= Character.getNumericValue(ch);
                }
            }
            System.out.println(sum);
            return sum;
        }else {
            sum = Character.getNumericValue(distinct_dice.charAt(0));
            for(Character ch : distinct_dice.toCharArray())
            {
                sum = Math.min(sum, Character.getNumericValue(ch));
            }
            System.out.println(sum);
            return sum;
        }
        

    }
}