public class RemoveElment {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int len=removeElement(nums,3);
        for(int i=0;i<len;i++){
            System.out.print(nums[i]+"\t");
        }
    }
    public static int removeElement(int[] nums,int val){
        int n=nums.length;
        int slow=0;
        for(int right=0;right<n;right++){
            if(nums[right]!=val){
                nums[slow]=nums[right];
                slow++;
            }

        }
            return slow;
    }

}
