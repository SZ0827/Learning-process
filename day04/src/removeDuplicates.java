public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums={1,2,0};
        System.out.println(new removeDuplicates().deleteDuplicates(nums));

    }
    public int deleteDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int fast=1,slow=1;
        while(fast<n){
            if(nums[fast]!=nums[fast-1]){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        for(int i=0;i<slow;i++){
            System.out.println(nums[i]);
        }
        return slow;
    }
}
