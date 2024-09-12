class Solution {
    public int arrayPairSum(int[] nums) {

        //O(1) time O(nlogn) time

        Arrays.sort(nums);

        int sum = 0;
        for (int i=0; i<nums.length; i=i+2) {

            sum += nums[i];

        }

        return sum;

    }
}