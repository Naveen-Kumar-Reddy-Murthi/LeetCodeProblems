package org.mnr.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestAverageScore {
    public static void main(String[] args) {
        System.out.println(highestAverage(new String[][]{{"Bob", "87"},
                                                         {"Mike", "35"},
                                                         {"Bob", "52"},
                                                         {"Jason", "35"},
                                                         {"Mike", "55"},
                                                         {"Jessica", "99"}}));
    }

    public static int highestAverage(String[][] students) {
        if(students == null || students.length ==0){
            return -1;
        }
        int high = 0;
        Map<String, List<Integer>> scoreMap = new HashMap<>();

        for(int i = 0; i < students.length; i++){
            List<Integer> currentScore = scoreMap.get(students[i][0]);

            if(currentScore == null){
                List<Integer> scoreList = new ArrayList<>();
                scoreList.add(Integer.valueOf(students[i][1]));
                scoreMap.put(students[i][0],scoreList);
            } else{
                currentScore.add(Integer.valueOf(students[i][1]));
                scoreMap.put(students[i][0], currentScore);
            }

            for(Map.Entry<String, List<Integer>> entry: scoreMap.entrySet()){
                int currAvgScore = findAvg(entry.getValue());
                high = Math.max(high, currAvgScore);
            }


        }

      return high;
    }

    private static int findAvg(List<Integer> list){

        int sum = 0;
        int length = list.size();
        for(int i : list){
            sum += i;
        }
        return (int) (sum/length);
    }
}
