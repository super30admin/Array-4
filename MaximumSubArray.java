//Time Complexity=O(n)
//Space Complexity=O(1)
public class MaximumSubArray {

    public int maxSubArray(int[] nums) {

        int rsum=nums[0];
        int max=nums[0];
        int start=0;int end=0;
        for(int i=1;i<nums.length;i++){

            if(nums[i]>rsum+nums[i]){
                rsum=nums[i];
                start=i;
            }else{
                rsum+=nums[i];
            }
            if(max<rsum){
                end=i;
            }
            max=Math.max(max,rsum);
        }
        System.out.println(start+" "+end);
        return max;
    }
}
