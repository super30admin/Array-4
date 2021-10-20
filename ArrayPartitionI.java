/***
Leet Code- 561
Time Complexity-O(n log n)
Space Complexity-O(1)
**/
class Solution {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        //O(nlogn)
        Arrays.sort(nums);
        
        //O(n/2)
        //pairs so increment by 2 to get to the next pair
        for(int i=0;i<nums.length;i=i+2)
        {
            sum += nums[i];
        }
        return sum;
    }
}