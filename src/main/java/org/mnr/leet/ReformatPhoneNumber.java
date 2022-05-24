package org.mnr.leet;

public class ReformatPhoneNumber {

    public static void main(String[] args) {

        System.out.println(reFormat("+12345678900"));
        System.out.println(reFormat("+919999999999"));
        System.out.println(reFormat("9999999999"));
        System.out.println(reFormat("0000000000"));
        System.out.println(reFormat("+0000000000"));
        System.out.println(reFormat("10000000000"));

    }

    public static String reFormat(String phoneNo){
        StringBuilder sb = new StringBuilder(phoneNo.substring(phoneNo.length()-10));
        sb.insert(3, "-").insert(7, "-");
        System.out.println(sb.toString());

        return sb.toString();
    }
}
