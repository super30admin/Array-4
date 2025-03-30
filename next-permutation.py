# Time O(n)
# Space O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        # find action digit when num decreases
        action_idx = -1
        for i in range(n-2, -1, -1):
            if nums[i] < nums[i+1]:
                action_idx = i
                break
        if action_idx == -1: return self.reverse(0, n-1, nums)
        # find next bigger element to action digit
        bigE_idx = 0
        for i in range(n-1, action_idx, -1):
            if nums[i] > nums[action_idx]:
                bigE_idx = i
                break
        
        # swap elements
        nums[action_idx], nums[bigE_idx] = nums[bigE_idx], nums[action_idx]

        # reverse elements
        self.reverse(action_idx+1, n-1, nums)

    def reverse(self, left: int, right: int, nums: List[int]) -> None: 
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1
        