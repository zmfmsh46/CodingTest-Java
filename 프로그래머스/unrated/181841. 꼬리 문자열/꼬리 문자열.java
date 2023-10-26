class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : str_list) {
            if (!str.contains(ex)) {
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }
}