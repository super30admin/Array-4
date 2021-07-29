// Time - O(nlogn)
// Space - O(1)



class Solution {
    public int arrayPairSum(int[] nums) {

        if(nums == null || nums.length == 0) return 0;

        Arrays.sort(nums); // sort the array as it provides minimum difference between numbers and easy to find the smallest among neighboring 2
        int sum = 0;
        for(int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i]; // first element would be the smallest; iterate every 2 elements
        }

        return sum;

    }
}