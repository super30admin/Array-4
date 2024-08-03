class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int total = 0;
        int n = nums.length;
        // for(int i = 0; i < n; i++) {
        //     if(i % 2 == 0) {
        //         total = total + nums[i];
        //     }
        // }

        for(int i = 0; i < n; i+= 2) {
            total = total + nums[i];
        }
        return total;
    }
}
