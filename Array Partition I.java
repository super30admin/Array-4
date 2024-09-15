//Time Complexity : O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int sum=0;
        //sort the array to get the best possible pairing
        Arrays.sort(nums);
        //Now in every pair will be in a way where a number is the immediate lesser or greater number 
        //iterate through the array by 2 to get the minimum number.i.e, the min number in each pair will the first number
        for(int i=0;i<nums.length;i+=2){
            sum += nums[i];
        }
        return sum;
      }
  }