# Time Complexity : O(n) because we are iterating through the array
# Space Complexity : O(1) because we are not using any extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
The code iterates throught the array to find the first number that is smaller than the number to its right. 
Then the smallest number larger than that number is found and exchanged with it and finally the rest of the array is sorted.
"""

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for index in range(len(nums)-1, 0, -1):
            if nums[index] > nums[index-1]:
                switch = self.find_larger(index, nums[index-1], nums)
                nums[index-1], nums[switch] = nums[switch], nums[index-1]
                nums[index:] = sorted(nums[index:])
                return
      
        nums.reverse()

    def find_larger(self, index, number, nums):
        temp = float("inf")
        for i in range(index, len(nums)):
            if nums[i] > nums[index - 1] and nums[i] < temp:
                answer = i
        return answer