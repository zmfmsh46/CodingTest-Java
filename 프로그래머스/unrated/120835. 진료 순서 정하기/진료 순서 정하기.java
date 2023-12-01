import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] emergencyBuffer = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(emergencyBuffer);
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int degree = emergency.length;
        
        for (int i = 0; i < emergency.length; i++) {
            map.put(emergencyBuffer[i], degree--);
        }

        for(int emergencyValue : emergency){
            arrayList.add(map.get(emergencyValue));
        }

        
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}