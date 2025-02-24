'''
1. We find that number from the right which is breaking the increasing order from right to left - pivot
2. The next permutation would be obtained by swapping the first number > pivot encountered from right
3. We have to reverse the part to right of pivot to obtain the final lexicographical result

TC: O(n)
SC: O(1)
'''

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        if not nums or len(nums) == 0:
            return
        
        pivot = None

        for i in range(len(nums)-1, 0, -1):
            if nums[i-1] < nums[i]:
                pivot = i-1
                break
        
        if pivot is None:
            nums.reverse()
            return
        
        # Swap with 1st largest number from the right > pivot
        for i in range(len(nums) - 1, pivot, -1):
            if nums[i] > nums[pivot]:
                nums[i], nums[pivot] = nums[pivot], nums[i]
                break
        
        # Re arrange everything on right to pivot
        nums[pivot+1:] = reversed(nums[pivot+1:])