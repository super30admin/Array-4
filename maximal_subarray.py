# Time Complexity :
# O(N)

# Space Complexity :
# O(1) - There is no auxillary space being allocated

# Did this code successfully run on Leetcode :
#Yes

#We go through the array and maintain a running sum. If the next element is greater than running sum+ next element, we update current sum to next element else we add the next element to current sum. 
#At each position, we check if the curr sum is greater than maxium sum found, we update it

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr_sum = 0
        slow = 0
        fast = 0 
        max_sum = -1 * 10**5

        while (fast<len(nums)):
            if curr_sum <= 0 and nums[fast] >= curr_sum :
                curr_sum = nums[fast]
            else :
                curr_sum += nums[fast]
            if curr_sum > max_sum :
                max_sum = curr_sum
            fast += 1
            
        return max_sum
