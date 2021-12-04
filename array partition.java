//Time complexity:- O(nlogn).
//space complexity:- O(1);
//Did it run on leetcode:- Yes.
//Your approach with code :- When you observe the given testcases and hints you can understand that for getting maximum of sum of partition 
//you need to pair minimum elements first so for that i sorted the array and calculated total linearly.

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int total=0;
        int i=0;
        int j=1;
        while(j<nums.length){
            int f=Math.min(nums[i],nums[j]);
             total=total+f;
            i=i+2;
            j=j+2;
        }
        return total;
    }
    
}