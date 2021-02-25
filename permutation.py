# TC: O(N)
# SC: O(1)

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def reverse(arr, start, end):
            
            while start < end:
                temp = arr[start]
                arr[start] = arr[end]
                arr[end] = temp
                start += 1
                end -= 1
        
        n = len(nums) - 1
        j = n
        while j > 0 and nums[j] <= nums[j-1]:
            j -= 1
        
        if j == 0:
            reverse(nums, 0, n)
        else:
            swap = j-1
            reverse(nums, j, n)
            while j<n and nums[j] <= nums[swap]:
                j += 1
            temp = nums[swap]
            nums[swap] = nums[j]
            nums[j] = temp