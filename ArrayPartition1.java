//time complexity : O(nlong) n = number of buildings
//space complexity : O(1)

class Solution {
    public int arrayPairSum(int[] nums) {

        if(nums == null || nums.length == 0)
            return 0;

        int sum = 0;

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i=i+2) {
            sum+=nums[i];
        }

        return sum;

    }
}
