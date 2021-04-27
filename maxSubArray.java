//TC: O(n)
//SC: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];      //Doing a choose and don't choose kind of solution
        for(int i=1;i<nums.length;i++)
        {                       //using a sum variable to keep track sum of the elements at each travers
            sum +=nums[i];      //using max variable to track max sum at each point.
            if(sum<nums[i])     //returning max value 
                sum = nums[i];
            if(max<sum)
                max = sum;
        }
        
        return max;
    }
}