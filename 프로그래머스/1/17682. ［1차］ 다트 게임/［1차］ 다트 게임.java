class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] shoot_dart = new String[3];
        int[] score = new int[3];

        int last_index = 0;
        for (int i = 0; i < shoot_dart.length - 1; i++) {
            for (int j = 2; j < dartResult.length(); j++) {
                if (Character.isDigit(dartResult.charAt(j))) {
                    last_index = j;
                    shoot_dart[i] = dartResult.substring(0, last_index);
                    dartResult = dartResult.substring(last_index);
                    break;
                }
            }
        }
        shoot_dart[2] = dartResult;
        
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < shoot_dart[i].length(); j++) {
                if (shoot_dart[i].charAt(j) == 'S') {
                    score[i] = Integer.parseInt(shoot_dart[i].substring(0, j));
                } else if (shoot_dart[i].charAt(j) == 'D') {
                    score[i] = (int) Math.pow(Integer.parseInt(shoot_dart[i].substring(0, j)), 2);
                } else if (shoot_dart[i].charAt(j) == 'T') {
                    score[i] = (int) Math.pow(Integer.parseInt(shoot_dart[i].substring(0, j)), 3);
                } else if (shoot_dart[i].charAt(j) == '*') {
                    score[i] *= 2;
                    if (i != 0) {
                        score[i-1] *= 2;
                    }
                } else if (shoot_dart[i].charAt(j) == '#') {
                    score[i] *= -1;
                }
            }
        }

        answer = score[0] + score[1] + score[2];
        return answer;
    }
}