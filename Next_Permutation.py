"""
Time Complexity : O(3n) but asymptotically O(n)- 3n as there are 3 steps with complexity n
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

This solution has 3 steps. First, we need to start from the back and see where the breach is happening. By
breach I mean, if all the numbers are in descending order, we cannot find a bigger permutation. But if we
start from back and find a number which is smaller than the number on its right, that is where we find a breach.
The second step would be to swap this breached number with next greater number. We can do it again by 
starting from the back and breaking as soon as we find next greater number. The third step would be to 
reverse the array from the next position of breached element to last position. We are doing this as it is
now in desc order, and we want the next permutation, so all the other numbers must be in ascending
number. Hence reverse. In case the numbers are already in descending order and there is no breach, step 2 wont
be performed and directly the number would be reversed.

"""

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None or len(nums) == 0:
            return 
        n = len(nums)
        # step 1 first breach
        for i in range(n-2, -2, -1):
            if nums[i] < nums[i+1]:
                break
        # step 2 next bigger int to swap
        if i >= 0:
            for j in range(n-1, -1, -1):
                if nums[j] > nums[i]:
                    nums[i], nums[j] = nums[j], nums[i]
                    break
        # step 3 reverse
        left = i+1
        right = n-1
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1
