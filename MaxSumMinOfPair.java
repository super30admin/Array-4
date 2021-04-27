//TC: O(nlogn)+(n/2)
//SC: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);          //Sorting the array and selecting min of 2 consecutive numbers and adding all that will give the maximum sum of the pairs.
        int output = 0;
        for(int i=0;i<nums.length-1;i+=2)
        {
            output+=nums[i];
        }      
        return output;
    }
}