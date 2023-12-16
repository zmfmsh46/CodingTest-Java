import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();

        String[] today_date = today.split("\\.");
        Map<String, Integer> privacyTerms = new HashMap<>();
        for (String term : terms) {
            String[] bf = term.split(" ");
            privacyTerms.put(bf[0], Integer.parseInt(bf[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] bf = privacies[i].split(" ");
            String[] contract_date = bf[0].split("\\.");
            int year = Integer.parseInt(contract_date[0]);
            int month = Integer.parseInt(contract_date[1]);
            int day = Integer.parseInt(contract_date[2]);
            String term = bf[1];
            if (privacyTerms.containsKey(term)) {
                int termPeriod_year = privacyTerms.get(term) / 12;
                int termPeriod_month = privacyTerms.get(term) % 12;
                year += termPeriod_year;
                month += termPeriod_month;
                if (month > 12) {
                    year++;
                    month = month % 12;
                }
                if (Integer.parseInt(today_date[0]) > year) {
                    answer.add(i + 1);
                } else if(Integer.parseInt(today_date[0]) == year){
                    if (Integer.parseInt(today_date[1]) > month) {
                        answer.add(i + 1);
                    } else if (Integer.parseInt(today_date[1]) == month) {
                        if (Integer.parseInt(today_date[2]) >= day) {
                            answer.add(i + 1);
                        }
                    }
                }
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}