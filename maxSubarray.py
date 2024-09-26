class Solution:
    
    """
    Description: find contiguous subarray (have atleast one number) which has largest sum
    
    Time Complexity: O(n)
    Space Complexity: O(1) 
    
    Approach: (with option to extract the subarray with maximum sum)
    1. start a running sum and maximum sum from first element of the array
    2. declear a local starting index for the subarray
    3. loop through the length of the subarray by updating indices based on whiever of the sum are greather than the other
    4. return the maximum sum, array indices at the end
    """
    
    def maxSubArray(self, nums: List[int]) -> int:
        
        if len(nums) == 0 or nums == None: return 0
        
        start = 0; end = 0
        rSum = nums[0]
        mSum = nums[0]
        currStart = 0
        
        for i in range(1, len(nums)):
            rSum = rSum + nums[i]
            if rSum < nums[i]:
                rSum = nums[i]
                currStart = i
            if mSum < rSum: 
                mSum = rSum
                start = currStart
                end = i
        # print(nums[currStart:end + 1])
            
        return mSum
