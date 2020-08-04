// Time complexity: O(n)
// Space Complexity: O(1)

// Approach: just to find the max sum

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int globalSum = nums[0]; int localSum = nums[0];

        for(int i = 1 ; i<nums.length ; i++){ // i = 1 for a single element
            localSum = Math.max(localSum + nums[i], nums[i]);
            globalSum = Math.max(localSum, globalSum);
        }

        return globalSum;
    }
}

// Approach to find the starting and ending index of the maximum subarray

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int max = Integer.MIN_VALUE;
        int start = 0 ; int end = 0;
        int k = 0; // k represents the starting of the current running contiguous array
        int rSum = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            rSum = rSum + nums[i];

            if(rSum < nums[i]){
                k = i;
                rSum = nums[i];
            }

            // checking if the global max has changed
            if(max < rSum){
                max = rSum;
                start = k;
                end = i;
            }

        }

        System.out.println(start);
        System.out.println(end);

        return max;
    }
}
