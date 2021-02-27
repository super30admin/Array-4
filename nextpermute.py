class Solution:
    
    """
    Do not return anything, modify nums in-place instead.

    Approach: 3 steps:
    1. find where the number is less than preceeding number starting from the end, say index
    2. swap the number at the index found with the number just above from the end unless get out of bound
       - skip #2 if out of bounds
    3. reverse everything from the index + i to end of the array
    """ 
   
    def nextPermutation(self, nums: List[int]) -> None:
        

        if len(nums) == 1: return

        def reverse(i, j):
            while i < j:
                nums[i], nums[j] = nums[j], nums[i]
                i += 1; j -= 1

        for i in range(len(nums)-1,0,-1):
            if nums[i-1] < nums[i]:
                break

        # swap
        if i > 0:
            j = i
            while j < len(nums) and nums[i-1] < nums[j]:
                j += 1

        j -= 1
        nums[j], nums[i-1] = nums[i-1], nums[j]

        if j == 0: reverse(i - 1, len(nums) - 1)
        else: reverse(i, len(nums) - 1)
