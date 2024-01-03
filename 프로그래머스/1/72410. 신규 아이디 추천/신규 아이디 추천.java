class Solution {
    public String solution(String new_id) {
        //level_1 모든 대문자를 대응되는 소문자로 치환
        new_id = new_id.toLowerCase();
        //level_2 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9\\-\\_\\.]","");
        //level_3 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }
        //level_4 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거
        if (!new_id.isEmpty() && new_id.charAt(0) == '.') {
            new_id = new_id.replaceFirst(".", "");
        }
        if (!new_id.isEmpty() && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        //level_5 new_id가 빈 문자열이라면, new_id에 "a"를 대입
        if (new_id.isEmpty()) {
            new_id = "a";
        }
        //level_6 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거, 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        //level_7 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙
        while (new_id.length() <= 2) {
            new_id += new_id.charAt(new_id.length() - 1);
        }
        return new_id;
    }
}