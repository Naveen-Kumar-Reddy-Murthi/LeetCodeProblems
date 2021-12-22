package org.mnr.leet.intotoroman;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    /**
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * <p>
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     * <p>
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given an integer, convert it to a roman numeral.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: num = 3
     * Output: "III"
     * Example 2:
     * <p>
     * Input: num = 4
     * Output: "IV"
     * Example 3:
     * <p>
     * Input: num = 9
     * Output: "IX"
     * Example 4:
     * <p>
     * Input: num = 58
     * Output: "LVIII"
     * Explanation: L = 50, V = 5, III = 3.
     * Example 5:
     * <p>
     * Input: num = 1994
     * Output: "MCMXCIV"
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= num <= 3999
     */
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.intToRoman(1));
        System.out.println(sol.intToRoman(2));
        System.out.println(sol.intToRoman(3));
        System.out.println(sol.intToRoman(4));
        System.out.println(sol.intToRoman(5));
        System.out.println(sol.intToRoman(9));
        System.out.println(sol.intToRoman(10));
        System.out.println(sol.intToRoman(40));
        System.out.println(sol.intToRoman(50));
        System.out.println(sol.intToRoman(58));
        System.out.println(sol.intToRoman(1994));
        System.out.println(sol.intToRoman(400));
        System.out.println(sol.intToRoman(500));
        System.out.println(sol.intToRoman(900));
        System.out.println(sol.intToRoman(1000));
        System.out.println(sol.intToRoman(2000));
    }

    private static Map<String, Integer> ROMAN = new LinkedHashMap<String, Integer>() {{
        put("M", 1000);
        put("CM", 900);
        put("D", 500);
        put("CD", 400);
        put("C", 100);
        put("XC", 90);
        put("L", 50);
        put("XL", 40);
        put("X", 10);
        put("IX", 9);
        put("V", 5);
        put("IV", 4);
        put("I", 1);
    }};


    private String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        for (Map.Entry<String, Integer> entry : ROMAN.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            while (num / value > 0) {
                Integer.MAX_VALUE
                res.append(new String(new char[num / value]).replace("\0", key));
                num = num % value;
            }
        }
        return res.toString();
    }
}
