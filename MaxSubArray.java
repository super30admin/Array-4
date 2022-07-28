// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            int num = nums[i];

            current = Math.max(num, current+num);
            max = Math.max(max,current);
            //System.out.println(max);
        }

        return max;
    }

    public static void main(String [] args){
        MaxSubArray msa = new MaxSubArray();
        System.out.println(msa.maxSubArray(new int[]{5,4,-1,7,8}));
    }
}