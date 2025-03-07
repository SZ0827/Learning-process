package com.sz;

public class Solution {
    public static void main(String[] args) {
        String test="((((([[[[[[)))))";
        System.out.println(isValid(test));
        System.out.println(isValid2(test));
    }
    public static boolean isValid(String s){
        if(s==null||s.length()%2!=0){
            return false;
        }
        //字符串转化为数组
        char[] chars=s.toCharArray();
        //定义一个存储字符的栈
        char[] stack=new char[chars.length];
        //初始化栈顶为-1
        int top=-1;
        //遍历数组
        for(char c:chars){
            if(c=='('||c=='{'||c=='['){
                stack[++top]=c;
            }else if (c==')'||c=='}'||c==']'){
                if(top==-1||!isPair(stack[top--],c)){
                    return false;
                }
            }
        }
        return top==-1;
    }
    public static boolean isValid2(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (isPair(leftChar, rightChar)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean isPair(char left,char right){
        return (left=='('&&right==')')||(left=='{'&&right=='}')||(left=='['&&right==']');

    }
}
