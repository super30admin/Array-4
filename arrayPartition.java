//Time Complexity:O(nlogn)
//SPace Complexity:O(1)
//Approach: First the input array is sorted, that means every element in the even indices will give me the minimum element of each pair. Hence I'll just add all the elements in the even indices and that will be the answer.
//This code was executed successfully and got accepted in leetcode.
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==2){
            return Math.min(nums[0],nums[1]);
        }
        if(nums.length<2){
            return 0;
        }
        int sum=0;
        for(int i=0;i<nums.length;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }
}