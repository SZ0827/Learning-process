package com.sz;
//求数组的最长公共前缀
public class Alogister {
    public static void main(String[] args) {
        String [] strs={"flower","","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        //当数组不含元素时返回空字符串
        if(strs.length==0)
            return "";
        //获取数组长度
        int low= strs.length;
        //获取数组中第一个元素的长度
        int clo=strs[0].length();
        //以第一个元素长度为遍历次数
        for(int i=0;i<clo;i++){
            //分别遍历每个元素
            for(int j=1;j<low;j++){
                if(strs[j].length()==0||strs[j].charAt(i)!=strs[0].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
