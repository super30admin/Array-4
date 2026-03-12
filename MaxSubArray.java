public class MaxSubArray {
    public static int maxSubArray(int[] nums){
        int currMax=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            currMax=Math.max(currMax+nums[i],nums[i]);
            max=Math.max(currMax,max);
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max sub array: " + maxSubArray(nums));
    }
}

//TC: O(N)
//SC: O(1)