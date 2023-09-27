class Solution {
    public String solution(int[] numLog) {
        
        StringBuffer result = new StringBuffer();
        
        for (int i = 1; i<numLog.length; i++)
        {
            if (numLog[i] - numLog[i-1] == 1)
                result.append("w");
            else if (numLog[i] - numLog[i-1] == -1)
                result.append("s");
            else if (numLog[i] - numLog[i-1] == 10)
                result.append("d");
            else if (numLog[i] - numLog[i-1] == -10)
                result.append("a");

        }
        
        return result.toString();
    }
}