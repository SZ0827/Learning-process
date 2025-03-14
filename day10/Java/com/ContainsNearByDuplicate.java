package Java.com;

import java.util.HashSet;
import java.util.Set;

public class ContainsNearByDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,1,1,2,3};
        System.out.println(new ContainsNearByDuplicate().containsNearbyDuplicate(nums,2));

    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> windows=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k){
                windows.remove(nums[i-k-1]);
            }
            if(!windows.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
