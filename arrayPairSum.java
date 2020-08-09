//Time complexity : O(nlogn);
//Space Complexity : O(1);
//Leetcode : Passed all test cases



class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums== null || nums.length == 0) return 0;
        int sum = 0;
        Arrays.sort(nums);
        for(int i = nums.length-1; i>=0; i = i-2){
            sum += Math.min(nums[i],nums[i-1]);
            System.out.println(sum);
        }
        
        return sum;
    }
}