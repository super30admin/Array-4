//QUESTION: I took an OA and tried to use the second solution I have here but it did not pass all hidden test cases, however
//the first solution I posted right below did work for all test cases
//I am trying to figure out how the logic in both of them is different?

class Solution {
    public int maxSubArray(int[] nums) {

        //O(1) space and O(n) time
        if (nums.length < 1) {
            return 0;
        }

        int currMax = nums[0];
        int globalMax = nums[0];
        for (int i=1; i<nums.length; ++i) {
            if (currMax < 0){
                currMax = nums[i];
            } else{
                currMax += nums[i];
            }

            if (globalMax < currMax){
                globalMax = currMax;
            }
        }

        return globalMax;

    }
}

class Solution {
    public int maxSubArray(int[] nums) {

        //O(1) space and O(n) time
        int rSum = nums[0];
        int max = nums[0];

        for (int i=1; i<nums.length; i++) {

            rSum = Math.max(nums[i], rSum+nums[i]);
            max = Math.max(rSum, max);

        }

        return max;

    }
}