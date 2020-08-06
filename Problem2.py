# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

# Method 1) keeping track of sum of each element or element itself greater than the local sum.
# Time = O(n) | Space = O(1) 
# class Solution:
#     def maxSubArray(self, nums):
#         if len(nums) == 0:
#             return 0 
#         local, global_ = nums[0], nums[0]
        
#         for i in range(1,len(nums)):
#             local = max(nums[i], nums[i]+local)
#             global_ = max(global_, local)
        
#         return global_

# Method 2) For follow-up question, if asked, can you find the sub array with maximum sum. 
# Time = O(n) | Space = O(1) 

class Solution:
    def maxSubArray(self, nums):
        if len(nums) == 0:
            return 0 
        start, end = 0 , 0 
        local, global_ = nums[0], nums[0]
        k = 0 
        
        for i in range(1, len(nums)):
            if nums[i] > local + nums[i]:
                k = i 
                local = nums[i]
            else:
                start = k 
                local = local + nums[i]
            
            if global_ < local:
                global_ = local 
                end = i 
        
        print(start, end)
        return global_

if __name__ == "__main__":
    s = Solution()
    print(s.maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))