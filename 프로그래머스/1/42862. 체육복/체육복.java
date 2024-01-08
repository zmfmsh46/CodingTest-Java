import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Integer> lost_student = new ArrayList<>();
        ArrayList<Integer> common_buffer = new ArrayList<>();
        for (int student : lost) {
            lost_student.add(student);
            common_buffer.add(student);
        }
        ArrayList<Integer> reserve_student = new ArrayList<>();
        for (int student : reserve) {
            reserve_student.add(student);
        }
        common_buffer.retainAll(reserve_student);
        lost_student.removeAll(common_buffer);
        reserve_student.removeAll(common_buffer);
        Arrays.sort(lost);

        for (int student : lost) {
            if (reserve_student.contains(student - 1)) {
                reserve_student.remove( (Object) (student - 1));
                lost_student.remove((Object) student);
            } else if (reserve_student.contains(student + 1)) {
                reserve_student.remove((Object) (student + 1));
                lost_student.remove((Object) student);
            }
        }

        answer = n - lost_student.size();
        return answer;
    }
}