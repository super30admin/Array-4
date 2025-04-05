class Solution {
    public int arrayPairSum(int[] nums) {
        
        int result =0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i=i+2) {
            result = nums[i] + result;
        }

        return result;
    }
}



class Solution {
    public int maxSubArray(int[] nums) {
        int max =nums[0];
        int rsum =nums[0];
        int start=0;
        int end=0;
        for (int i=1;i<nums.length;i++) {
            if (rsum + nums[i] >= nums[i]) {
                rsum = rsum + nums[i];
            } else if (nums[i] > rsum + nums[i]) {
                rsum = nums[i];
                start=i;
            }
            if(rsum > max) {
                max=rsum;
                end=i;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return max;
    }
}
