import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int lux = 0, luy = wallpaper[0].length() - 1, rdx = 0, rdy = 0;
        boolean trigger = false;

        for (int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].contains("#")){
                if(wallpaper[i].indexOf("#") < luy){
                    luy = wallpaper[i].indexOf("#");
                }
                if(wallpaper[i].lastIndexOf("#") > rdy){
                    rdy = wallpaper[i].lastIndexOf("#");
                }
                if(!trigger){
                    lux = i;
                    rdx = i;
                    trigger = true;
                } else {
                    if (rdx < i) {
                        rdx = i;
                    }
                }
            }
        }

        answer = new int[]{lux, luy, rdx + 1, rdy + 1};
        return answer;
    }
}