import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        //변수 선언
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> arrayNumlist = new ArrayList<>();
        int index;
        int binarySearchResult;
        //리스트 요소 추가
        for (int num : numlist) {
            arrayNumlist.add(num);
        }
        //정렬
        Collections.sort(arrayNumlist);

        for (int i = 0; i < numlist.length; i++) {
            //n과 가장 가까운 값의 인덱스 구하기
            if (n <= arrayNumlist.get(0)) {
                index = 0;
            } else if (n >= arrayNumlist.get(arrayNumlist.size() - 1)) {
                index = arrayNumlist.size() - 1;
            } else{
                binarySearchResult = Arrays.binarySearch(arrayNumlist.toArray(), n);
                int tempIndex = binarySearchResult >= 0 ? binarySearchResult : (binarySearchResult + 1) * -1;
                index = arrayNumlist.get(tempIndex) - n > n - arrayNumlist.get(tempIndex - 1) ? tempIndex - 1 : tempIndex;
            }
            
            answer.add(arrayNumlist.get(index));
            arrayNumlist.remove(index);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}