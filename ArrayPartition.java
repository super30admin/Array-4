// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        //sort the array to pairs with minimum difference between numbers in pair
        Arrays.sort(nums);
        int sum = 0;
        //take sum by adding all odd numbers
        for(int i=0;i<nums.length;i+=2){
            sum += nums[i];
        }
        return sum;
    }
}