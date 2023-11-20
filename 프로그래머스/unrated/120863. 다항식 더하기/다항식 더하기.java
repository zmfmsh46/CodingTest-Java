import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int coefficientX = 0;
        int constant = 0;
        ArrayList<String> polynomialArray = new ArrayList<>(List.of(polynomial.replaceAll("\\+", "").split(" ")));
        polynomialArray.removeAll(Arrays.asList("", null));
        for(String s : polynomialArray){
            if(s.endsWith("x")){
                s = s.replace("x", "");
                coefficientX += s.isEmpty() ? 1 : Integer.parseInt(s);
            } else {
                constant += Integer.parseInt(s);
            }
        }

        if(coefficientX == 0 && constant != 0){
            answer = String.valueOf(constant);
        } else if (coefficientX != 0 && constant == 0) {
            answer = coefficientX == 1 ? "x" : coefficientX + "x";
        } else if (coefficientX == 0 && constant == 0) {
            answer = "";
        } else {
            answer = coefficientX == 1 ? "x + " + constant : coefficientX + "x + " + constant;
        }
        return answer;
    }
}