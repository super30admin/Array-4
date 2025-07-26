"""
TC: O(n)
SC: O(1)
Logic:
1. find break point
2. swap with first greatest element
3. reverse from breakpoint+1, end of list
"""
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def reverse(arr, l, r):
            while(l<r):
                arr[l], arr[r] = arr[r], arr[l]
                l+=1
                r-=1
            return arr
        break_point = -1
        for i in range(len(nums)-2,-1,-1):
            if nums[i]<nums[i+1]:
                break_point = i
                break
        if break_point == -1:
            reverse(nums,0, len(nums)-1)
        else:
            for i in range(len(nums)-1, break_point, -1):
                if nums[i]>nums[break_point]:
                    nums[i], nums[break_point] = nums[break_point], nums[i]
                    break
            nums = reverse(nums, break_point+1, len(nums)-1)