
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// 1) Running Sum and max so far
// 2) Running sum would be initial number
// 3) Iterate over, calculate new sum running sum + current eleemnt
// 4) Take max and assign to running sum
// 5) Then take max of max and running sum and assign to max
// 6) Return max

public int MaxSubArray(int[] nums) {
        
    if(nums == null || nums.Length == 0)
        return 0;
    
    //default running sum and max to first element
    int rSum = nums[0];
    int max = nums[0];
    
    int start = 0, end = 0, currStart = 0;
    for(int i = 1; i < nums.Length; i++)
    {
        //get current sum by adding running sum and current element
        int currSum = rSum + nums[i];            
        
        if(nums[i] < currSum)
            rSum = currSum;
        else
        {
            rSum = nums[i];
            currStart = i;
        }
        //take max of current element or current sum so far
        //rSum = Math.Max(currSum,nums[i]);                  
        if(max < rSum)
        {
            
            //take max of max and running sum
            //max = Math.Max(max, rSum);
            max = rSum;
            start = currStart;
            end = i;
        }
    }
    Console.WriteLine("Start Index: " + start + ", End Index:" + end);
    return max;
}