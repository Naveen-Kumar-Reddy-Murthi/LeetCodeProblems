package org.mnr.interview.goldmansachs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinDiffOfTimeSeries {
    public static void main(String[] args) {
        /*
            Q1) Given a list of time series in HH:MM format. Find the minimum time difference in minutes among the series

            [01:59, 03:00, 20:40, 22:45, 05:10, 14:55, 21:50, 22:30, 13:00]

            [01:59, 21:50, 22:30] = [119, 240,280,520, 1390, 1400]

            Min: 15
            o(n)+o(nlogn)+o(n)
            o(n)+o(nlogn)
            */
        List<String> values = new ArrayList<>();
        values.add("01:59");
        values.add("03:00");
        values.add("20:40");
        values.add("14:55");
        values.add("22:45");
        values.add("05:10");
        values.add("21:50");
        values.add("22:30");
        values.add("13:00");

        System.out.println(getMinDifference(values));
    }

    public static int getMinDifference(List<String> values){

        List<Integer> intValues = new ArrayList<>();

        for(String val : values){
            String[] timeValues = val.split(":");
             // int hoursToMins = Integer.parseInt(timeValues[0])*60;
            //int mins = Integer.parseInt(timeValues[1]);
            intValues.add( (Integer.parseInt(timeValues[0])*60) + Integer.parseInt(timeValues[1]));
        }
        System.out.println(intValues);
        Collections.sort(intValues);
        System.out.println(intValues);

        int minDiff = Integer.MAX_VALUE;
        for(int i=1;i<intValues.size();i++){
            int curDiff = intValues.get(i)- intValues.get(i-1);
            minDiff = Math.min(curDiff, minDiff);
        }
        return minDiff;

    }

}
