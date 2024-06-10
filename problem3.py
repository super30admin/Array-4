#Time Complexity : O(n) iterating through the array
#Space Complexity : O(1)
#Any problem you faced while coding this : -

#The approach is to find the first number from the right that is smaller than the number to its right. We then find the number that is just greater than the number we found. We swap these two numbers. We then reverse the numbers from the number we found to the end of the array. This will give us the next permutation of the array.

class Solution:
    def reverse_nums(self, nums, l, r):
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1

    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None:
            return 

        n = len(nums)
        i = n-2

        while i >=0 and nums[i] >= nums[i+1]:
            i -= 1

        j = n-1
        if i >= 0:
            while nums[i] >= nums[j]:
                j -= 1
            
            nums[i], nums[j] = nums[j], nums[i]

        self.reverse_nums(nums, i+1, n-1)
        