//Space Complexity:O(1)
//Time Complexity:O(n)
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int rsum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            rsum=Math.max(nums[i],rsum+nums[i]);
            max=Math.max(max,rsum);
        }
        return max;
    }
    public static void main(String args[]){
        MaximumSubArray obj=new MaximumSubArray();
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("answer: "+obj.maxSubArray(nums));

    }
}
