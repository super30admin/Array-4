/*

Did it run on leetcode: yes
Did you face any problem : No


Time Complexity: 0(N)
Space Compelxity: 0(1)

Algorithm:
- keep a track of current sum and global sum
- and at every index update global sum from current sum.
- if it any point you encounter negative number you make current sum=0


*/



class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length==1){
            return nums[0];
        }
        
        int max=Integer.MIN_VALUE;
        int maxTillHere = 0;
        
        for(int i=0;i<nums.length;++i){
            maxTillHere += nums[i];
            max = Math.max(maxTillHere,max);
            if(maxTillHere<0){
                maxTillHere = 0;
            }
        }
        
        return max;
        
    }
}