class Solution:
    
    # Runnig Sum Approach
    # TC: O(N)
    # SC: O(1)
    
    def maxSubArray(self, nums: List[int]) -> int:
        
        if (len(nums) == 0 or nums == None):
            return 0
        
        maximum = None
        runningSum = 0
        n = len(nums)
        
        # For Follow up --> Print the subarray
        start = 0
        end = 0
        
        currSum = 0
        
        for i in range(n):
            currSum = runningSum + nums[i]
            
            if (i == 0 or currSum > nums[i]):
                runningSum = currSum
            else:
                runningSum = nums[i]
                currSum = 0
                start = i
                
            if (maximum == None or maximum < runningSum):
                maximum = runningSum
                end = i
        
        print(nums[start:end+1]) # Follow up --> Print the subarray
        return maximum