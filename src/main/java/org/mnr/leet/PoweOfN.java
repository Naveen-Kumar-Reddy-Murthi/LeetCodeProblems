package org.mnr.leet;

public class PoweOfN {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(3));
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(9));
    }

    public static boolean isPowerOfThree(int n) {
        while( n >= 3)
        {
            if( n%3 != 0)
                return false;
            n = n/3;
        }
        return n == 1;

    }
}
