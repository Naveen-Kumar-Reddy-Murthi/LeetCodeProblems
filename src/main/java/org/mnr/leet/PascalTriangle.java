package org.mnr.leet;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        //https://leetcode.com/problems/pascals-triangle/
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result = new ArrayList<>();
       if(numRows == 0) {
           return result;
       }
        List<Integer> row = new ArrayList<>();
        for(int i=0; i<numRows;i++){
            row.add(0,1);
            for(int j=1;j<i;j++){
                row.set(j, row.get(j)+row.get(j+1));
            }
            result.add(new ArrayList<>(row));
        }
      return result;

    }

}
