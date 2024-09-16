/*

https://leetcode.com/problems/array-partition-i/
Did it run on leetcode: Yes
Did you face any problem: No

Time Complexity: 0(NLogN+N)
Space Compelxity: 0(1)

Algorithm:
- sort the array
- Make the pairs with the minimum numbers
- add evry alternate element


*/


class Solution {
    public int arrayPairSum(int[] nums) {
        
        if(nums.length==2){
            return nums[0];
        }
        
        Arrays.sort(nums);
        int sum =0;
        for(int i=0;i<nums.length-1;i+=2){
            sum += nums[i];
        }
        
        return sum;
    }
}