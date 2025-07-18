class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # Time: O(1) as in the constrains it's mentioned is i is <= 100
        # Space: O(1) In place
        i = len(nums) - 2
        # Until the breach is not found continue decreasing i
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        # when the breach is found check if i is there inside the array
        if i >= 0:
            # If i is found in the array swap the elements from i to the end
            for j in range(len(nums)-1,-1,-1):
                if nums[j] > nums[i]:
                    temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                    break
        # else just swap the whole array
        self.swap(nums, i+1, len(nums)-1)


# Function to swap the elements
    def swap(self,nums, left, right):
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1