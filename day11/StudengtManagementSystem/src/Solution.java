import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums={0,1,2,4,5,7};
        System.out.println(new Solution().summaryRanges(nums));

    }
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int leng=nums.length;
        int i=0;
        while (i<leng) {
            int start = nums[i];
            while (i < leng - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            int end = nums[i];
            if (start == end) {
                list.add(start + "");
            } else {
                list.add(start + "->" + end);
            }
            i++;
        }
        return list;
    }
    public List<String> summaryRanges1(int[] nums) {
        List<String> list=new ArrayList<>();
        int i=0;
        for (int j = 0; j <nums.length ; j++) {
            if(j+1==nums.length||nums[j]+1!=nums[j+1]){
                StringBuilder sb=new StringBuilder();
                sb.append(nums[i]);
                if(i!=j){
                    sb.append("->");
                    sb.append(nums[j]);
                }
                list.add(sb.toString());
                i=j+1;
            }

        }
        return list;
    }
}
