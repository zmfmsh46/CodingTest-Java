import java.io.IOException;
import java.util.*;

class Solution {
    private int BUCKET_NUM = 10;
    
    public int[] solution(long n) {
        int[] answer = new int[(int) (Math.floor(Math.log10(Math.abs(n))) + 1)];
        int arr_index = 0;
        while (n != 0) {
            answer[arr_index] = (int) (n % 10);
            n /= 10;
            arr_index++;
        }
        return answer;
    }
    
    private void radix_sort(int[] arr) {
        //큐 10개 생성 (10진수)
        Queue<Integer>[] bucket = new LinkedList[BUCKET_NUM];
        for (int i = 0; i < BUCKET_NUM; i++) {
            bucket[i] = new LinkedList<>();
        }

        //배열 최댓값의 자릿수
        int maxLen = maxDigitCount(arr);
        //각 자릿수 숫자 저장.
        int digitNumber = 0;
        //배열에 다시 저장할 때 필요한 변수.
        int arrIndex = 0;

        //자릿수만큼 반복.
        for (int i = 0; i < maxLen; i++) {
            //데이터의 개수만큼 반복.
            for (int j = 0; j < arr.length; j++) {
                digitNumber = getDigit(arr[j], i);

                bucket[digitNumber].add(arr[j]);
            }

            //버킷에 들어간 데이터를 순서대로 꺼내 배열에 덮어씌움.
            for (int j = 0; j < BUCKET_NUM; j++) {
                while (!bucket[j].isEmpty()) {
                    arr[arrIndex++] = bucket[j].remove();
                }
            }

            arrIndex = 0;
        }

    }

    //숫자의 해당 자릿수 반환.
    //Ex) getDigit(123,0) -> 일의 자리수 : 3 반환.
    private int getDigit(int num, int index) {

        return (int) Math.floor(Math.abs(num) / Math.pow(10, index)) % 10;
    }

    private int maxDigitCount(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, digitCount(arr[i]));
        }

        return max;
    }

    private int digitCount(int num) {
        if (num == 0) {
            return 1;
        }
        //log10을 하면 자리수가 나옴.
        //Ex) log10(10) -> 1
        //Math.abs : 절댓값, Math.floor : 내림
        return (int) (Math.floor(Math.log10(Math.abs(num))) + 1);
    }
}