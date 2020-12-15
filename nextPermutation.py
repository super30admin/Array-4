#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return

        i = len(nums)-2
        #find first decreasing element
        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1

        #check if there has been any breach
        if i >= 0:
            j = len(nums)-1
            #find next greatest element than the element at index i
            while nums[i] >= nums[j]:
                j -= 1
            #swap elements
            nums[i], nums[j] = nums[j], nums[i]

        j = len(nums)-1
        i += 1
        #reverse the array from index i onwards
        while i < j:
            nums[i], nums[j] = nums[j], nums[i]
            i += 1
            j -= 1
