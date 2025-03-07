package com.sz.demo;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome2(123));
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp = x;
        int sum = 0;
        while(temp>0){
            sum=sum*10+temp%10;
            temp=temp/10;
        }
        if(sum==x)
            return true;
        return false;
    }
    public static boolean isPalindrome2(int x) {
        if(x<0){
            return false;
        }
        String oldstr=""+x;
        String newstr=new StringBuilder(""+x).reverse().toString();
        return oldstr.equals(newstr);
    }
}
