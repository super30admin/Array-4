
//Time Complexity: O(n log n) due to sorting
//Space Complexity: O(1) 

//The question is to maximize the sum of the minimums of pairs formed from the array elements.

//The optimal strategy is to sort the array and pair adjacent elements together.
//This ensures that the minimum of each pair is as large as possible, leading to the maximum sum of these minimums.
//We sort the array and then iterate through it, summing up every second element (the minimum of each pair).

class Solution {
    public int arrayPairSum(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            res+=nums[i];
        }
        return res;
    }
}