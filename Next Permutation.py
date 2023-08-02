# Time complexity : O(n)
# Space complexity : O(1)

# The code ran on Leetcode

# Traverse the array in reverse order. Find the first breach where arr[i] < arr[i+1]. Make another traversal to find the element that is <= breach. Swap the elements and reverse the array to the right side of breach

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n-2
        while i >= 0 and nums[i] >= nums[i+1]:
            i-=1
        j = n-1
        if i >= 0:
            while nums[i] >= nums[j]:
                j-=1
            nums[i], nums[j] = nums[j], nums[i]
        
        l = i+1; r = n-1
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l+=1; r-=1
        return nums
