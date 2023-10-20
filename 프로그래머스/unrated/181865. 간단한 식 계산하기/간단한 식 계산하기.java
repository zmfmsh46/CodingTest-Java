class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] binomial_split = binomial.split(" ");

        if(binomial_split[1].equals("+")){
            answer = Integer.parseInt(binomial_split[0]) + Integer.parseInt(binomial_split[2]);
        } else if (binomial_split[1].equals("-")) {
            answer = Integer.parseInt(binomial_split[0]) - Integer.parseInt(binomial_split[2]);
        } else if (binomial_split[1].equals("*")) {
            answer = Integer.parseInt(binomial_split[0]) * Integer.parseInt(binomial_split[2]);
        }
        return answer;
    }
}