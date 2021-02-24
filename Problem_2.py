"""
Time Complexity : O(n)
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
We just need to maintain a running sum as well as a maximum sum. It is basically like a sliding window 
concept. We continuously check if current number added to previous sum will decrease the sum or increase
it. In case it increases it, that means we can broaden the the window.; In case the current number is 
greater than the runiing sum, that means we can discard the previous window and start from the current
position. Also, we keep on updating the maximum sum till now b y taking maximum of max and the running sum.
A follow up question could be to find that subarray. I have commented that solution. In such a scenario, we 
can maintain a start and an end pointer. Whenever we are starting a new window, we can update the start pointer.
Whenever we are updating maximum, we can update the end pointer.
"""


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        currsum = nums[0]
        maxsum = nums[0]
        for i in range(1, len(nums)):
            currsum = max(currsum+nums[i], nums[i])
            maxsum = max(maxsum, currsum)
        return maxsum
# class Solution:
#     def maxSubArray(self, nums: List[int]) -> int:
#         if not nums:
#             return 0
#         start=0
#         end=0
#         currsum=nums[0]
#         maxsum=nums[0]
#         for i in range(1,len(nums)):
#             if nums[i]>currsum+nums[i]:
#                 currsum=nums[i]
#                 start=i
#             else:
#                 currsum+=nums[i]
#             if currsum>maxsum:
#                 maxsum=currsum
#                 end=i
#         print("start,end ",start,end)
#         return maxsum
