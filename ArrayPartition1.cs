
// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
	// 1) Sort the array
	// 2) Take pair of element starting from index 0
	// 3) Take minimum from each pair
	// 4) Then sum it

public int ArrayPairSum(int[] nums) {
    if(nums == null || nums.Length == 0)
        return 0;
    
    Array.Sort(nums);
    int sum = 0;
    for(int i = 0; i < nums.Length; i = i+2)
    {
        sum = sum + nums[i];
    }
    
    return sum;
}